package netease;

import java.util.ArrayList;
import java.util.List;

public class Api {
    private final static String BaseURL = "http://music.163.com/";


    /**
     * 获取歌曲URL
     * @param songId
     * @return
     */
    public static UrlParamPair getUrlOfSong(String songId) {
        List songids = new ArrayList();
        Integer songid = Integer.valueOf(songId);
        songids.add(songid);
        UrlParamPair upp = new UrlParamPair();
        upp.setUrl(BaseURL + "weapi/song/enhance/player/url?csrf_token=");
        upp.addPara("ids",songids);
        upp.addPara("br", 320000);
        upp.addPara("csrf_token", "nothing");
        return upp;
    }

}
