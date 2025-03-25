
class 2DSorting_Rectangle {
    public boolean checkValidCuts(int n, int[][] rectangles) {
    Arrays.sort(rectangles, (a, b) -> {
    if (a[0] != b[0]) return Integer.compare(a[0], b[0]);
    return Integer.compare(a[2], b[2]); // Tie-breaker
});



       int min=rectangles[0][2];
       int count=0;
       for(int i=1;i<rectangles.length;i++){
if(rectangles[i][0]<min)min=Math.max(min,rectangles[i][2]);
else {
    count++;
    min=Math.max(min,rectangles[i][2]);
}
if(count>=2)return true;
       }


        Arrays.sort(rectangles, (a, b) -> {
    if (a[1] != b[1]) return Integer.compare(a[1], b[1]);
    return Integer.compare(a[3], b[3]); // Tie-breaker
});



        min=rectangles[0][3];
        count=0;
       for(int i=1;i<rectangles.length;i++){
if(rectangles[i][1]<min)min=Math.max(min,rectangles[i][3]);
else {
    count++;
    min=Math.max(min,rectangles[i][3]);
}
if(count>=2)return true;
       }
       return false;
    }
}
