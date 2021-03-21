package O.Q48;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("kgquqbcycmqtfkbem"));
    }

    public static int lengthOfLongestSubstring(String s) {
        if (s.length() < 2) return s.length();
        int res = 0;
        Set<Character> set = new HashSet<>();
        for(int l = 0, r = 0; r < s.length(); r++) {
            char c = s.charAt(r);
            while(set.contains(c)) {
                set.remove(s.charAt(l++));
            }
            set.add(c);
            res = Math.max(res, r - l + 1);
        }
        return res;
    }
//    public static int lengthOfLongestSubstring(String s) {// HashMap
//        if (s.length() < 2) return s.length();
//        char[] chars = s.toCharArray();
//        HashMap<Integer, Character> map = new HashMap<>();
//        int left = 0, max = 1;
//        for (int i = 0; i < chars.length; i++) {
//            if (map.containsValue(chars[i])) {
//                max = Math.max(i - left, max);
//                System.out.println(i + " " + left);
//                for (int j = left; j < i; j++) {
//                    map.remove(j);
//                    if(chars[j] == chars[i]) {
//                        left = j + 1;
//                        break;
//                    }
//                }
//            }
//            map.put(i ,chars[i]);
//        }
//        return Math.max(chars.length - left, max);
//    }
}
