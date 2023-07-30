import java.util.Scanner;

/**
 * Valid_Pair
 */
class Valid_Pair {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int f,s,t;
            f = sc.nextInt();
            s = sc.nextInt();
            t = sc.nextInt();
            if((f == s || f== t || s == t)) {
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        
    }
}