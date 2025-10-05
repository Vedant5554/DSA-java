import java.util.Arrays;

//1672. Richest Customer Wealth
//https://leetcode.com/problems/richest-customer-wealth/description/
public class RichestCustomer {
    public static void main(String[] args) {
        int[][] accounts = {{1,2,3},
                            {3,2,1}
        };

        RichestCustomer calculator = new RichestCustomer();
        int maxWealth = calculator.maximumWealth(accounts);

        System.out.println(maxWealth);
    }

    public int maximumWealth(int[][] accounts) {
        int ans = Integer.MIN_VALUE;
        for(int person = 0;person<accounts.length;person++){
            int sum = 0;
            for (int account = 0; account<accounts[person].length; account++){
                sum += accounts[person][account];
            }
            if(sum> ans){
                ans = sum;
            }
        }
        return ans;
    }
}
