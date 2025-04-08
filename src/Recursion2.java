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

    public boolean splitOdd10(int[] nums) {
        return helper2(nums, 0,0,0);
    }

    public boolean helper2(int[] nums, int index, int g1, int g2){
        if(index>=nums.length) return (g1%10 == 0 && g2%2 != 0);

        if(helper2(nums, index+1, g1+nums[index], g2)) return true;
        return helper2(nums, index+1, g1, g2+nums[index]);
    }

    public boolean split53(int[] nums) {
        return helper3(nums,0,0,0);
    }

    public boolean helper3(int[] nums, int index, int g1, int g2){
        if(index >= nums.length) return (g1 == g2);

        if(nums[index]%5 == 0){
            return helper3(nums, index+1, g1+nums[index], g2);
        }else if(nums[index]%3 == 0){
            return helper3(nums, index+1, g1, g2+nums[index]);
        }else{
            if(helper3(nums, index+1, g1+nums[index], g2)) return true;
            return helper3(nums, index+1, g1, g2+nums[index]);
        }
    }
}
