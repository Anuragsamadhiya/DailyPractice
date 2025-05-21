import java.util.*;

class OneBanc_assignment {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Word:- ");
        String a = sc.next();
//         System.out.println("Enter String B:- ");

//         String b = sc.next();
// System.out.println("Enter insertion cost-(Ci)");
// int Ci=sc.nextInt();
// System.out.println("Enter deletion cost-(Cd):- ");
// int Cd=sc.nextInt();
// System.out.println("Enter Substitution cost-(Cs):- ");
// int Cs=sc.nextInt();
        // int cost = get_Weighted_LevenshteinDistance(a, b,Ci,Cd,Cs);
         List<String> dictionary = Arrays.asList("cat", "bat", "rat", "drat", "dart");
        String ans=Pickword(a,dictionary);
        System.out.println("Closest word based on Minimum distance is- " + ans);
    }

    static int getLevenshteinDistance(String a, String b) {
        int n = a.length();
        int m = b.length();
        int[][] memotable = new int[n + 1][m + 1];

        for (int[] row : memotable) {
            Arrays.fill(row, -1);
        }

        return findDistance(a, b, 0, 0, memotable);
    }

    static int findDistance(String a, String b, int i, int j, int[][] memotable) {
        int n = a.length();
        int m = b.length();

        if (i >= n) return m - j;
        if (j >= m) return n - i;

        if (memotable[i][j] != -1) return memotable[i][j];

        if (a.charAt(i) == b.charAt(j)) {
            return memotable[i][j] = findDistance(a, b, i + 1, j + 1, memotable);
        } else {
            int delete = 1 + findDistance(a, b, i + 1, j, memotable);
            int insert = 1 + findDistance(a, b, i, j + 1, memotable);
            int replace = 1 + findDistance(a, b, i + 1, j + 1, memotable);
            return memotable[i][j] = Math.min(delete, Math.min(insert, replace));
        }
    }


    static int get_Weighted_LevenshteinDistance(String a, String b,int Ci,int Cd,int Cs) {
        int n = a.length();
        int m = b.length();
        int[][] memotable = new int[n + 1][m + 1];

        for (int[] row : memotable) {
            Arrays.fill(row, -1);
        }

        return find_Weighted_Distance(a, b, 0, 0,memotable,Ci,Cd,Cs);
    }

    static int find_Weighted_Distance(String a, String b, int i, int j, int[][] memotable,int insertcost,int deletecost,int substitutecost) {
        int n = a.length();
        int m = b.length();

        if (i >= n) return m - j;
        if (j >= m) return n - i;

        if (memotable[i][j] != -1) return memotable[i][j];

        if (a.charAt(i) == b.charAt(j)) {
            return memotable[i][j] = find_Weighted_Distance(a, b, i + 1, j + 1, memotable,insertcost,deletecost,substitutecost);
        } else {
            int delete = deletecost + find_Weighted_Distance(a, b, i + 1, j, memotable,insertcost,deletecost,substitutecost);
            int insert = insertcost + find_Weighted_Distance(a, b, i, j + 1, memotable,insertcost,deletecost,substitutecost);
            int replace = substitutecost + find_Weighted_Distance(a, b, i + 1, j + 1, memotable,insertcost,deletecost,substitutecost);
            return memotable[i][j] = Math.min(delete, Math.min(insert, replace));
        }
    }
     public static String Pickword(String input, List<String> dictionary) {
        String closestWord = null;
        int minDistance = Integer.MAX_VALUE;

        for (String word : dictionary) {
            int distance = getLevenshteinDistance(input, word);
            if (distance < minDistance) {
                minDistance = distance;
                closestWord = word;
            }
        }

        return closestWord;
    }
}
