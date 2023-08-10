import java.math.BigDecimal;
import java.util.Scanner;

/**
 * A_Polycarp_and_the_Day_of_Pi
 */
public class A_Polycarp_and_the_Day_of_Pi {

    public static void main(String[] args) {
        String pp = "314159265358979323846264338327";
        char[] c = pp.toCharArray();
        int count = 0;

        Scanner sc = new Scanner(System.in);
        int inp = sc.nextInt();
        for (int i = 0; i < inp; i++) {

            String str = sc.next();
            char[] ss = str.toCharArray();
                count = 0;

            for (int j = 0; j < str.length(); j++) {

                if(ss[j]!=c[j]){
                    break;
                }
                else if(ss[j] == c[j]){
                    count++;
                }
                
                else{
                    count=0;
                }

            }
System.out.println(count);


        }
        // System.out.println(count);
    }
}