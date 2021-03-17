package O.Q11;

public class minArray {
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }

    public int minArray(int[] numbers) {
        for(int i = 1; i < numbers.length; i++){
            if(numbers[i] < numbers[i - 1]){
                return numbers[i];
            }
        }
        return numbers[0];
    }
}
