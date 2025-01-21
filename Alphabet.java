public class Alphabet {
    public static void main(String[] args) {
        char[] words = new char[26];

        for (int i = 0; i < 26; i++) {
            words[i] = (char) ('A' + i);
        }

        for (int i = 0; i < words.length; i++) {
            if (i == words.length - 1) {
                System.out.print(words[i]);
                continue;
            }
            System.out.print(words[i] + ", ");
        }
    }
}
