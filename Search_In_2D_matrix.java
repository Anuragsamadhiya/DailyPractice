class Search_In_2D_matrix{
    public boolean searchMatrix(int[][] matrix, int target) {
        //BRUTE FORCE APPROACH
        // for(int i=0;i<matrix.length;i++){
        //     int arr[]=matrix[i];
        //     int start=0;
        //     int end=arr.length-1;
        //     while(start<=end){
        //         int mid=(start+end)/2;
        //         if(arr[mid]==target)return true;
        //         if(arr[mid]>target)end=mid-1;
        //         else start=mid+1;
        //     }
        // }
        // return false;


//OPTIMAL APPROACH ->by hypothetically make the 2d array into 1d and apply binary search
int start=0;
int end=matrix.length*matrix[0].length -1;
while(start<=end){
    int mid=(start+end)/2;
    int row=mid/matrix[0].length; //formula for findng row from mid 
    int col=mid%matrix[0].length;//formula for findng col from mid 
    if(matrix[row][col]==target)return true;
    if(matrix[row][col]>target)end=mid-1;
    else start=mid+1;
}
return false;
    }
}