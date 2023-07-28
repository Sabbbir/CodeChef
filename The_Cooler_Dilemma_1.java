import java.util.Scanner;

/**
 * The_Cooler_Dilemma_1
 */
class The_Cooler_Dilemma_1 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int inp, i, cpm, buy , month;
    inp = sc.nextInt();
    for( i=0; i<inp; i++) {
    cpm = sc.nextInt();
    buy = sc.nextInt();
    month = sc.nextInt();
    if(cpm * month >= buy) {
        System.out.println("NO");
    }
    else{
        System.out.println("YES");
    }
}

}
}