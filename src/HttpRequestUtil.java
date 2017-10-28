import netease.Api;
import netease.UrlParamPair;
import org.jsoup.Connection;
import org.jsoup.Jsoup;
import secret.JSSecret;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * 发起http请求并获取结果  
 * @author lucke
 * @date 20171019
 */
public class HttpRequestUtil {
    private  HttpRequestUtil(){}

    public static HttpRequestUtil getInstance() {
        return GetHttpRequestUtil.INSTANCE;
    }

    private static class GetHttpRequestUtil {
        private static final HttpRequestUtil INSTANCE = new HttpRequestUtil();
    }

    static String informationUrl = UrlAssembler.songInformationUrl();
    static String lrcUrl = UrlAssembler.lrcUrl();

    /**
     * <br>从服务器获取JSON
     * @return 获取Json数据
     * @throws IOException
     */
    public static String getJsonString(String requestUrl) throws IOException {
        if (null == requestUrl) {
            throw new IllegalArgumentException("Url生成失败");
        }

        URL url = new URL(requestUrl);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.connect();
        InputStream inputStream = connection.getInputStream();
        //对应的字符编码转换
        Reader reader = new InputStreamReader(inputStream, "UTF-8");
        BufferedReader bufferedReader = new BufferedReader(reader);
        String str = null;
        StringBuffer sb = new StringBuffer();
        while ((str = bufferedReader.readLine()) != null) {
            sb.append(str);
        }
        reader.close();
        connection.disconnect();

        return sb.toString();
    }

    public static String getSongUrlData(String songId) throws IOException {
        String sid = songId;
        UrlParamPair upp2 = Api.getUrlOfSong(sid);

        String req_str = upp2.getParas().toJSONString();
        Connection.Response
                response = Jsoup.connect("http://music.163.com/weapi/song/enhance/player/url?csrf_token=")
                .userAgent("Mozilla/5.0 (Macintosh; Intel Mac OS X 10.12; rv:57.0) Gecko/20100101 Firefox/57.0")
                .header("Accept", "*/*")
                .header("Cache-Control", "no-cache")
                .header("Connection", "keep-alive")
                .header("Host", "music.163.com")
                .header("Accept-Language", "zh-CN,en-US;q=0.7,en;q=0.3")
                .header("DNT", "1")
                .header("Pragma", "no-cache")
                .header("Content-Type", "application/x-www-form-urlencoded")
                .data(JSSecret.getDatas(req_str))
                .method(Connection.Method.POST)
                .ignoreContentType(true)
                .timeout(10000)
                .execute();
        String list = response.body();
        return list;
    }
}  