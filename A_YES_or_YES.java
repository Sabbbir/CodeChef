import java.util.Scanner;

/**
 * A_YES_or_YES
 */
public class A_YES_or_YES {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inp;
        inp = sc.nextInt();
        String yes;

        for (int i = 0; i <inp; i++) {
            yes = sc.next();
            String ll = yes.toLowerCase();
            if(ll.equals("yes")){
            System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
        
    }
}