import java.util.Scanner;

/**
 * Bull_or_Bear
 */
 class Bull_or_Bear {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inp, i,j, k;
        inp = sc.nextInt();
        for( i = 0; i < inp; i++) {
            k = sc.nextInt();
            j = sc.nextInt();
            if(j>k){
                System.out.println("PROFIT");
            }
            else if(j==k){
            System.out.println("NEUTRAL");
            }
            else{
                System.out.println("LOSS");
            }
        }
    }
}