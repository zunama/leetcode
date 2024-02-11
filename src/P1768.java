public class P1768 {
    public static void main(String[] args) {
        String result = mergeAlternately("aaaaaaa", "bbbbbbbbbbbbb");
        System.out.println(result);
    }

    public static String mergeAlternately(String word1, String word2) {
        char[] zipped = new char[word1.length() + word2.length()];
        int ai = 0;
        int bi = 0;
        int zi = 0;

        while(zi < zipped.length) {
            if (ai < word1.length())
                zipped[zi++] = word1.charAt(ai++);

            if (bi < word2.length())
                zipped[zi++] = word2.charAt(bi++);
        }

        return new String(zipped);
    }
}
