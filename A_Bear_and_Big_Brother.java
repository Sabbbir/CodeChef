import java.util.Scanner;

/**
 * A_Bear_and_Big_Brother
 */
public class A_Bear_and_Big_Brother {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int limak, bob, count = 0;
        limak = sc.nextInt();
        bob = sc.nextInt();


        while(limak<bob || bob == limak) {
            limak = limak*3;
            bob = bob*2;
            count++;
            // System.out.println(limak+" "+bob+" "+count);
        }
        System.out.println(count);
        

    }
}