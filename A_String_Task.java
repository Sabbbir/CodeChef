import java.util.Scanner;

public class A_String_Task {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        // char[] c = {'a', 'e', 'i', 'o', 'u'};

        StringBuilder ss = new StringBuilder();
        String sr=s.toLowerCase();

        for (int i = 0; i < sr.length(); i++) {
            // char currentChar = ss.charAt(i);

            // // Check if the current character is a vowel
            // for (char vowel : c) {
            // if (currentChar != vowel) {
            // ss.append(currentChar);
            // break;
            // }
            // }
            // System.out.println(ss);

            if (sr.charAt(i) != 'a' && sr.charAt(i) != 'e' && sr.charAt(i) != 'i' && sr.charAt(i) != 'o'&& sr.charAt(i) != 'u' && sr.charAt(i) != 'y'){
                // ss.append('.');
               ss.append('.');
                ss.append(sr.charAt(i));

            }

        }

        System.out.println(ss.toString());
    }
}
