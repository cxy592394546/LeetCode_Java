package O.Q50;


import java.util.*;

public class Solution {
    public static void main(String[] args) {
        System.out.println(firstUniqChar("abcabc"));
    }

//    public static char firstUniqChar(String s) { // 超时
//        s += "#";
//        for (int i = 0; i < s.length(); i++) {
//            if (s.split(String.valueOf(s.charAt(i))).length == 2) return s.charAt(i);
//        }
//        return ' ';
//    }

    public static char firstUniqChar(String s) {
        HashMap<Character, Integer> map1 = new HashMap<>();
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            if (set.contains(s.charAt(i))) continue;
            if (map1.containsKey(s.charAt(i))) {
                set.add(s.charAt(i));
                map1.remove(s.charAt(i));
            } else map1.put(s.charAt(i), i);
        }
        if (map1.size() == 0) return ' ';
        int minKey = Integer.MAX_VALUE;
        char ret = ' ';
        Iterator iter = map1.entrySet().iterator();
        while (iter.hasNext()) {
            Map.Entry cur = (Map.Entry) iter.next();
            minKey = Math.min(minKey, (Integer) cur.getValue());
            ret = minKey == (Integer) cur.getValue() ? (char) cur.getKey() : ret;
        }
        return ret;
    }
}
