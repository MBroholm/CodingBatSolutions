public class Recursion2 {
    public boolean groupSum(int start, int[] nums, int target) {
        if(start>=nums.length) return (target==0);
        if(groupSum(start+1, nums, target-nums[start])) return true;
        return (groupSum(start+1, nums, target));
    }

    public boolean groupSum6(int start, int[] nums, int target) {
        if (start >= nums.length) return target == 0;

        if (nums[start] == 6) {
            return groupSum6(start + 1, nums, target - nums[start]);
        } else {
            if (groupSum6(start + 1, nums, target - nums[start])) return true;
            return (groupSum6(start + 1, nums, target));
        }
    }

    public boolean groupNoAdj(int start, int[] nums, int target) {
        if(start>=nums.length) return (target==0);
        if(groupNoAdj(start+2, nums, target-nums[start])) return true;
        return (groupNoAdj(start+1, nums, target));
    }

    public boolean groupSum5(int start, int[] nums, int target) {
        if(start>=nums.length) return (target==0);

        if(nums[start]%5==0){
            if(start<nums.length-1 && nums[start+1]==1){
                return groupSum5(start+2, nums, target-nums[start]);
            }else{
                return groupSum5(start+1, nums, target-nums[start]);
            }
        }else{
            if(groupSum5(start+1, nums, target-nums[start])) return true;
            return groupSum5(start+1, nums, target);
        }
    }

    public boolean groupSumClump(int start, int[] nums, int target) {
        if(start>=nums.length) return (target==0);

        int value = nums[start];
        while(start<nums.length-1 && nums[start]==nums[start+1]){
            value+=nums[start+1];
            start++;
        }

        if(groupSumClump(start+1, nums, target-value)) return true;
        return groupSumClump(start+1, nums, target);
    }

    public boolean splitArray(int[] nums) {
        return helper(nums, 0, 0, 0);
    }

    public boolean helper(int[] nums, int start, int gOne, int gTwo){
        if(start >= nums.length) return (gOne == gTwo);

        if(helper(nums, start+1, gOne+nums[start], gTwo)) return true;
        return helper(nums, start+1, gOne, gTwo+nums[start]);
    }


}
