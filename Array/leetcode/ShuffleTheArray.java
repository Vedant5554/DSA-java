//1470. Shuffle the Array
//https://leetcode.com/problems/shuffle-the-array/description/

public class ShuffleTheArray {
    public static void main(String[] args) {

    }

    public int[] shuffle(int[] nums, int n) {
        int[] ans = new int[2*n];
        for(int i = 0; i <n;i++){
            ans[2*i]=nums[i];
            ans[(2*i) +1] = nums[i+n];


        }
        return ans;
    }
}
