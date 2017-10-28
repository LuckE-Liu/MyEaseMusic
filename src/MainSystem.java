import com.google.gson.Gson;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * 运行的主函数
 * @author lucke
 */
public class MainSystem {
    //本草纲目            185882
    //Weight of the World 468490577
    //Life Will Change    454231736
    //エミール/ショップ   468490574
    //Катюша        29393429
    //again(TV size)       26137307

    public static void main(String[] args) throws IOException, InterruptedException {
        String confirmUpperY = "Y";
        String confirmLowerY = "y";

        Gson gson = new Gson();
        SongObject songObject = gson.fromJson(HttpRequestUtil.getJsonString(HttpRequestUtil.informationUrl), SongObject.class);
        LrcObject lrcObject = gson.fromJson(HttpRequestUtil.getJsonString(HttpRequestUtil.lrcUrl), LrcObject.class);
        SongUrlObject songUrlObject = gson.fromJson(HttpRequestUtil.getSongUrlData(new Long(songObject.getSongs().get(0).getId()).toString()),SongUrlObject.class);
        StringBuffer songName = FileSavesUtil.saveSongInfo(songObject);
        FileSavesUtil.saveLrc(songName, lrcObject);
        FileSavesUtil.saveSong(songUrlObject, songObject);

        Scanner scanner = new Scanner(System.in);
        System.out.println("是否展示,输入Y展示，其它结束");
        String choose = scanner.nextLine();

        if (confirmUpperY.equals(choose) || confirmLowerY.equals(choose)) {
            PrintLrc printLrc = new PrintLrc();
            printLrc.getLrcObject(lrcObject);
            printLrc.getSongObject(songObject);
            File music = new File("songs" + File.separator + songName.toString() + ".mp3");
            if (!music.exists()) {
                System.out.println("歌曲文件格式不支持");
            } else {
                AudioPlayer audioPlayer = new AudioPlayer(music);
                Thread musicThread = new Thread(audioPlayer);
                Thread lrcThread = new Thread(printLrc);
                musicThread.start();
                lrcThread.start();
            }
        }
    }
}
