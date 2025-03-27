public class Array3 {
    public int maxSpan(int[] nums) {
        int maxSpan = 0;

        for (int i = 0; i<nums.length; i++){
            for (int j = nums.length-1; j>=i; j--){
                if(nums[j] == nums[i]){
                    maxSpan = Math.max(maxSpan, j-i+1);
                    break;
                }
            }
        }

        return maxSpan;
    }

    public int[] fix34(int[] nums) {
        int x = 0;

        for(int i = 0; i<nums.length; i++){
            if(nums[i]==3){
                for(int j = x; j<nums.length; j++){
                    if(nums[j]==4){
                        int temp = nums[i+1];
                        nums[i+1] = nums[j];
                        nums[j] = temp;
                        x=j;
                        break;
                    }
                }
            }
        }
        return nums;
    }

}
