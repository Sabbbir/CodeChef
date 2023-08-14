import java.util.Scanner;

/**
 * A_To_My_Critics
 */
public class A_To_My_Critics {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inp = sc.nextInt();
        int aa,bb,cc;
        String flag = "NO";
        for (int i = 0; i < inp; i++) {
                aa = sc.nextInt();
                bb = sc.nextInt();
                cc = sc.nextInt();
                if(aa+bb >=10 || bb+cc>=10 || aa+cc>=10){
                    flag = "YES";
                }
                else{
                    flag = "NO";
                }
                    System.out.println(flag);

        }
    }
}