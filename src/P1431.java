import java.util.ArrayList;
import java.util.List;

public class P1431 {

    public static void main(String[] args) {

    }

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> kidsResults = new ArrayList<>();

        int maxCandies = Integer.MIN_VALUE;

        for (int candy : candies) {
            if (candy > maxCandies)
                maxCandies = candy;
        }

        for (int candy : candies) {
            kidsResults.add(candy + extraCandies >= maxCandies);
        }

        return kidsResults;
    }
}
