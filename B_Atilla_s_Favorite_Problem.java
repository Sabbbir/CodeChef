import java.util.Scanner;

/**
 * B_Atilla_s_Favorite_Problem
 */
public class B_Atilla_s_Favorite_Problem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inp, i,j, count = 0;
        inp = sc.nextInt();
        for (int k = 0; k < inp; k++) {
            int inp2 = sc.nextInt();
            String ss = sc.next();
            char[] c = ss.toCharArray();
            char max = 'a';
            for( i = 0; i<inp2; i++) {
                for(char ccc = 'a'; ccc< 'z'; ccc++) {
                if(c[i]>max){
                    max = c[i];
                    
                }
                
            }

        }
        // int aaa = Integer.parseInt(String.valueOf(max));
                    System.out.println(Character.getNumericValue(max)-9);

    }
    }
}