import java.util.Scanner;

/**
 * A_Codeforces_Checking
 */
public class A_Codeforces_Checking {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inp = sc.nextInt();
        // String string = sc.nextLine();
        String ss = "codeforces";
        char cc ;
        for (int i = 0; i < inp; i++) {
            cc = sc.next().charAt(0);
           
            if(ss.contains(String.valueOf(cc))) {
                System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
}