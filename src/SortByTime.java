import java.util.Comparator;

/**
 * 按照时间戳由小到大排序
 * @author lucke
 */
public class SortByTime implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        LrcUnit lu1 = (LrcUnit)o1;
        LrcUnit lu2 = (LrcUnit)o2;
        if (lu1.getTimestamp() - lu2.getTimestamp() >= 0) {
            return 1;
        } else {
            return -1;
        }
    }
}


