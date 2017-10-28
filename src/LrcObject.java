/**
 * 歌词对象
 * @author Lucke
 */
class LrcObject {
    private boolean uncollected;
    private boolean nolyric;
    private boolean sgc;
    private boolean sfy;
    private boolean qfy;
    private TransUser transUser;
    private LyricUser lyricUser;
    private Lrc lrc;
    private Klyric klyric;
    private Tlyric tlyric;
    private int code;

    private LrcObject() {

    }

    public static LrcObject getInstance() {
        return LrcObjectInstance.INSTANCE;
    }

    private static class LrcObjectInstance {
        private static final LrcObject INSTANCE = new LrcObject();
    }

    public boolean isSgc() {
        return sgc;
    }

    public void setSgc(boolean sgc) {
        this.sgc = sgc;
    }

    public boolean isSfy() {
        return sfy;
    }

    public void setSfy(boolean sfy) {
        this.sfy = sfy;
    }

    public boolean isQfy() {
        return qfy;
    }

    public void setQfy(boolean qfy) {
        this.qfy = qfy;
    }

    public TransUser getTransUser() {
        return transUser;
    }

    public void setTransUser(TransUser transUser) {
        this.transUser = transUser;
    }

    public LyricUser getLyricUser() {
        return lyricUser;
    }

    public void setLyricUser(LyricUser lyricUser) {
        this.lyricUser = lyricUser;
    }

    public Lrc getLry() {
        return lrc;
    }

    public void setLry(Lrc lrc) {
        this.lrc = lrc;
    }

    public Klyric getKlyric() {
        return klyric;
    }

    public void setKlyric(Klyric klyric) {
        this.klyric = klyric;
    }

    public Tlyric getTlyric() {
        return tlyric;
    }

    public void setTlyric(Tlyric tlyric) {
        this.tlyric = tlyric;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public class TransUser {
        private int id;
        private int status;
        private int demand;
        private int userid;
        private String nickname;
        private long uptime;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public int getStatus() {
            return status;
        }

        public void setStatus(int status) {
            this.status = status;
        }

        public int getDemand() {
            return demand;
        }

        public void setDemand(int demand) {
            this.demand = demand;
        }

        public int getUserid() {
            return userid;
        }

        public void setUserid(int userid) {
            this.userid = userid;
        }

        public String getNickname() {
            return nickname;
        }

        public void setNickname(String nickname) {
            this.nickname = nickname;
        }

        public long getUptime() {
            return uptime;
        }

        public void setUptime(long uptime) {
            this.uptime = uptime;
        }

    }

    public class LyricUser {
        private int id;
        private int status;
        private int demand;
        private int userid;
        private String nickname;
        private long uptime;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public int getStatus() {
            return status;
        }

        public void setStatus(int status) {
            this.status = status;
        }

        public int getDemand() {
            return demand;
        }

        public void setDemand(int demand) {
            this.demand = demand;
        }

        public int getUserid() {
            return userid;
        }

        public void setUserid(int userid) {
            this.userid = userid;
        }

        public String getNickname() {
            return nickname;
        }

        public void setNickname(String nickname) {
            this.nickname = nickname;
        }

        public long getUptime() {
            return uptime;
        }

        public void setUptime(long uptime) {
            this.uptime = uptime;
        }

    }

    public class Lrc {
        private int version;
        private String lyric;

        public int getVersion() {
            return version;
        }

        public void setVersion(int version) {
            this.version = version;
        }

        public String getLyric() {
            return lyric;
        }

        public void setLyric(String lyric) {
            this.lyric = lyric;
        }

    }

    public boolean isUncollected() {
        return uncollected;
    }

    public void setUncollected(boolean uncollected) {
        this.uncollected = uncollected;
    }

    public boolean isNolyric() {
        return nolyric;
    }

    public void setNolyric(boolean nolyric) {
        this.nolyric = nolyric;
    }

    public class Klyric {
        private int version;

        public int getVersion() {
            return version;
        }

        public void setVersion(int version) {
            this.version = version;
        }


    }

    public class Tlyric {
        private int version;
        private String lyric;

        public int getVersion() {
            return version;
        }

        public void setVersion(int version) {
            this.version = version;
        }

        public String getLyric() {
            return lyric;
        }

        public void setLyric(String lyric) {
            this.lyric = lyric;
        }

    }

}
