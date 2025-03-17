class Prefixsum {
    public int[] corpFlightBookings(int[][] bookings, int n) {
        int ans[] = new int[n];
//IMP TECHNIQUE FOR RAGE BASED QUESTIONS.
        // Difference array technique start and end breaking
        for (int[] arr : bookings) {
            ans[arr[0] - 1] += arr[2];  // Start booking
            if (arr[1] < n) {
                ans[arr[1]] -= arr[2]; // End booking
            }
        }

        // Compute prefix sum to get the final seat count
        for (int i = 1; i < n; i++) {
            ans[i] += ans[i - 1];
        }

        return ans;
    }
}
