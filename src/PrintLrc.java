import java.util.ArrayList;
import java.util.Scanner;

class PrintLrc implements Runnable {

    SongObject songObject;
    LrcObject lrcObject;

    public void getSongObject(SongObject songObject) {
        this.songObject = songObject;
    }

    public void getLrcObject(LrcObject lrcObject) {
        this.lrcObject = lrcObject;
    }

    public static void showSongInfo(SongObject songObject) {
        System.out.println("单曲:" + songObject.getSongs().get(0).getName());
        System.out.println("所属专辑:" + songObject.getSongs().get(0).getAlbum().getName());
        System.out.print("艺术家:");

        for (SongObject.Artists artists : songObject.getSongs().get(0).getArtists()) {
            System.out.print(artists.getName() + "/");
        }
        System.out.println("\b\n");
    }

    public static void showLrc(LrcObject lrcObject) throws InterruptedException {
        int firstStamp = 0;
        ArrayList<LrcUnit> mergedLrc = LrcAnalyserUtil.mergeLrcWithStamp(LrcAnalyserUtil.lrcSpilter(lrcObject.getLry().getLyric()), LrcAnalyserUtil.lrcSpilter(lrcObject.getTlyric().getLyric()));
        for (LrcUnit lrcUnit : mergedLrc) {
            int nextStamp = lrcUnit.getTimestamp();
            int sleepTime = nextStamp - firstStamp;
            if(nextStamp - firstStamp < Integer.MAX_VALUE / 2) {
                Thread.sleep(sleepTime);
                System.out.println(lrcUnit.getLrc());
                firstStamp = lrcUnit.getTimestamp();
            } else {
                Thread.sleep(10);
                System.out.println(lrcUnit.getLrc());
            }
        }
    }

    public static void show(SongObject songObject, LrcObject lrcObject) throws InterruptedException {
        if (lrcObject.isNolyric()) {
            System.out.println("纯音乐，请欣赏");
        } else if (lrcObject.isUncollected()) {
            System.out.println("歌词未收录");
            System.exit(0);
        } else {
            showSongInfo(songObject);
            showLrc(lrcObject);
        }
    }

    @Override
    public void run() {
        try {
            show(this.songObject, this.lrcObject);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
