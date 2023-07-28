import java.util.Scanner;

/**
 * Candy_Store
 */
class Candy_Store {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inp, i, s, g, e;
        inp = sc.nextInt();
        for (i = 0; i < inp; i++) {
            g = sc.nextInt();
            s = sc.nextInt();
            if(s>g){

                e = (s-g)*2;
                System.out.println(g+e);

                
            }
            else {
                System.out.println(s);
            }
            
        }
    }
}