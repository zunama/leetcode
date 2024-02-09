public class P605 {

    public static void main(String[] args) {

        boolean test = canPlaceFlowers(new int[]{0,0}, 2);
        System.out.println(test);
    }
    public static boolean canPlaceFlowers(int[] flowerbed, int n) {

        int placed = 0;

        for (int i = 0; i < flowerbed.length; i++) {

            boolean behindEmpty = i - 1 < 0 ? true : flowerbed[i-1] == 0;
            boolean middleEmpty = flowerbed[i] == 0;
            boolean frontEmpty = i + 1 == flowerbed.length ? true : flowerbed[i+1] == 0;

            if(behindEmpty && middleEmpty && frontEmpty) {
                placed++;
                flowerbed[i] = 1;
            }
        }

        return placed >= n;
    }
}
