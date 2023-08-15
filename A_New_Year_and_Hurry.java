import java.util.Scanner;

/**
 * A_New_Year_and_Hurry
 */
public class A_New_Year_and_Hurry {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inp, time, time_taken = 0, count = 0 ;
        inp = sc.nextInt();
        time = sc.nextInt();
        
        int remaining = 240-time;
        for (int i = 1; i <= inp; i++) {
            time_taken += 5*i;
            if(time_taken<=remaining){
                count++;
            }

        }
        System.out.println(count);

    }
}