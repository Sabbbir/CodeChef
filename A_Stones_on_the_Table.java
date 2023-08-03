import java.util.Scanner;

/**
 * A_Stones_on_the_Table
 */
public class A_Stones_on_the_Table {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inp,count = 0;
        inp = sc.nextInt();
        String col = sc.next();

        for (int i = 1; i < inp ;i++) {
            if(col.charAt(i) == col.charAt(i-1)){
                count++;
            }


        }
        System.out.println(count);
    }
}