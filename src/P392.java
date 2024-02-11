public class P392 {

    public static void main(String[] args) {
        System.out.println(isSubsequence("aaaaaa", "bbaaaa"));
    }

    public static boolean isSubsequence(String s, String t) {
        int si = 0;
        int ti = 0;

        while(si < s.length() && ti < t.length()) {
            while(ti < t.length() && s.charAt(si) != t.charAt(ti)) {
                ti++;
            }

            if(ti < t.length()) {
                si++;
                ti++;
            }
        }

        return si >= s.length();
    }
}
