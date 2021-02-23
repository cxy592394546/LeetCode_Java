package Q14_i;

public class cuttingRope {
    public int cuttingRope(int n) {
        if(n < 4){
            return n - 1;
        }
        int ret = 1;
        while(n > 4){
            ret *= 3;
            n -= 3;
        }
        if(n == 4)
            return 2 * 2 * ret;
        else return ret * n;
    }
}
