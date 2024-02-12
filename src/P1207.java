import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class P1207 {
    public static void main(String[] args) {

    }

    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int num : arr) {
            int count = map.getOrDefault(num, 0);
            map.put(num, count + 1);
        }

        var set = new HashSet<Integer>();

        for (var val : map.values()) {
            if (set.contains(val)) {
                return false;
            } else {
                set.add(val);
            }
        }

        return true;
    }
}
