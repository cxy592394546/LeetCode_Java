package O.Q15;

public class hammingWeight {
    public int hammingWeight(int n) {
        int counter = 0;
        while(n != 0){
            n -= n&(-n);
            counter += 1;
        }
        return counter;
    }
}
