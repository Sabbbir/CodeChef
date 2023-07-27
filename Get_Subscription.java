import java.util.Scanner;

/**
 * Get_Subscription
 */
 class Get_Subscription {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inp, i,j;
        inp = sc.nextInt();
        for ( i = 0; i <inp; i++) {
            j = sc.nextInt();

            if(j <=30 && j>0){
                System.out.println("NO");
            }
            else{
                System.out.println("YES");
            }
        }
    }
}