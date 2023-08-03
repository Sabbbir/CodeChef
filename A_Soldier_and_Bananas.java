import java.util.Scanner;

/**
 * A_Soldier_and_Bananas
 */
public class A_Soldier_and_Bananas {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fbanap, Shas, Swants, Ptotal = 0;
        fbanap = sc.nextInt();
        Shas = sc.nextInt();
        Swants = sc.nextInt();
        for(int i = 1; i <=Swants; i++) {
            Ptotal += fbanap*i;
            // System.out.println(Ptotal);
        }
        if(Ptotal>Shas) {
            System.out.println(Ptotal-Shas);


    }else{
        System.out.println(0);
    }
}
}