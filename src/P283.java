import java.util.Arrays;

public class P283 {
    public static void main(String[] args) {
        int[] nums = {0, 1, 2, 0, 3, 0};
        moveZeroes(nums);

        System.out.println(Arrays.toString(nums));
    }

    private static void moveZeroes(int[] nums) {
        int a = 0;
        int b = 0;

        while (a < nums.length &&  b < nums.length) {
            while (a < nums.length && nums[a] != 0) {
                a++;
                b++;
            }

            while (b < nums.length && nums[b] == 0) {
                b++;
            }

            if (a < nums.length &&  b < nums.length) {
                nums[a] = nums[b];
                nums[b] = 0;
                a++;
                b++;
            }
        }
    }
}
