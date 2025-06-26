import java.util.Arrays;
import java.util.Scanner;

public class MergeSort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your array size-");

        int n=sc.nextInt();
                System.out.println("Enter your array: ");

        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        mergesort(arr,0,n-1);
        System.out.println(Arrays.toString(arr));
    }

    static void mergesort(int arr[],int low,int high){
        if(low==high)return;
        int mid=low+(high-low)/2;
        mergesort(arr, low, mid); //O(logn)
        mergesort(arr, mid+1, high);
        merge(arr,low,mid,high); //O(n) for traversing whole array
    }
    static void merge(int arr[],int low,int mid,int high){
        int l1=mid-low+1;
        int l2=high-mid;
        int m1[]=new int[l1]; //space O(n)
        int m2[]=new int[l2];
        for(int i=0;i<l1;i++){
            m1[i]=arr[i+low]; 
        }
        for(int i=0;i<l2;i++){
            m2[i]=arr[mid+1+i]; 
        }
        int j=0;
        int k=0;
        int l=low;
        while(j<l1&&k<l2){
            if(m1[j]<=m2[k]){
                arr[l++]=m1[j++];
            }
            else{
                arr[l++]=m2[k++];
            }
        }
        while(j<l1){
            arr[l++]=m1[j++];
        }
         while(k<l2){
            arr[l++]=m2[k++];
        }

    }
}
