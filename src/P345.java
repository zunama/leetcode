public class P345 {
    public static void main(String[] args) {
        System.out.println(reverseVowels("leetcode"));
    }

    public static String reverseVowels(String s) {
        char[] word = s.toCharArray();

        int front = 0;
        int rear = word.length - 1;

        while (front < rear) {
            while(front < rear && !isVowel(word[front])) {
                front++;
            }

            while(front < rear && !isVowel(word[rear])) {
                rear--;
            }

            if(front < rear) {
                char temp = word[front];
                word[front] = word[rear];
                word[rear] = temp;
            }

            front++;
            rear--;
        }

        return new String(word);
    }

    public static boolean isVowel(char c) {
        return c =='a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
                c =='A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
    }
}
