import java.util.Scanner;

/**
 * The_Rating_Dilemma
 */
 class The_Rating_Dilemma {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int inp, in, oo;
    inp = sc.nextInt();
    for(int i = 0;i<inp;i++) {
        in = sc.nextInt();
        System.out.println(-(in+1));
    }
}
    
}