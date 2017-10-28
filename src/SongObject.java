import java.util.List;

/**
 * 用于保存由Json解析而来的歌曲信息
 * @author lucke
 */
class SongObject {

    private List<Songs> songs;
    private Equalizers equalizers;
    private int code;

    private SongObject() {

    }

    public static  SongObject getInstance() {
        return SongObjectInstance.INSTANCE;
    }

    private static class SongObjectInstance {
        private static final SongObject INSTANCE = new SongObject();
    }

    public List<Songs> getSongs() {
        return songs;
    }

    public void setSongs(List<Songs> songs) {
        this.songs = songs;
    }

    public Equalizers getEqualizers() {
        return equalizers;
    }

    public void setEqualizers(Equalizers equalizers) {
        this.equalizers = equalizers;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public class Songs {
        private String name;
        private long id;
        private int position;
        private List<String> alias;
        private int status;
        private int fee;
        private int copyrightId;
        private String disc;
        private int no;
        private List<Artists> artists;
        private Album album;
        private boolean starred;
        private int popularity;
        private int score;
        private int starredNum;
        private int duration;
        private long playedNum;
        private long dayPlays;
        private long hearTime;
        private String ringtone;
        private String crbt;
        private String audition;
        private String copyFrom;
        private String commentThreadId;
        private String rtUrl;
        private int ftype;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public long getId() {
            return id;
        }

        public void setId(long id) {
            this.id = id;
        }

        public int getPosition() {
            return position;
        }

        public void setPosition(int position) {
            this.position = position;
        }

        public List<String> getAlias() {
            return alias;
        }

        public void setAlias(List<String> alias) {
            this.alias = alias;
        }

        public int getStatus() {
            return status;
        }

        public void setStatus(int status) {
            this.status = status;
        }

        public int getFee() {
            return fee;
        }

        public void setFee(int fee) {
            this.fee = fee;
        }

        public int getCopyrightId() {
            return copyrightId;
        }

        public void setCopyrightId(int copyrightId) {
            this.copyrightId = copyrightId;
        }

        public String getDisc() {
            return disc;
        }

        public void setDisc(String disc) {
            this.disc = disc;
        }

        public int getNo() {
            return no;
        }

        public void setNo(int no) {
            this.no = no;
        }

        public List<Artists> getArtists() {
            return artists;
        }

        public void setArtists(List<Artists> artists) {
            this.artists = artists;
        }

        public Album getAlbum() {
            return album;
        }

        public void setAlbum(Album album) {
            this.album = album;
        }

        public boolean isStarred() {
            return starred;
        }

        public void setStarred(boolean starred) {
            this.starred = starred;
        }

        public int getPopularity() {
            return popularity;
        }

        public void setPopularity(int popularity) {
            this.popularity = popularity;
        }

        public int getScore() {
            return score;
        }

        public void setScore(int score) {
            this.score = score;
        }

        public int getStarredNum() {
            return starredNum;
        }

        public void setStarredNum(int starredNum) {
            this.starredNum = starredNum;
        }

        public int getDuration() {
            return duration;
        }

        public void setDuration(int duration) {
            this.duration = duration;
        }

        public long getPlayedNum() {
            return playedNum;
        }

        public void setPlayedNum(long playedNum) {
            this.playedNum = playedNum;
        }

        public long getDayPlays() {
            return dayPlays;
        }

        public void setDayPlays(long dayPlays) {
            this.dayPlays = dayPlays;
        }

        public long getHearTime() {
            return hearTime;
        }

        public void setHearTime(long hearTime) {
            this.hearTime = hearTime;
        }

        public String getRingtone() {
            return ringtone;
        }

        public void setRingtone(String ringtone) {
            this.ringtone = ringtone;
        }

        public String getCrbt() {
            return crbt;
        }

        public void setCrbt(String crbt) {
            this.crbt = crbt;
        }

        public String getAudition() {
            return audition;
        }

        public void setAudition(String audition) {
            this.audition = audition;
        }

        public String getCopyFrom() {
            return copyFrom;
        }

        public void setCopyFrom(String copyFrom) {
            this.copyFrom = copyFrom;
        }

        public String getCommentThreadId() {
            return commentThreadId;
        }

        public void setCommentThreadId(String commentThreadId) {
            this.commentThreadId = commentThreadId;
        }

        public String getRtUrl() {
            return rtUrl;
        }

        public void setRtUrl(String rtUrl) {
            this.rtUrl = rtUrl;
        }

        public int getFtype() {
            return ftype;
        }

        public void setFtype(int ftype) {
            this.ftype = ftype;
        }

        public List<String> getRtUrls() {
            return rtUrls;
        }

        public void setRtUrls(List<String> rtUrls) {
            this.rtUrls = rtUrls;
        }

        public int getCopyright() {
            return copyright;
        }

        public void setCopyright(int copyright) {
            this.copyright = copyright;
        }

        public int getRtype() {
            return rtype;
        }

        public void setRtype(int rtype) {
            this.rtype = rtype;
        }

        public String getRurl() {
            return rurl;
        }

        public void setRurl(String rurl) {
            this.rurl = rurl;
        }

        public int getMvid() {
            return mvid;
        }

        public void setMvid(int mvid) {
            this.mvid = mvid;
        }

        public BMusic getbMusic() {
            return bMusic;
        }

        public void setbMusic(BMusic bMusic) {
            this.bMusic = bMusic;
        }

        public String getMp3Url() {
            return mp3Url;
        }

        public void setMp3Url(String mp3Url) {
            this.mp3Url = mp3Url;
        }

        public MMusic getmMusic() {
            return mMusic;
        }

        public void setmMusic(MMusic mMusic) {
            this.mMusic = mMusic;
        }

        public LMusic getlMusic() {
            return lMusic;
        }

        public void setlMusic(LMusic lMusic) {
            this.lMusic = lMusic;
        }

        private List<String> rtUrls;
        private int copyright;
        private int rtype;
        private String rurl;
        private int mvid;
        private BMusic bMusic;
        private String mp3Url;
        private MMusic mMusic;
        private LMusic lMusic;

    }

    public class Artists {
        private String name;
        private long id;
        private long picId;
        private long img1v1Id;
        private String briefDesc;
        private String picUrl;
        private String img1v1Url;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public long getId() {
            return id;
        }

        public void setId(long id) {
            this.id = id;
        }

        public long getPicId() {
            return picId;
        }

        public void setPicId(long picId) {
            this.picId = picId;
        }

        public long getImg1v1Id() {
            return img1v1Id;
        }

        public void setImg1v1Id(long img1v1Id) {
            this.img1v1Id = img1v1Id;
        }

        public String getBriefDesc() {
            return briefDesc;
        }

        public void setBriefDesc(String briefDesc) {
            this.briefDesc = briefDesc;
        }

        public String getPicUrl() {
            return picUrl;
        }

        public void setPicUrl(String picUrl) {
            this.picUrl = picUrl;
        }

        public String getImg1v1Url() {
            return img1v1Url;
        }

        public void setImg1v1Url(String img1v1Url) {
            this.img1v1Url = img1v1Url;
        }

        public String getAlbumSize() {
            return albumSize;
        }

        public void setAlbumSize(String albumSize) {
            this.albumSize = albumSize;
        }

        public List<String> getAlias() {
            return alias;
        }

        public void setAlias(List<String> alias) {
            this.alias = alias;
        }

        public String getTrans() {
            return trans;
        }

        public void setTrans(String trans) {
            this.trans = trans;
        }

        public long getMusicSize() {
            return musicSize;
        }

        public void setMusicSize(long musicSize) {
            this.musicSize = musicSize;
        }

        private String albumSize;
        private List<String> alias;
        private String trans;
        private long musicSize;

    }

    public class Album {
        private String name;
        private long id;
        private String type;
        private int size;
        private long picId;
        private String blurPicUrl;
        private int companyId;
        private long pic;
        private String picUrl;
        private long publishTime;
        private String description;
        private String tags;
        private String company;
        private String briefDesc;
        private Artists artist;
        private List songs;
        private List<String> alias;
        private int status;
        private int copyrightId;
        private String commentThreadId;
        private List<Artists> artists;
        private String subType;
        private String picId_str;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public long getId() {
            return id;
        }

        public void setId(long id) {
            this.id = id;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public int getSize() {
            return size;
        }

        public void setSize(int size) {
            this.size = size;
        }

        public long getPicId() {
            return picId;
        }

        public void setPicId(long picId) {
            this.picId = picId;
        }

        public String getBlurPicUrl() {
            return blurPicUrl;
        }

        public void setBlurPicUrl(String blurPicUrl) {
            this.blurPicUrl = blurPicUrl;
        }

        public int getCompanyId() {
            return companyId;
        }

        public void setCompanyId(int companyId) {
            this.companyId = companyId;
        }

        public long getPic() {
            return pic;
        }

        public void setPic(long pic) {
            this.pic = pic;
        }

        public String getPicUrl() {
            return picUrl;
        }

        public void setPicUrl(String picUrl) {
            this.picUrl = picUrl;
        }

        public long getPublishTime() {
            return publishTime;
        }

        public void setPublishTime(long publishTime) {
            this.publishTime = publishTime;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getTags() {
            return tags;
        }

        public void setTags(String tags) {
            this.tags = tags;
        }

        public String getCompany() {
            return company;
        }

        public void setCompany(String company) {
            this.company = company;
        }

        public String getBriefDesc() {
            return briefDesc;
        }

        public void setBriefDesc(String briefDesc) {
            this.briefDesc = briefDesc;
        }

        public Artists getArtist() {
            return artist;
        }

        public void setArtist(Artists artist) {
            this.artist = artist;
        }

        public List getSongs() {
            return songs;
        }

        public void setSongs(List songs) {
            this.songs = songs;
        }

        public List<String> getAlias() {
            return alias;
        }

        public void setAlias(List<String> alias) {
            this.alias = alias;
        }

        public int getStatus() {
            return status;
        }

        public void setStatus(int status) {
            this.status = status;
        }

        public int getCopyrightId() {
            return copyrightId;
        }

        public void setCopyrightId(int copyrightId) {
            this.copyrightId = copyrightId;
        }

        public String getCommentThreadId() {
            return commentThreadId;
        }

        public void setCommentThreadId(String commentThreadId) {
            this.commentThreadId = commentThreadId;
        }

        public List<Artists> getArtists() {
            return artists;
        }

        public void setArtists(List<Artists> artists) {
            this.artists = artists;
        }

        public String getSubType() {
            return subType;
        }

        public void setSubType(String subType) {
            this.subType = subType;
        }

        public String getPicId_str() {
            return picId_str;
        }

        public void setPicId_str(String picId_str) {
            this.picId_str = picId_str;
        }
    }

    public class BMusic {
        private String name;
        private long id;
        private long size;
        private String extension;
        private long sr;
        private long dfsId;
        private int bitrate;
        private long playTime;
        private double volumeDelta;
        private String dfsId_str;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public long getId() {
            return id;
        }

        public void setId(long id) {
            this.id = id;
        }

        public long getSize() {
            return size;
        }

        public void setSize(long size) {
            this.size = size;
        }

        public String getExtension() {
            return extension;
        }

        public void setExtension(String extension) {
            this.extension = extension;
        }

        public long getSr() {
            return sr;
        }

        public void setSr(long sr) {
            this.sr = sr;
        }

        public long getDfsId() {
            return dfsId;
        }

        public void setDfsId(long dfsId) {
            this.dfsId = dfsId;
        }

        public int getBitrate() {
            return bitrate;
        }

        public void setBitrate(int bitrate) {
            this.bitrate = bitrate;
        }

        public long getPlayTime() {
            return playTime;
        }

        public void setPlayTime(long playTime) {
            this.playTime = playTime;
        }

        public double getVolumeDelta() {
            return volumeDelta;
        }

        public void setVolumeDelta(double volumeDelta) {
            this.volumeDelta = volumeDelta;
        }

        public String getDfsId_str() {
            return dfsId_str;
        }

        public void setDfsId_str(String dfsId_str) {
            this.dfsId_str = dfsId_str;
        }
    }

    public class MMusic {
        private String name;
        private long id;
        private long size;
        private String extension;
        private long sr;
        private long dfsId;
        private int bitrate;
        private long playTime;
        private double volumeDelta;
        private String dfsId_str;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public long getId() {
            return id;
        }

        public void setId(long id) {
            this.id = id;
        }

        public long getSize() {
            return size;
        }

        public void setSize(long size) {
            this.size = size;
        }

        public String getExtension() {
            return extension;
        }

        public void setExtension(String extension) {
            this.extension = extension;
        }

        public long getSr() {
            return sr;
        }

        public void setSr(long sr) {
            this.sr = sr;
        }

        public long getDfsId() {
            return dfsId;
        }

        public void setDfsId(long dfsId) {
            this.dfsId = dfsId;
        }

        public int getBitrate() {
            return bitrate;
        }

        public void setBitrate(int bitrate) {
            this.bitrate = bitrate;
        }

        public long getPlayTime() {
            return playTime;
        }

        public void setPlayTime(long playTime) {
            this.playTime = playTime;
        }

        public double getVolumeDelta() {
            return volumeDelta;
        }

        public void setVolumeDelta(double volumeDelta) {
            this.volumeDelta = volumeDelta;
        }

        public String getDfsId_str() {
            return dfsId_str;
        }

        public void setDfsId_str(String dfsId_str) {
            this.dfsId_str = dfsId_str;
        }
    }

    public class LMusic {
        private String name;
        private long id;
        private long size;
        private String extension;
        private long sr;
        private long dfsId;
        private int bitrate;
        private long playTime;
        private double volumeDelta;
        private String dfsId_str;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public long getId() {
            return id;
        }

        public void setId(long id) {
            this.id = id;
        }

        public long getSize() {
            return size;
        }

        public void setSize(long size) {
            this.size = size;
        }

        public String getExtension() {
            return extension;
        }

        public void setExtension(String extension) {
            this.extension = extension;
        }

        public long getSr() {
            return sr;
        }

        public void setSr(long sr) {
            this.sr = sr;
        }

        public long getDfsId() {
            return dfsId;
        }

        public void setDfsId(long dfsId) {
            this.dfsId = dfsId;
        }

        public int getBitrate() {
            return bitrate;
        }

        public void setBitrate(int bitrate) {
            this.bitrate = bitrate;
        }

        public long getPlayTime() {
            return playTime;
        }

        public void setPlayTime(long playTime) {
            this.playTime = playTime;
        }

        public double getVolumeDelta() {
            return volumeDelta;
        }

        public void setVolumeDelta(double volumeDelta) {
            this.volumeDelta = volumeDelta;
        }

        public String getDfsId_str() {
            return dfsId_str;
        }

        public void setDfsId_str(String dfsId_str) {
            this.dfsId_str = dfsId_str;
        }
    }

    private class Equalizers { }
}
