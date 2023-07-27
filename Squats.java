import java.util.Scanner;

class Squats {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inp, la;
        inp = sc.nextInt();
        for (int i = 0; i <inp; i++) {
            la = sc.nextInt();
           
            
            System.out.println(la*15);
        }
    }
}
