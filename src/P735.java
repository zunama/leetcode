import java.util.Arrays;
import java.util.Stack;

public class P735 {
    public static void main(String[] args) {
        int[] r  = asteroidCollision(new int[] {-2,-1,1,2});

        System.out.println(Arrays.toString(r));
    }

    public static int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> left = new Stack<>();
        Stack<Integer> right = new Stack<>();

        left.push(asteroids[0]);

        for (int i = asteroids.length - 1; i > 0; i--) {
            right.push(asteroids[i]);
        }

        while (!left.isEmpty() && !right.isEmpty()) {
            int l = left.pop();
            int r = right.pop();

            if (sameSign(l, r) || movingAway(l, r)) {
                left.push(l);
                left.push(r);
            } else {
                int absL = Math.abs(l);
                int absR = Math.abs(r);

                if (absL > absR) {
                    left.push(l);
                } else if (absL < absR) {
                    right.push(r);
                }
            }

            if (left.isEmpty() && !right.isEmpty()) {
                left.push(right.pop());
            }
        }

        int[] ret = new int[left.size()];

        for (int i = ret.length - 1; i >= 0; i--) {
            ret[i] = left.pop();
        }

        return ret;
    }

    private static boolean movingAway(int l, int r) {
        return l < 0 && r < 0;
    }

    public static boolean sameSign(int a, int b) {
        return a > 0 && b > 0 || a < 0 && b < 0;
    }
}
