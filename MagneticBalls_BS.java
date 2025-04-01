class MagneticBalls_BS {
    public int maxDistance(int[] position, int m) {

        Arrays.sort(position);
        int n=position.length;
        int start=1;
        int end=position[n-1]-position[0];
        int ans=0;
        while(start<=end){
            int mid=(start+end)/2;
if(posible(position,mid,m)){
    ans=mid;
    start=mid+1;
}
else end=mid-1;
        }
return ans;
    }
    //for checking poosible
    boolean posible(int arr[],int force,int ball){
        int prevpos=arr[0];
        // int count=0;
        ball=ball-1;
        for(int i=1;i<arr.length;i++){
            if(arr[i]-prevpos>=force){
               prevpos=arr[i];
               ball--;
            }
            if(ball==0)return true;
        }
        return false;
    }
}