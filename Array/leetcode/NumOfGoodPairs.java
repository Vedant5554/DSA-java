//1512. Number of Good Pairs
//https://leetcode.com/problems/number-of-good-pairs/
public class NumOfGoodPairs {
    public static void main(String[] args) {
        int[] inputNums = {1, 2, 3, 1, 1, 3}; // Example input from the problem

        // Create an instance of the class
        NumOfGoodPairs calculator = new NumOfGoodPairs();

        // Call the method
        int result = calculator.numIdenticalPairs(inputNums);

        // Print the result
        System.out.println(result);
    }

    public int numIdenticalPairs(int[] nums) {
        int goodpair = 0;
        for(int i = 0; i < nums.length;i++){
            for(int j = nums.length -1 ; j>0;j--){
                if(nums[i]==nums[j] && i<j){
                    goodpair += 1;
                }
            }
        }
        return goodpair;
    }
}
