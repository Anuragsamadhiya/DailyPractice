import java.util.*;
class Combination1{
    static ArrayList<Integer>ll=new ArrayList();

    public static void main(String[]args){
        System.out.println("Enter size of aaray: ");
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
                int arr[]=new int[n];
        System.out.println("Enter elements-> ");

        for(int i=0;i<n;i++){
arr[i]=sc.nextInt();
        }
        System.out.println("Enter Target sum-> ");
                int tsum= sc.nextInt();
ArrayList<ArrayList<Integer>>ans=new ArrayList();
        generate(arr,tsum,0,ans);
        for(int i=0;i<ans.size();i++){
            System.out.println(ans.get(i));
        }
    }

   static void generate(int arr[],int target,int index,ArrayList<ArrayList<Integer>>ans){
    if(target==0)ans.add(new ArrayList(ll));
        if(index==arr.length){
            
            return;
        }
// if(target==0){ans.add(new ArrayList(ll));return;}
if(arr[index]<=target){
ll.add(arr[index]);
generate(arr,target-arr[index],index,ans);
ll.remove(ll.size()-1);
}
generate(arr,target,index+1,ans);

    }
}