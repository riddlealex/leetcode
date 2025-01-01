package tasks;

public class ReverseWordsInAString151 {
    public static void main(String[] args) {
        String s = "just an example";
        System.out.println(reverseWords(s));
    }

    public static String reverseWords(String s) {
        String[] str = s.trim().split("\\s+");
        String out = "";

        for(int i = str.length - 1; i > 0; i--){
            out += str[i] + " ";
        }

        return out + str[0];
    }
}
