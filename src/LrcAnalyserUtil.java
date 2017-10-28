import java.util.ArrayList;

class LrcAnalyserUtil  {
    /**
     * 将json文件中的歌词字符串按照行分割
     * @param lrc
     * @return 保存了每行歌词的对象的ArrayList
     */
    public static ArrayList<LrcUnit> lrcSpilter(String lrc) {
        if (null == lrc) {
            return new ArrayList<>(0);
        }
        String[] sentences = lrc.split("\n");
        ArrayList<LrcUnit> spiltLrc = new ArrayList<>(sentences.length * 2);

        for (String temp : sentences) {
            spiltLrc.add(new LrcUnit(temp));
        }
        return spiltLrc;
    }

    public static ArrayList<LrcUnit> mergeLrcWithStamp(ArrayList<LrcUnit> nonTrans
            , ArrayList<LrcUnit> translated) {
        nonTrans.addAll(translated);
        nonTrans.sort(new SortByTime());

        return nonTrans;
    }
}
