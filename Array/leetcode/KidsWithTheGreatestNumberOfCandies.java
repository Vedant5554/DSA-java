//1431. Kids With the Greatest Number of Candies
//https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/description/
import java.util.ArrayList;
import java.util.List;

public class KidsWithTheGreatestNumberOfCandies {
    public static void main(String[] args) {
        int[] candies = {2, 3, 5, 1, 3};
        int extraCandies = 3;
        KidsWithTheGreatestNumberOfCandies solution = new KidsWithTheGreatestNumberOfCandies();
        List<Boolean> result = solution.kidsWithCandies(candies, extraCandies);

        System.out.println(result);
    }

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int maxCandies = candies[0];
        for(int i = 0;i<candies.length;i++){
            maxCandies = Math.max(maxCandies, candies[i]);
        }
        List<Boolean> result = new ArrayList<>();
        for (int candy : candies) {
            result.add(candy + extraCandies >= maxCandies);
        }

        return result;
    }
}
