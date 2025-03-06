import java.util.*;
public class CodingNinjas{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        // System.out.println("Enter size of cost array:");
        int n=sc.nextInt();
        
        long[]cost=new long[n];
        for(int i=0;i<n;i++){
cost[i]=sc.nextInt();
        }
       long pfxsum[]=findprefix(cost);
       long sufx[]=findsuffix(cost);
            //    System.out.println("Enter size of ques array:");

       int noofques=sc.nextInt();
       long result[]=new long[3];
       while(noofques>0){
        int type=sc.nextInt();
        int l=sc.nextInt();
        int r=sc.nextInt();
        solve(result,type,l,r,pfxsum,sufx);
noofques--;

       }
    //    return result;
    }


    static long[]findprefix(long[]cost){
        long[]ans=new long[cost.length];
        ans[0]=cost[0];
        for(int i=1;i<ans.length;i++){
            ans[i]=ans[i-1]+cost[i];
        }
        return ans;
    }
   static long[]findsuffix(long[]cost){
        long arr[]=cost;
        Arrays.sort(arr);
        long[]ans=new long[arr.length];
        ans[0]=arr[0];
        for(int i=1;i<ans.length;i++){
            ans[i]=ans[i-1]+arr[i];
        }
        return ans;
    }

    static void solve(long[] rs,int type,int l,int r,long[]pfx,long[]sufx){
        if(type==1){
                    //  if(l==1)System.out.println("answer type 1 "+ans);

            long ans=l!=1?pfx[r-1]-pfx[l-2]:pfx[r-1];
            System.out.println(ans);
        }else{
long ans2=l!=1?sufx[r-1]-sufx[l-2]:sufx[r-1];
System.out.println(ans2);
        }
    }
}