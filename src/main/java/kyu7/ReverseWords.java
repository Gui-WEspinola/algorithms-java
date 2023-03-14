package kyu7;

public class ReverseWords {
    public static String reverseWords(final String original) {

        StringBuilder reversedWord = new StringBuilder();
        StringBuilder result = new StringBuilder();
        char c;

        for (int i = 0; i < original.length(); i++) {
            c = original.charAt(i);
            if (c != ' ') {
                reversedWord.append(c);
            }
            if (c == ' ' && i != 0 && original.charAt(i - 1) != ' ') {
                result.append(reversedWord.reverse());
                result.append(' ');
                reversedWord.delete(0, reversedWord.length());
            } else if (c == ' ') {
                result.append(' ');
            }
            if (i == original.length() - 1) {
                result.append(reversedWord.reverse());
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String string = "        ";

        System.out.println(reverseWords(string));

    }
}
