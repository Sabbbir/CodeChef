import java.util.Scanner;

/**
 * A_Love_Story
 */
public class A_Love_Story {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String cf = "codeforces";
        int inp = sc.nextInt();
        int count ;
        String inpStr = "";
        for (int i = 0; i < inp; i++) {
            inpStr = sc.next();
            count = 0;
            for (int j = 0; j < 10; j++) {
                if (inpStr.charAt(j) != cf.charAt(j)) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
