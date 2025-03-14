import java.util.Scanner;
import java.util.HashMap;

class potd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string: ");
        String s = sc.next();
        System.out.println("Enter k: ");
        int k = sc.nextInt();
        sc.close();

        int arr[] = new int[s.length()];
        int min = s.length();

        // Precompute the nearest consonant index on the right for each position
        for (int i = s.length() - 1; i >= 0; i--) {
            if (!isVowel(s.charAt(i))) {
                min = i;
            }
            arr[i] = min; // Store the nearest consonant position
        }

        System.out.println("Valid substrings count: " + calculate(s, k, arr));
    }

    static boolean isVowel(char c) {
        return "aeiou".indexOf(c) != -1;
    }

    static int calculate(String s, int k, int ar[]) {
        HashMap<Character, Integer> mp = new HashMap<>();
        int i = 0, cons = 0, count = 0;

        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);

            if (isVowel(c)) {
                mp.put(c, mp.getOrDefault(c, 0) + 1);
            } else {
                cons++; // Count consonants
            }

while(cons>k){
     char startChar = s.charAt(i);
                if (!isVowel(startChar)) {
                    cons--; // Reduce consonant count
                } else {
                    if (mp.get(startChar) == 1) {
                        mp.remove(startChar);
                    } else {
                        mp.put(startChar, mp.get(startChar) - 1);
                    }
                }
                i++; /
}
            while (mp.size() == 5 && cons == k) { // When all vowels are present and k consonants exist
                count += ar[right] - right; // Calculate valid substrings

                char startChar = s.charAt(i);
                if (!isVowel(startChar)) {
                    cons--; // Reduce consonant count
                } else {
                    if (mp.get(startChar) == 1) {
                        mp.remove(startChar);
                    } else {
                        mp.put(startChar, mp.get(startChar) - 1);
                    }
                }
                i++; // Shrink window
            }
        }
        return count;
    }
}
