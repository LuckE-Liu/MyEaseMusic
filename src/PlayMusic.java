import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.*;

/***
 * 音乐播放器类
 * @author lt
 *  time 2016-7-5
 */
//继承自线程类Thread
class AudioPlayer implements Runnable {
    Player player;
    File music;

    //构造方法
    public AudioPlayer(File file) {
        this.music = file;
    }

    //重写run方法
    @Override
    public void run() {
        try {
            play();
            System.out.println("~~~~~~结束~~~~~~");
        } catch (FileNotFoundException | JavaLayerException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    //播放方法
    public void play() throws FileNotFoundException, JavaLayerException {

        BufferedInputStream buffer =
                new BufferedInputStream(new FileInputStream(music));
        player = new Player(buffer);
        player.play();
    }
}
