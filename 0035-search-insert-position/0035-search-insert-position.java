class Solution {
    public int searchInsert(int[] nums, int target) {
        if(nums[nums.length-1]<target){
            return nums.length;
        }
        else if(nums[0]>target){
            return 0;
        }
        else if(nums[0]==target){
            return 0;
        }
        else if(nums[nums.length-1]==target){
            return nums.length-1;
        }
        int start = 0;
        int end = nums.length-1;
        while(start<end){
            int mid = start + (end-start)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]>target){
                end = mid;
            }
            else{
                start = mid+1;
            }
        }
        if(nums[start]>target){
            return start;
        }
        else{
            return start+1;
        }
        
    }
}