import java.util.Scanner;

/**
 * Rating_Improvement
 */
class Rating_Improvement {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inp, i, f,s , v = 0;
        inp = scanner.nextInt();
        for (i = 0; i < inp; i++) {
            f = scanner.nextInt();
            s = scanner.nextInt();
            v = f+200;
            if(s>=f && s<=v){
                System.out.println("YES");

            }
            else{
                System.out.println("NO");
            }
        }
    }
}