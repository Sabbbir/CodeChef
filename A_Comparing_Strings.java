import java.util.Scanner;

public class A_Comparing_Strings {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String stringOne, stringTwo;

        stringOne = scan.nextLine();
        stringTwo = scan.nextLine();

        if (stringOne.length() != stringTwo.length()) {
            System.out.println("NO");
            System.exit(0);
        }

        int firstDiffIndex = -1;
        int secondDiffIndex = -1;
        int counter = 0;

        for (int i = 0; i < stringOne.length(); i++) {
            if (stringOne.charAt(i) != stringTwo.charAt(i)) {
                counter++;
                if (counter > 2) {
                    System.out.println("NO");
                    System.exit(0);
                }
                if (firstDiffIndex == -1) {
                    firstDiffIndex = i;
                } else {
                    secondDiffIndex = i;
                }
            }
        }

        if (counter == 2 && stringOne.charAt(firstDiffIndex) == stringTwo.charAt(secondDiffIndex)
            && stringOne.charAt(secondDiffIndex) == stringTwo.charAt(firstDiffIndex)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
