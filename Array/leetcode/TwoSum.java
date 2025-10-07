//https://leetcode.com/problems/two-sum/description/
//1. Two Sum

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};

        TwoSum obj = new TwoSum();

        int[] result = obj.twoSum(nums,9);

        System.out.println(Arrays.toString(result));
    }

    public int[] twoSum(int[] nums, int target) {
        for (int i =0;i<nums.length;i++){
            for(int j = i+1 ; j<nums.length;j++){
                if((nums[i]+nums[j])== target){
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }
}
