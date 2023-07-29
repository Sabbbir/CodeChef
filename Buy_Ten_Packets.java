import java.util.Scanner;

/**
 * Buy_Ten_Packets
 */
class Buy_Ten_Packets {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inp, i, f, s, total;
        inp = sc.nextInt();
        for (i = 0; i < inp; i++) {
            f = sc.nextInt();
            s = sc.nextInt();

            total = f + (s*2);
            System.out.println(total);
        }
    }
}