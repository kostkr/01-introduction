package uj.wmii.pwj.introduction;

public class Reverser {

    public String reverse(String input) {
        if(input == null)
            return null;
        else {
            StringBuilder sb = new StringBuilder(input.trim());
            sb.reverse();
            return sb.toString();
        }
    }

    public String reverseWords(String input) {
        String[] words = input.split("\\s+");
        StringBuilder sb = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            sb.append(words[i]);
            if(i > 0) sb.append(" ");
        }
        return sb.toString();
    }

}
