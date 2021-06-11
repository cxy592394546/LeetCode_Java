package Normal.Pass;

import java.util.HashMap;

public class Q003 {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int ret = 0, left = -1;
        for(int i = 0; i < s.length(); i++){
            if(!map.containsKey(s.charAt(i))){
                map.put(s.charAt(i), i);
            }
            else{
                left = Math.max(left, map.get(s.charAt(i)));
                map.replace(s.charAt(i), i);
            }
            ret = Math.max(ret, i - left);
        }
        return ret;
    }
}
