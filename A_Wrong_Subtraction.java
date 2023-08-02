import java.util.Scanner;

/**
 * A_Wrong_Subtraction
 */
public class A_Wrong_Subtraction {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        int numb, iter;
        numb = sc.nextInt();
        iter = sc.nextInt();
        while (iter != 0){
            iter--;
            if(numb %10 != 0){
                numb --;
            }
                else{
                    numb = numb/10;
                }
        }
        System.out.println(numb);
    }
}