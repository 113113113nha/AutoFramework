package libraries.utility;

import java.util.*;

/**
 * Created by User on 5/12/2016.
 */
public class Utilities {
    /**
     * Sorting List
     * @param list
     * @return list
     */
    public static List sortListAscending(List list) {
        Collections.sort(list);
        return list;
    }

    public static List sortListDescending(List list) {
        sortListAscending(list);
        Collections.reverse(list);
        return list;
    }

    public static String minList(List list) {
        return Collections.min(list).toString();
    }

    public static String maxList(List list) {
        return Collections.max(list).toString();
    }

    /**
     * Sorting Map
     * @param map
     * @return map
     */
    public static Map<String, Integer> sortMap(Map<String, Integer> map) {
        // Map -> List -> Sorting list -> toMap
        List<Map.Entry<String, Integer>> tempList = new ArrayList(map.entrySet());
        Collections.sort(tempList, new Comparator<Map.Entry<String, Integer>>() {
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return (o1.getValue()).compareTo(o2.getValue());
            }
        });
        Map sortedMap = new LinkedHashMap(); // Must use LinkedHashMap to get Sorted
        for (Map.Entry<String, Integer> o : tempList) {
            sortedMap.put(o.getKey(), o.getValue());
        }
        return sortedMap;
    }

}
