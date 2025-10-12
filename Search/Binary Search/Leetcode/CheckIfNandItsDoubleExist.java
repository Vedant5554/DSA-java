//https://leetcode.com/problems/check-if-n-and-its-double-exist/description/
//1346. Check If N and Its Double Exist
package BS;

public class CheckIfNandItsDoubleExist {
    public static void main(String[] args) {
        CheckIfNandItsDoubleExist obj = new CheckIfNandItsDoubleExist();
        int[] arr = {10,2,5,3};
        boolean root = obj.checkIfExist(arr);
        System.out.println(root);
    }

    public boolean checkIfExist(int[] arr) {
        for(int i = 0;i<arr.length;i++){
            for (int j = 0; j < arr.length; j++){
                if(i!=j && arr[i]==2*arr[j]){
                    return true;
                }
            }
        }
        return false;
    }
}
