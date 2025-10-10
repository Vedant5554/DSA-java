//https://leetcode.com/problems/first-bad-version/description/
//278. First Bad Version

package BS;

public class FirstBadVersion {

    private int bad = 1;
    public static void main(String[] args) {
        FirstBadVersion calculator = new FirstBadVersion();
        int n = 1;
        int root = calculator.firstBadVersion(n);
        System.out.println(root);
    }
    private boolean isBadVersion(int version) {
      if(version<bad){
          return false;
      }
      return true;
    }


    public int firstBadVersion(int n) {
        int s = 1;
        int e = n;
        while(s<e){
            int mid = s +(e-s)/2;

            if(isBadVersion(mid)){
                e = mid;
            }else {
                s = mid+1;
            }
        }
        return s;
    }


}
