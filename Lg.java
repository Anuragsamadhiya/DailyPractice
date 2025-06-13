import java.util.HashMap;
import java.util.*;
public class Lg {
    public static void main(String[] args) {
        HashMap<Integer,Integer>mp=new HashMap<>();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            mp.put(arr[i],mp.getOrDefault(arr[i],0)+1);
        }

int[][]dp=new int[mp.size()][2];
int i=0;
for(Map.Entry<Integer,Integer>entry:mp.entrySet()){
    dp[i]=new int[]{entry.getKey(),entry.getValue()};
    i++;

}
Arrays.sort(dp,(a,b)->b[1]-a[1]);
int ans[]=new int[n];
int val=dp[0][0];
int freq=dp[0][1];
for(int k=1;k<dp.length;k++){

}
int q=1;
for(int m=0;m<n;m+=2){
    if(freq>0){
    ans[m]=val;
    freq--;}
    if(dp[q][1]<0)q++;yy
    ans[m+1]=dp[q][0];
    dp[q][1]--;
}
    }
}
