import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class P2215 {
    public static void main(String[] args) {

    }

    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {

        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();


        for (int j : nums1) {
            if (!inArray(j, nums2)) {
                set1.add(j);
            }
        }

        for (int j : nums2) {
            if (!inArray(j, nums1)) {
                set2.add(j);
            }
        }

        List<List<Integer>> ret = new ArrayList<>();
        ret.add(new ArrayList<>(set1));
        ret.add(new ArrayList<>(set2));

        return ret;
    }

    public static boolean inArray(int x, int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == x)
                return true;
        }

        return false;
    }
}
