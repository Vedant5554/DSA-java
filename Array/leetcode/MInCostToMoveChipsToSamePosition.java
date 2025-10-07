//https://leetcode.com/problems/minimum-cost-to-move-chips-to-the-same-position/description/
//1217. Minimum Cost to Move Chips to The Same Position

public class MInCostToMoveChipsToSamePosition {
    public static void main(String[] args) {
        int[] position = {2,2,2,3,3};

        MInCostToMoveChipsToSamePosition calculator = new MInCostToMoveChipsToSamePosition();

        int result = calculator.minCostToMoveChips(position);

        System.out.println(result);
    }

    public int minCostToMoveChips(int[] position) {
        int even = 0;
        int odd = 0;

        for (int pos : position) {
            if (pos % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }

        return Math.min(even, odd);
    }
}
