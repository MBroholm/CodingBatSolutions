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

    public int[] fix45(int[] nums) {
        int x = 0;

        for(int i = 0; i<nums.length; i++){
            if(nums[i]==4){
                for(int j=x; j<nums.length; j++){
                    if(nums[j]==5 && (j==0 || nums[j-1]!=4)){
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

    public boolean canBalance(int[] nums) {
        int totalSum = 0;
        for (int e: nums){
            totalSum += e;
        }

        int left = 0;

        for(int e : nums){
            left += e;
            if(left==totalSum-left) return true;
            if(left>totalSum/2) break;
        }

        return false;
    }

    public boolean linearIn(int[] outer, int[] inner) {
        int innerCount = 0;
        int innerLen = inner.length;

        for(int i = 0; i<outer.length; i++){
            if(innerCount==innerLen) break;
            if(outer[i]==inner[innerCount]){
                innerCount++;
            }
        }

        return(innerCount==innerLen);
    }

    public int[] squareUp(int n) {
        int[] arr = new int[n*n];

        if(n>0){
            int row = 1;
            for(int index = n-1; index < arr.length; index += n){
                int value = 1;
                for(int j = index; j>index-row; j--){
                    arr[j]=value;
                    value++;
                }
                row++;
            }
        }

        return arr;
    }

    public int[] seriesUp(int n) {
        int[] arr = new int[n*(n+1)/2];

        int index = 0;

        for(int row = 1; row <= n; row++){
            for(int value = 1; value <= row; value++){
                arr[index] = value;
                index++;
            }
        }

        return arr;
    }

}
