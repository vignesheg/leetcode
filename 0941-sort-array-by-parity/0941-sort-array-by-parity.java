class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int index =0;

        for(int i=0;i<nums.length;i++){

            if((nums[i]&1)==0){
                swap(index,i,nums);
                index++;
            }
        }
        return nums;
    }
    
    void swap(int i, int j, int[] nums) {
        if (nums[i] != nums[j]) {  // Only perform swap if the indices are different to avoid zeroing out the same number
            nums[i] = nums[i] ^ nums[j];  // Step 1: nums[i] holds the XOR of nums[i] and nums[j]
            nums[j] = nums[i] ^ nums[j];  // Step 2: nums[j] now holds the original value of nums[i]
            nums[i] = nums[i] ^ nums[j];  // Step 3: nums[i] now holds the original value of nums[j]
        }
    }

}