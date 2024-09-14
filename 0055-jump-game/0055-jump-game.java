class Solution {
    public boolean canJump(int[] nums) {
        int j = 0;
        for(int i =0;i<nums.length;i++){
             if(j < 0){
                return false;
             }
            else if(j<nums[i]){
            j = nums[i];}
            
          j -=1;
        }
        return true;
    }
}