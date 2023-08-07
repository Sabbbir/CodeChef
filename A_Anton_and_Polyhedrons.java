import java.util.Scanner;

/**
 * A_Anton_and_Polyhedrons
 */
public class A_Anton_and_Polyhedrons {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int inp, count = 0;
        inp = sc.nextInt();
        for (int i = 0; i < inp; i++) {
            String word = sc.next();
            if(word.equals("Tetrahedron")){
                count+=4;
            }
            if(word.equals("Cube")){
                count+=6;

            }
            if(word.equals("Octahedron"))
            {
                count+=8;

            }
            if(word.equals("Dodecahedron"))
            {
                count+=12;

            }
            if(word.equals("Icosahedron"))
            {
                count+=20;

            }
            
        }
        System.out.println(count);

    }
}