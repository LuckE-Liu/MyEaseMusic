import java.util.Scanner;

/**
 * Url链接组装器
 * @author lucke
 */
public class UrlAssembler {
    private static Long songId = UrlAssembler.inputSongId();

    private UrlAssembler() {}

    public static UrlAssembler getInstance() {
        return UrlAssemblerInstance.INSTANCE;
    }

    private static class UrlAssemblerInstance {
        private static final UrlAssembler INSTANCE = new UrlAssembler();
    }

    public static String songInformationUrl() {
        return "http://music.163.com/api/song/detail/?id=" + songId.toString() + "&ids=%5B" + songId.toString() + "%5D";
    }

    public static String lrcUrl() {
        return "http://music.163.com/api/song/lyric?os=pc&id=" + songId.toString() + "&lv=-1&kv=-1&tv=-1";
    }

    private static long inputSongId() {
        System.out.println("请输入网易云上的歌曲ID");
        Scanner scanner = new Scanner(System.in);

        try {
            long songId = scanner.nextLong();
            scanner.nextLine();
            return songId;
        } catch (Exception e) {
            System.out.println("输入的歌曲ID无效，请重新输入");
            return inputSongId();
        }
    }

}
