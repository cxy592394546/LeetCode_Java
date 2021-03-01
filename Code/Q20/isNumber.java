package Q20;

public class isNumber {
    public boolean isNumber(String s) {
        if(s == null || s.length() == 0) return false;
        s = s.trim();
        char[] chars = s.toCharArray();
        boolean numFlag = false;
        boolean eFlag = false;
        boolean dotFlag = false;
        for(int i = 0; i < chars.length; i++ ){
            if(chars[i] == '+' || chars[i] == '-'){
                if(i == 0)
                    continue;
                else if(i > 0 && (chars[i - 1] == 'e' || chars[i - 1] == 'E'))
                    continue;
                else return false;
            }
            else if(chars[i] >= '0' && chars[i] <= '9'){
                numFlag = true;
            }
            else if(chars[i] == '.'){
                if(!dotFlag && !eFlag){
                    dotFlag = true;
                }
                else return false;
            }
            else if(chars[i] == 'e' || chars[i] == 'E'){
                if(!numFlag || eFlag == true) return false;
                numFlag = false;
                eFlag = true;
            }
            else return false;
        }
        return numFlag;
    }
}
