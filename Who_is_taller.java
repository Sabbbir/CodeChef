import java.util.Scanner;

/**
 * Who_is_taller
 */
 class Who_is_taller {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int inp, a ,b;
    inp = sc.nextInt();
    for(int i = 0; i < inp; i++) {
        a = sc.nextInt();
        b = sc.nextInt();
        if(a <b && a!=b ){
            System.out.println("B");
        }
        else{
            System.out.println("A");
        }
    }
}
    
}