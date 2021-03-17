package O.Q21;

public class exchange {  // 可以用双指针
    public int[] exchange(int[] nums) {
        if(nums.length == 0 || nums.length == 1) return nums;
        int temp;
        int flag = 0;
        int count = 0;
        for(int i = 0; i < nums.length - count; i++ ){
            if(nums[i] % 2 == 1) continue;
            flag = nums.length - count;
            while(nums[i] % 2 == 0){
                count++;
                if(count == flag || nums.length - count == i) return nums;
                temp = nums[i];
                nums[i] = nums[nums.length - count];
                nums[nums.length - count] = temp;
            }
        }
        return nums;
    }
}
