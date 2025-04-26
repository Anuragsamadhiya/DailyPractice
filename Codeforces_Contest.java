import java.util.*;
public class codeforces_Contest{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n-->0){
            String s=sc.next();
            int freq[]=new int[10];
            for(int i=0;i<s.length();i++){
                freq[s.charAt(i)-'0']++;
            }
            StringBuilder sb=new StringBuilder();
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)-'0'==10-i-1){
                freq[s.charAt(i)-'0']--;
                sb.append(s.charAt(i));
                }
                else{
                    int j=0;
                    while(freq[10-i+j-1]==0){
                         j++;
                         }
                         sb.append(10-i+j-1);
                         freq[10-i+j-1]--;
                }
            }
            System.out.println(sb.toString());
        }
        
    }
}