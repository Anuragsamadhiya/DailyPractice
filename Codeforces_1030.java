import java.util.Scanner;

public class Codeforces_1030 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // number of test cases
        while (n-- > 0) {
            int tc = sc.nextInt();   // total characters
            int no1 = sc.nextInt();  // number of 1s

            StringBuilder sb = new StringBuilder();
           int no0 = tc - no1 ;
            if (no1 > 0) {
                sb.append('1');
                no1--;  // already used one '1'
            }

             // subtract total used characters so far
            // Edge case fix: in case we never appended first '1', this prevents negative count

            // Append (no0 - 1) zeros (if any)
            for (int i = 0; i < no0-1; i++) {
                sb.append('0');
            }

            // Append remaining '1's
            for (int i = 0; i < no1; i++) {
                sb.append('1');
            }

            // If 1 zero still left, append it
            if (no0>=1) sb.append('0');

            System.out.println(sb.toString());
        }
    }
}