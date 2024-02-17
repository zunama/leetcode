import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Stack;

public class P841 {
    public static boolean canVisitAllRooms(List<List<Integer>> rooms) {
        Set<Integer> visited = new HashSet<>();
        Stack<Integer> keys = new Stack<>();

        visited.add(0);
        keys.addAll(rooms.get(0));

        while(!keys.isEmpty()) {
            Integer next = keys.pop();
            if(!visited.contains(next)) {
                visited.add(next);

                for (Integer room : rooms.get(next)) {
                    if (!visited.contains(room)) {
                        keys.push(room);
                    }
                }
            }
        }

        return visited.size() == rooms.size();
    }
}
