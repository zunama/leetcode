import java.util.LinkedList;
import java.util.Queue;

public class P933 {

    Queue<Integer> calls = new LinkedList<>();

    public int ping(int t) {
        calls.add(t);

        while(calls.peek() != null && calls.peek() < t - 3000) {
            calls.remove();
        }

        return calls.size();
    }
}
