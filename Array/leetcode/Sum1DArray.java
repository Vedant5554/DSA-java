//1480. Running Sum of 1d Array
//https://leetcode.com/problems/running-sum-of-1d-array/description/
import java.util.Arrays;

public class Sum1DArray {
    public static void main(String[] args) {
        int[] nums ={1,2,3,4};

        Sum1DArray obj = new Sum1DArray();

        int[] result = obj.runningSum(nums);

        System.out.println(Arrays.toString(result));
    }

    public int[] runningSum(int[] nums) {
        int sum=0 ;
        for (int i = 0 ; i<nums.length ; i++){
            sum += nums[i];
            nums[i]=sum;
        }
        return nums;
    }
}
