import java.util.*;
class spiralMatrix{
    public static void main(String[]args){
        int res[][]=new int[][]{{ 1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
int left=0;
int right=res.length-1;
int top=0;
int bottom=res[0].length-1;
while(left<=right&&top<=bottom){
    for(int i=left;i<=right;i++){
        System.out.println(res[top][i]);
    }
    top++;
     for(int i=top;i<=bottom;i++){
        System.out.println(res[i][right]);
    }
right--;
if(left<=right){
for(int i=right;i>=left;i--){
        System.out.println(res[bottom][i]);
    }
bottom--;
}
if(top<=bottom){
for(int i=bottom;i>=top;i--){
        System.out.println(res[i][left]);
    }
left++;
}

}
    }
}