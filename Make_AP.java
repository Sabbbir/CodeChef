import java.util.Scanner;

/**
 * Make_AP
 */
class Make_AP {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inp, i, f, s, d, sum = 0;
        inp = sc.nextInt();
        for ( i = 0; i < inp; i++){
            f = sc.nextInt();
            s = sc.nextInt();

            sum = f+s;

            d = sum/2;
            if(sum%2 == 0){
                System.out.println(d);
        }
        else{
            System.out.println(-1);
        }
    }
    }
}