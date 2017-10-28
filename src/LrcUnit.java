/**
 * 歌词单元，每行歌词均为一个单独的对象
 * @author lucke
 */
class LrcUnit {
    private String line;
    private int timestamp = Integer.MIN_VALUE;
    private String lrc;
    private static final String BEGIN_CHARS = "[by";
    private static final int INDEX_OF_THREE = 3;
    private static final char A = 'A';
    private static final char Z = 'Z';
    private static final char a = 'a';
    private static final char z = 'z';


    public LrcUnit(String lrcSentence) {
        boolean isSucceeded = false;
        if (BEGIN_CHARS.equals(lrcSentence.substring(0, INDEX_OF_THREE))) {
            setLine(lrcSentence);
            setLrc(lrcSentence, 2);
            timestamp = Integer.MAX_VALUE;
        } else {
            isSucceeded = setTimestamp(lrcSentence);
            if (isSucceeded) {
                setLrc(lrcSentence, 1);
                setLine(lrcSentence);
            } else {
                lrc = "";
                line = "";
            }
        }
    }

    private boolean setTimestamp(String lrcSentence) {
        boolean isUpper = lrcSentence.charAt(1) >= A && lrcSentence.charAt(1) <= Z;
        boolean isLower = lrcSentence.charAt(1) >= a && lrcSentence.charAt(1) <= z;

        if (isUpper || isLower ) {
            return false;
        }

        int timestampEndIndex = lrcSentence.indexOf(']');
        Integer min = Integer.valueOf(lrcSentence.substring(1, 3));
        Integer sec = Integer.valueOf(lrcSentence.substring(4,6));
        Integer miller = Integer.valueOf(lrcSentence.substring(7,timestampEndIndex));
        //TODO 有的sh后面是00]，有的是000],会报错 已解决√

        this.timestamp = min * 60 * 1000 + sec * 1000 + miller;
        //TODO 用时间戳表示歌词的情况下，有时中文歌词会在原文歌词上方，造成格式的不统一 已解决√
        return true;
    }

    private void setLine(String line) {
        this.line = line;
    }

    private void setLrc(String lrcSentence, int type) {
        int timestampEndIndex = lrcSentence.indexOf(']');
        if (timestampEndIndex != -1 && timestampEndIndex < lrcSentence.length() - 1) {
            String lrc = lrcSentence.substring(timestampEndIndex + 1);
            this.lrc = lrc;
        } else if (timestampEndIndex == lrcSentence.length() - 1) {
            String lrc = "";
            if (type == 1){
                lrc = "";
            } else {
                lrc = "歌词贡献者" + lrcSentence.substring(3, lrcSentence.length() - 1);
            }
            this.lrc = lrc;
        } else {
            this.lrc = lrcSentence;
        }
    }

    public String getLine() {
        return line;
    }

    public int getTimestamp() {
        return timestamp;
    }

    public String getLrc() {
        return lrc;
    }

    @Override
    public String toString() {
        return line;
    }
}
