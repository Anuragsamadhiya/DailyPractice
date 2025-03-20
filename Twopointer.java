class Twopointer {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0; // edge case
        
        int p = 1;  // pointer to place the next valid element
        int count = 1; // count occurrences of each element
        
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                count++; // increment count if duplicate
            } else {
                count = 1; // reset count for a new element
            }

            if (count <= 2) {
                nums[p] = nums[i]; // place the element if count <= 2
                p++;
            }
        }
        return p;
    }
}
