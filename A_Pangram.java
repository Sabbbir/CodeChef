
import java.util.Scanner;

public class A_Pangram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.nextInt();
        String str = sc.next();
        int count = 0;
        for (char ch = 'a'; ch <= 'z'; ch++) {
            if (str.toLowerCase().contains(String.valueOf(ch)))
                count++;
        }
        if (count == 26)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
