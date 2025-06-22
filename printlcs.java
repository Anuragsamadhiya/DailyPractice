import java.util.Scanner;
import java.util.Arrays;

public class printlcs {
    static int[][] dp;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first string: ");
        String s = sc.next();
        System.out.println("Enter second string: ");
        String s1 = sc.next();

        dp = new int[s.length()][s1.length()];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }

        findlcs(s, s1, 0, 0); 
        String lcs = printlcs(0, 0, s, s1); 
        System.out.println("Longest Common Subsequence: " + lcs);
    }

    static int findlcs(String tx, String tx2, int i, int j) {
        if (i >= tx.length() || j >= tx2.length()) return 0;

        if (dp[i][j] != -1) return dp[i][j];

        if (tx.charAt(i) == tx2.charAt(j)) {
            return dp[i][j] = 1 + findlcs(tx, tx2, i + 1, j + 1);
        } else {
            return dp[i][j] = Math.max(findlcs(tx, tx2, i + 1, j), findlcs(tx, tx2, i, j + 1));
        }
    }

    static String printlcs(int i, int j, String tx, String ts) {
        StringBuilder sb = new StringBuilder();
        while (i < tx.length() && j < ts.length()) {
            if (tx.charAt(i) == ts.charAt(j)) {
                sb.append(tx.charAt(i));
                i++;
                j++;
            } else if (j + 1 < ts.length() && (i + 1 >= tx.length() || dp[i][j + 1] >= dp[i + 1][j])) {
                j++;
            } else {
                i++;
            }
        }
        return sb.toString();
    }
}
