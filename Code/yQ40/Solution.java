package yQ40;


import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[] nums = {3, 2, 1};
        int[] arr = getLeastNumbers(nums, 2);
        for (int i = 0; i < arr.length; i++)
            System.out.println(arr[i]);
        System.out.println(arr.length);
    }

    public static int[] getLeastNumbers(int[] arr, int k) {
        if (k == 0 || arr.length == 0) {
            return new int[0];
        }
        return quickSearch(arr, 0, arr.length - 1, k - 1);
    }

    private static int[] quickSearch(int[] nums, int lo, int hi, int k) {
        int j = sort(nums, lo, hi);
        if (j == k) {
            return Arrays.copyOf(nums, j + 1);
        }
        return j > k? quickSearch(nums, lo, j - 1, k): quickSearch(nums, j + 1, hi, k);
    }

    public static int sort(int[] arr, int l, int h) {
        int flag = arr[l];
        int i = l, j = h + 1;
        while (true) {
            while (++i <= h && arr[i] < flag) ;
            while (--j >= l && arr[j] > flag) ;
            if (i >= j) {
                break;
            }
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        arr[l] = arr[j];
        arr[j] = flag;
        return j;
    }
}
