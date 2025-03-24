class MaxConsecutiveIII {
    public int longestOnes(int[] nums, int k) {
        int count0=0;
int i=0;
int j=nums.length;
int track=0;
int maxlength=0;
while(i<j){
if(nums[i]==0)count0++;
if(count0>k){
maxlength=Math.max(maxlength,i-track);
while(count0>k){
    if(nums[track]==0)count0--;
    track++;
}
}
i++;
}
maxlength=Math.max(maxlength,i-track);

return maxlength;
    }
}
