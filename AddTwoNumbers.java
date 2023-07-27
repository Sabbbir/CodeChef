import java.util.Scanner;

 class AddTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inp, i, j, k, sum = 0;
        inp = sc.nextInt();

        for (i = 0; i < inp; i++) {
            j = sc.nextInt();
            k = sc.nextInt();
            sum = j + k;
            System.out.println(sum);
        }
    }
}
