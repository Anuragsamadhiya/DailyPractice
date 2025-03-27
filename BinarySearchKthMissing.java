class BinarySearchKthMissing {
    public int findKthPositive(int[] arr, int k) {
        int left = 0, right = arr.length - 1;
//O(LOGN) TIME COMPLEXITY
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int missing = arr[mid] - (mid + 1);

            if (missing < k) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        
        return left + k;


        //USING O(N) TIME COMPLEXITY
        int num=1;
        int i=0;
        int j=arr.length;
      while(i<j) {
if(arr[i]==num){i++;}
else k--;
if(k==0)return num;
num++;        
}
return num+k-1;
    }
}
