//https://leetcode.com/problems/search-insert-position/description/
//35. Search Insert Position
package BS;
public class SerachInsertPosition {
    public static void main(String[] args) {
        int[] nums = {1,3,5,6};
        SerachInsertPosition obj = new SerachInsertPosition();
        int result = obj.searchInsert(nums, 5);
        System.out.println(result);
    }

    public int searchInsert(int[] nums, int target) {

        if(target > nums[nums.length-1]){
            return nums.length;
        }

        int s = 0;
        int e = nums.length-1;

        while(s<=e){
            int mid = s+(e-s)/2;
            if(nums[mid]<target){
                s = mid +1;
            }else if(nums[mid]>target){
                e = mid-1;
            }else{
                return mid;
            }

        }
        return s;
    }
}
