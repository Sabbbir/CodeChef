import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 * B_Ten_Words_of_Wisdom
 */
public class B_Ten_Words_of_Wisdom {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc, a, b, n;
        tc= sc.nextInt();
        for (int i = 0; i < tc; i++) {
            n = sc.nextInt();
            int maxb, answer = 0;
            maxb = Integer.MIN_VALUE;
            for (int j = 0; j < n; j++) {
                a= sc.nextInt();
                b = sc.nextInt();
                if(a<=10 && b>maxb){
                    maxb = b;
                    answer = j+1;
                }
            } 
            System.out.println(answer);
        }
    }
}