package Q17;

public class printNumbers {
    public int[] printNumbers(int n) {
        int nums = 1;
        for(int i = 0; i < n; i++){
            nums *= 10;
        }
        int[] ret = new int[nums - 1];
        for(int i = 0; i < nums - 1; i++){
            ret[i] = i + 1;
        }
        return ret;
    }
}
