import java.util.Scanner;

/**
 * HOW_MANY_DIGITS_DO_I_HAVE
 */
class HOW_MANY_DIGITS_DO_I_HAVE {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num;
    num = sc.nextInt();
    int len = Integer.toString(num).length();
    if(len > 3) {
        System.out.println("More than 3 digits");
    }
    else{
        System.out.println(len);
    }

}
}