import java.util.*;
class Infosys{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int energy=sc.nextInt();
        int size=sc.nextInt();
        int arr[]=new int[size];
        int count=0;
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        for(int i=size-1;i>=0;i--){
            while(i>0&&arr[i]==arr[i-1])i--;
            if(energy<arr[i]){count++;energy=0;}
else{energy=energy-2*arr[i];
count=count+2;}
if(energy<=0){System.out.println(count);break;}
        }
        if(energy>0)System.out.println(-1);
    }
}