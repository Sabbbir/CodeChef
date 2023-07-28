import java.util.Scanner;

/**
 * Chefland_Games
 */
class Chefland_Games {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inp, i, f, s, t, forth, sum;
        inp = sc.nextInt();
        for (i = 0; i < inp; i++) {
            f = sc.nextInt();
            s = sc.nextInt();
            t = sc.nextInt();
            forth = sc.nextInt();
            sum = f+s+t+forth;
            if(sum >0){
                System.out.println("OUT");
            }
            else{
                System.out.println("IN");
            }

        }
    }
}