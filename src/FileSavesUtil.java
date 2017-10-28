import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

/**
 * 文件存储工具
 * @author lucke
 */
public class FileSavesUtil {
    //TODO 纯音乐会报NullPointerException 已解决√
    //TODO 音乐不存在会报IndexOutOfBoundsException 已解决√
    /**
     * 确认常量
     */
    private static final String CONFIRM_1 = "y";
    private static final String CONFIRM_2 = "Y";

    public FileSavesUtil() throws IOException {
    }

    public static StringBuffer saveSongInfo(SongObject songObject) throws IOException {
        int unExceptedCharIndex = -1;
        StringBuffer songName = new StringBuffer(songObject.getSongs().get(0).getName());
        unExceptedCharIndex = songName.indexOf("/");
        if (unExceptedCharIndex != -1) {
            songName.setCharAt(unExceptedCharIndex, '／');
        }

        File saveDir = new File ("lrc");
        if (!saveDir.exists()) {
            boolean isSucceed = saveDir.mkdir();
        }

        if (songObject.getSongs().size() == 0) {
            System.out.println("所查询的音乐不存在");
            System.exit(0);
        }

        File savedAs = new File("lrc" + File.separator + songName.toString() + ".txt");

        if (savedAs.exists()) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("歌词已经存在，如要覆盖请输入Y,不覆盖输入其他");
            String confirm = scanner.nextLine();

            if (CONFIRM_1.equals(confirm) || CONFIRM_2.equals(confirm)) {
                System.out.println("已被覆盖");
            } else {
                return songName;
            }
        }

        //TODO 检测并创建创建文件夹 + 检测源文件是否存在避免重复写入（提示：是否覆盖Y/N） 已解决√
        FileWriter fw = new FileWriter(savedAs);
        //TODO 很罕见的情况会出现歌曲名中有'/'468490574 C:\Users\msi-pc\Desktop\lrc\エミール\ショップ.txt (系统找不到指定的路径。) 已解决√
        BufferedWriter bufferedWriter = new BufferedWriter(fw);

        bufferedWriter.write("[ti:" + songName.toString() + "]");
        bufferedWriter.write("\n[ar:" + songObject.getSongs().get(0).getArtists().get(0).getName() + "]");
        bufferedWriter.write("\n[al:" + songObject.getSongs().get(0).getAlbum().getName() + "]\n");

        bufferedWriter.close();

        return songName;
    }

    public static void saveLrc(StringBuffer songName, LrcObject lrcObject) throws IOException {
        File savedAs = new File( "lrc" + File.separator + songName.toString() + ".txt");

        FileWriter fw = new FileWriter(savedAs, true);
        BufferedWriter bufferedWriter = new BufferedWriter(fw);

        if (lrcObject.isUncollected()) {
            bufferedWriter.write("\n音乐歌词未收录");
        } else if (lrcObject.isNolyric()) {
            bufferedWriter.write("\n纯音乐，请欣赏");
        } else {
            if (lrcObject.getLry().getLyric() != null) {
                bufferedWriter.write(lrcObject.getLry().getLyric());
            }
            if (lrcObject.getTlyric().getLyric() != null) {
                bufferedWriter.write(lrcObject.getTlyric().getLyric());
            }
        }
        bufferedWriter.close();
    }

    public static void saveSong(SongUrlObject songUrlObject, SongObject songObject) {

            Scanner scanner = new Scanner(System.in);
            System.out.println("是否保存,如要保存请输入Y,不保存输入其他");

            String doSave = scanner.nextLine();
            if (!CONFIRM_1.equals(doSave) && !CONFIRM_2.equals(doSave)) {
                return;
            }

            int unExceptedCharIndex = -1;
            StringBuffer songName = new StringBuffer(songObject.getSongs().get(0).getName());
            unExceptedCharIndex = songName.indexOf("/");
            if (unExceptedCharIndex != -1) {
                songName.setCharAt(unExceptedCharIndex, '／');
            }

            File saveDir = new File("songs");
            if (!saveDir.exists()) {
                boolean isSucceed = saveDir.mkdir();
            }

            File savedAs = new File("songs" + File.separator + songName.toString() + "." + songUrlObject.getData().get(0).getType());

            if (savedAs.exists()) {
                System.out.println("歌曲已经存在，如要覆盖请输入Y,不覆盖输入其他");
                String confirm = scanner.nextLine();

                if (CONFIRM_1.equals(confirm) || CONFIRM_2.equals(confirm)) {
                    System.out.println("正在保存歌曲...");
                } else {
                    System.out.println("未覆盖");
                    return;
                }
            }

            try {
            StringBuffer songUrl = new StringBuffer(songUrlObject.getData().get(0).getUrl());


            URL url = new URL(songUrl.toString());
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.connect();
            InputStream inputStream = connection.getInputStream();
            BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);

            OutputStream outputStream = new FileOutputStream(savedAs);
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(outputStream);

            int count = -1;
            Object songSize;
            if (songUrlObject.getData().get(0).getSize() < Integer.MAX_VALUE) {
                songSize = songUrlObject.getData().get(0).getSize();
            } else {
                songSize = Integer.MAX_VALUE;
            }
            byte[] buffer = new byte[(int) songSize];
            while ((count = bufferedInputStream.read(buffer)) != -1) {
                bufferedOutputStream.write(buffer, 0, count);
            }
            bufferedOutputStream.close();
            bufferedInputStream.close();
            connection.disconnect();
            System.out.println("保存完毕");
            //TODO 歌曲杂音严重 已解决√
        } catch (Exception e) {
            System.out.println("文件保存失败，请检查您的网络连接");
        }
    }

}
