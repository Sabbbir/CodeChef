import java.util.Scanner;

/**
 * Maximum_Production
 */
class Mileage_matters {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inp , i, dis ;
        float p,d , pp, dp, pd, dd;
        inp = sc.nextInt();
        for(i = 0; i < inp; i++) {
            dis = sc.nextInt();
            pp = sc.nextFloat();
            dp = sc.nextFloat();
            pd =sc.nextFloat();
            dd = sc.nextFloat();



            p = (pp/pd)*dis;
            d = (dp/dd)*dis;

            if(p>d){
                System.out.println("DIESEL");
            }
            else if (p==d){
                System.out.println("ANY");
            }
            else{
                System.out.println("PETROl");
            }

        }
    }
}