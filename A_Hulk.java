import java.util.Scanner;

/**
 * A_Hulk
 */
public class A_Hulk {

    public static void main(String[] args) {

        int inp, i = 0;
        Scanner sc = new Scanner(System.in);
        inp = sc.nextInt();

        StringBuilder sb = new StringBuilder();

        for (i = 1; i <= inp; i++) {
            sb.append("I ");
            if (i % 2 == 1) {
                sb.append("hate");
            } else {
                sb.append("love");
            }
            if (i < inp) {
                sb.append(" that ");
            }
        }
        sb.append(" it");
        System.out.print(sb.toString());
    }
}