//1920. Build Array from Permutation
//https://leetcode.com/problems/build-array-from-permutation/description/


import java.util.Arrays;

public class ArrayFromPermutation {
    public static void main(String[] args) {
        int[] nums = {0, 2, 1, 5, 3, 4};

        ArrayFromPermutation obj = new ArrayFromPermutation();

        int[] result = obj.buildArray(nums);

        System.out.println(Arrays.toString(result));
    }

    public int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];
        for(int i = 0;i < nums.length;i++){
            ans[i] = nums[nums[i]];

        }
        return ans;
    }
}
