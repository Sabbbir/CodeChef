import java.util.Scanner;

/**
 * A_Linear_Keyboard
 */
public class A_Linear_Keyboard {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inp, count = 0, neg = 0;
        

        inp = sc.nextInt();
        for (int i = 0; i < inp; i++) {
            int ans = 0;
            String keyboard = sc.next();
            String ss = sc.next();
            int[] sslen = new int[ss.length()];
            if (ss.length() == 1) {
                System.out.println("0");
            } else {

                for (int j = 0; j < ss.length(); j++) {
                    for (int x = 0; x < keyboard.length(); x++) {

                        if (ss.charAt(j) != keyboard.charAt(x)) {
                            
                            count++;
                        
                        } else if (ss.charAt(j) == keyboard.charAt(x)) {
                            
                            sslen[j] = count+1;
                            count = 0;
                            break;
                        }

                    }
                }
                for(int xxxx = 1; xxxx < sslen.length;xxxx++){
                    ans=ans+Math.abs(sslen[xxxx] - sslen[xxxx-1]);
                }
                System.out.println(ans);


            }


        }
    }
}