import java.util.Scanner;

/**
 * A_Vanya_and_Fence
 */
public class A_Vanya_and_Fence {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int np, h, sh, count = 0;
        np = sc.nextInt();
        h = sc.nextInt();
        for (int i = 0; i < np; i++) {
            sh = sc.nextInt();
            if(sh>h){
                count+=2;
            }
            else{
                count++;
            }
        }
        System.out.println(count);
    }
}