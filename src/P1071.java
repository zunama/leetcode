public class P1071 {
    public static void main(String[] args) {
        String results = gcdOfStrings("ABABAB", "ABAB");
        System.out.println(results);
    }
    public static String gcdOfStrings(String str1, String str2) {

        if(!str1.concat(str2).equals(str2.concat(str1))) {
            return "";
        }

        int gcd = getGcd(str1.length(), str2.length());

        return str2.substring(0, gcd);
    }

    private static int getGcd(int a, int b) {
        return (b == 0)? a : getGcd(b, a % b);
    }
}
