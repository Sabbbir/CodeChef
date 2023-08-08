import java.util.Scanner;

/**
 * A_Square_String
 */
public class A_Square_String {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inp = sc.nextInt();
        String ss;

        
        for (int i = 0; i < inp; i++) {
            ss = sc.next();

            if (ss.length() % 2 == 1) {
                System.out.println("NO");
            }

            else if (ss.length() % 2 == 0) {
                String fh = ss.substring(0, (ss.length() / 2));
                String sh = ss.substring((ss.length() / 2), ss.length());
    
                if (fh.equals(sh)) {
                    System.out.println("YES");

                }
                else
                System.out.println("NO");

            }
        }
    }
}