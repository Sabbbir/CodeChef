import java.util.Scanner;

/**
 * Chef_and_Chapters
 */
class Chef_and_Chapters {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inp, f,s,t;
        inp = sc.nextInt();
        for (int i = 0; i < inp; i++) {
        f = sc.nextInt();
        s = sc.nextInt();
        t = sc.nextInt();
        System.out.println(f*s*t);
        }
    }
}