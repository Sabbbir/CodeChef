import java.util.Scanner;

/**
 * Area_OR_Perimeter
 */
class Area_OR_Perimeter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l,b;
        float area, peri;
        l = sc.nextInt();
        b = sc.nextInt();

        area = l*b;
        peri = 2*(b+l);
        if(peri>area){
            System.out.println("Peri\n"+(int)peri);
        }
    else if(peri==area){
            System.out.println("Eq"+" "+((int)area));
    }
    else{
        System.out.println("Area"+" "+((int)area));
    }
    }
}