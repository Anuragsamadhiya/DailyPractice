class MaxCircularSum {
    public int maxSubarraySumCircular(int[] nums) {
         int n = nums.length;
        int maxSum = Integer.MIN_VALUE;
        int minSum = Integer.MAX_VALUE;
            int sum = 0;
            int totalsum=0;
            //FINDING TOTAL SUM
for(int num:nums){totalsum+=num;}
       //FOR FINDING MAXIMUM SUM 
        for (int start = 0; start < n; start++) {
sum+=nums[start];
maxSum=Math.max(maxSum,sum);
           if(sum<0)sum=0;
            
        }
        //FOR FINDING MINIMUM SUM 
         for (int start = 0; start < n; start++) {
sum+=nums[start];
minSum=Math.min(minSum,sum);
           if(sum>0)sum=0;
            
        }
        //ANSWER
        return maxSum>0?Math.max(maxSum,totalsum-minSum):maxSum;
    }
}