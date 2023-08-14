import java.util.Scanner;

/**
 * A_I_love_username
 */
public class A_I_love_username {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inp, count = 0;

        inp = sc.nextInt();
        int[] a = new int[inp];
        for (int i = 0; i < inp; i++) {
            a[i] = sc.nextInt();
            
        }

        int max = a[0];
        int min = a[0];
        for (int i = 0; i < inp; i++) {
            if(a[i]>max){
                max= a[i];
                count++;
            }
            if(a[i]<min){
                min= a[i];
                count++;

            // System.out.println(a[i]);
        }

    }
                    System.out.println(count);

    }
}
