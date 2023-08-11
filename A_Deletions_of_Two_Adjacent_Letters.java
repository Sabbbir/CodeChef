import java.util.Scanner;

public class  A_Deletions_of_Two_Adjacent_Letters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        while (t-- > 0) {
            String s = scanner.nextLine();
            char c = scanner.nextLine().charAt(0);

            if (canConvertToTarget(s, c)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

    static boolean canConvertToTarget(String s, char c) {
        int mid = s.length() / 2;

        if (s.charAt(mid) == c) {
            return true;
        }

        for (int i = 0; i < mid; i++) {
            if (s.charAt(i) == c && s.charAt(s.length() - 1 - i) == c) {
                return true;
            }
        }

        return false;
    }
}
