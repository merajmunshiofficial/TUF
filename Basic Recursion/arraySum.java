class arraySum {
    public int arraySum(int[] nums) {
        // Start from index 0
        return sum(nums, 0);
    }

    private int sum(int[] nums, int left) {
        // Base case: out of bounds
        if (left >= nums.length) {
            return 0;
        }
        // Add current element and recurse
        return nums[left] + sum(nums, left + 1);
    }
    public static void main(String[] args) {
        arraySum arraySum = new arraySum();
        int[] nums = {1, 2, 3}; 
        int result = arraySum.arraySum(nums); 
        System.out.println(result); 
    }
}

