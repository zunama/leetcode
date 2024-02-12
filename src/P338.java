import java.util.Arrays;

public class P338 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(countBits(7)));
    }

    public static int[] countBits(int n) {
        int[] ret = new int[n+1];

        for(int i = 1; i <= n; i++) {
            int count = 0;
            int num = i;
            while (num != 0) {
                count += num & 1;
                num = num >> 1;
            }
            ret[i] = count;
        }

        return ret;
    }
}
