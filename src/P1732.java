public class P1732 {
    public static void main(String[] args) {
        System.out.println(largestAltitude(new int[] {-5,1,5,0,-7}));
    }

    public static int largestAltitude(int[] gain) {
        int maxAltitude = 0;
        int sum = 0;

        for (int i = 0; i < gain.length; i++) {
            sum += gain[i];
            if(sum > maxAltitude) {
                maxAltitude = sum;
            }
        }

        return maxAltitude;
    }
}
