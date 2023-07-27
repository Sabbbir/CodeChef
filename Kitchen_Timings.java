import java.util.Scanner;

/**
 * Kitchen_Timings
 */
public class Kitchen_Timings {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inp, s,f, h;
        inp = sc.nextInt();
        for (int i = 0; i <inp; i++) {
            s = sc.nextInt();
            f = sc.nextInt();
            h = f-s;
            System.out.println(h);
    }
}
}