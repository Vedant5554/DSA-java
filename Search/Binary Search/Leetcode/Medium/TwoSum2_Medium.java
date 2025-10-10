//https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/description/
//167. Two Sum II - Input Array Is Sorted
package BS;

import java.util.Arrays;

public class TwoSum2_Medium {
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};

        TwoSum2_Medium obj = new TwoSum2_Medium();

        int[] result = obj.twoSum(nums,9);

        System.out.println(Arrays.toString(result));
    }

    public int[] twoSum(int[] numbers, int target) {
        for (int i = 0;i<numbers.length-1;i++){
            int num = target - numbers[i];
            int s = i +1;
            int e = numbers.length-1;

            while(s<=e){
                int mid = s+(e-s)/2;

                if(numbers[mid] == num){
                    return new int[] {i+1,mid+1};
                }else if (numbers[mid]<num){
                    s = mid +1;
                }else {
                    e = mid -1;
                }
            }
        }

        return new int[] {-1,-1};
    }
}
