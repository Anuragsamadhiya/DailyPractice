import java.util.*;

public class CodingNinjas1155a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        String s = sc.next();

        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) > s.charAt(i + 1)) {
                System.out.println("YES");
                System.out.println((i + 1) + " " + (i + 2));
                break;
            }
            if (i == s.length() - 2) {
                System.out.println("NO");
                break;
            }
        }
    }
}
