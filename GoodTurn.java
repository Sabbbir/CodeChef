import java.util.Scanner;

 class GoodTurn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inp, i, j, k, sum = 0;
        inp = sc.nextInt();

        for (i = 0; i < inp; i++) {
            j = sc.nextInt();
            k = sc.nextInt();
            sum = j + k;
            if(((j >= 1 && j<=6) && (k>=1 && k<=6)) && sum>6){
            System.out.println("YES");

            }
            else{
                System.out.println("NO");
            }
        }
    }
}
