public class Array2 {
    public int countEvens(int[] nums) {
        int count = 0;

        for(int i = 0; i<nums.length; i++){
            if (nums[i]%2==0){
                count++;
            }
        }

        return count;
    }

    public int bigDiff(int[] nums) {
        int minVal = nums[0];
        for(int i = 0; i<nums.length; i++){
            minVal=Math.min(minVal,nums[i]);
        }

        int maxVal = nums[0];
        for(int i = 0; i<nums.length; i++){
            maxVal=Math.max(maxVal,nums[i]);
        }

        return maxVal-minVal;

    }

    public int centeredAverage(int[] nums) {
        int minVal=nums[0];
        for(int i=0; i<nums.length; i++){
            minVal=Math.min(minVal,nums[i]);
        }

        int maxVal=nums[0];
        for(int i=0; i<nums.length ; i++){
            maxVal=Math.max(maxVal,nums[i]);
        }

        int sum = 0-(minVal+maxVal);
        for(int i=0; i<nums.length; i++){
            sum=sum+nums[i];
        }

        int count=nums.length-2;

        int average=sum/count;

        return average;

    }

    public int sum13(int[] nums) {
        int sum = 0;
        for(int i = 0; i<nums.length; i++){
            if(nums[i]==13){
                i++;
            }else{
                sum+=nums[i];
            }
        }
        return sum;
    }

    public int sum67(int[] nums) {
        int sum = 0;
        boolean bool = true;

        for(int i = 0; i<nums.length; i++){
            if(nums[i]==6){
                while(nums[i]!=7){
                    i++;
                }
            }else{
                sum+=nums[i];
            }
        }

        return sum;
    }

    public boolean has22(int[] nums) {
        for(int i = 0; i<nums.length-1; i++){
            if(nums[i]==2 && nums[i+1]==2){
                return true;
            }
        }

        return false;
    }

    public boolean lucky13(int[] nums) {
        for(int i: nums){
            if(i==1 || i==3) return false;
        }
        return true;
    }

    public boolean sum28(int[] nums) {
        int sum = 0;
        for(int i : nums){
            if(i==2) sum+=i;
        }
        return(sum==8);
    }

    public boolean more14(int[] nums) {
        int count = 0;
        for(int i : nums){
            if(i==1){
                count++;
            }else if(i==4){
                count--;
            }
        }
        return(count>0);
    }

    public int[] fizzArray(int n) {
        int[] arr = new int[n];
        for(int i = 0; i<arr.length; i++){
            arr[i]=i;
        }

        return arr;
    }

    public boolean only14(int[] nums) {
        for(int i : nums){
            if(i!=1 && i!=4){
                return false;
            }
        }
        return true;
    }

    public String[] fizzArray2(int n) {
        String[] arr = new String[n];
        for(int i = 0; i<arr.length; i++){
            arr[i] = String.valueOf(i);
        }

        return arr;
    }

    public boolean no14(int[] nums) {
        boolean noOne = true;
        boolean noFour = true;

        for(int i : nums){
            if(i==1) noOne = false;
            if(i==4) noFour = false;
        }

        return (noOne || noFour);
    }

    public boolean isEverywhere(int[] nums, int val) {
        for(int i = 0; i<nums.length-1; i++){
            if(nums[i]!=val && nums[i+1]!=val) return false;
        }
        return true;
    }

    public boolean either24(int[] nums) {
        boolean has22 = false;
        boolean has44 = false;

        for(int i = 0; i<nums.length-1; i++){
            if(nums[i]==2 && nums[i+1]==2) has22 = true;
            if(nums[i]==4 && nums[i+1]==4) has44 = true;
        }

        return (has22!=has44 && (has22 || has44));
    }

    public int matchUp(int[] nums1, int[] nums2) {
        int count = 0;

        for(int i = 0; i<nums1.length; i++){
            int diff = Math.abs(nums1[i]-nums2[i]);
            if(diff<=2 && diff>0) count++;
        }

        return count;
    }

    public boolean has77(int[] nums) {
        for(int i = 0; i<nums.length-1; i++){
            if(nums[i]==7){
                if(nums[i+1]==7) return true;
                if(i<nums.length-2 && nums[i+2]==7) return true;
            }
        }
        return false;
    }

    public boolean has12(int[] nums) {
        boolean has1 = false;
        boolean has2 = false;

        for(int i : nums){
            if(i==1) has1=true;
            if(has1 && i==2) has2=true;
        }

        return (has1 && has2);
    }

    public boolean modThree(int[] nums) {
        for(int i = 0; i<nums.length-2; i++){
            if(nums[i]%2==nums[i+1]%2 && nums[i]%2==nums[i+2]%2){
                return true;
            }
        }
        return false;
    }

    public boolean haveThree(int[] nums) {
        int count = 0;
        for(int i = 0; i<nums.length; i++){
            if(nums[i]==3){
                if(i<nums.length-1 && nums[i+1]==3){
                    return false;
                }else{
                    count++;
                }
            }
        }
        return (count==3);
    }

    public boolean twoTwo(int[] nums) {
        for(int i = 0; i<nums.length; i++){
            if(nums[i]==2){
                if(!(i<nums.length-1 && nums[i+1]==2) && !(i>0 && nums[i-1]==2)){
                    return false;
                }
            }
        }
        return true;
    }

    public boolean sameEnds(int[] nums, int len) {
        for(int i=0; i<len; i++){
            int start = nums[i];
            int end = nums[i+nums.length-len];
            if(start!=end) return false;
        }
        return true;
    }

    public boolean tripleUp(int[] nums) {
        for(int i = 0; i<nums.length-2; i++){
            if(nums[i+1]==nums[i]+1 && nums[i+2]==nums[i]+2){
                return true;
            }
        }
        return false;
    }

    public int[] fizzArray3(int start, int end) {
        int[] arr = new int[end-start];

        for(int i = 0; i<arr.length; i++){
            arr[i]=start;
            start++;
        }
        return arr;
    }

    public int[] shiftLeft(int[] nums) {
        if(nums.length<1) return nums;

        int temp = nums[0];

        for(int i = 0; i<nums.length-1; i++){
            nums[i]=nums[i+1];
        }
        nums[nums.length-1]=temp;

        return nums;
    }

    public int[] tenRun(int[] nums) {
        int tens = -1;

        for(int i = 0; i<nums.length; i++){
            if(nums[i]%10==0){
                tens = nums[i];
            }else if(tens!=-1){
                nums[i]=tens;
            }
        }

        return nums;
    }

    public int[] pre4(int[] nums) {
        int i = 0;
        for(i=0; i<nums.length; i++){
            if(nums[i]==4) break;
        }
        int[] arr = new int[i];
        for(i=0; i<arr.length; i++){
            arr[i]=nums[i];
        }
        return arr;
    }

    public int[] post4(int[] nums) {
        int index = 0;
        for(int i=nums.length-1; i>=0; i--){
            if(nums[i]==4){
                index = i;
                break;
            }
        }

        int remainder = nums.length-1-index;

        int[] arr = new int[remainder];
        for(int i=0; i<arr.length; i++){
            arr[i]=nums[index+1+i];
        }

        return arr;
    }

    public int[] notAlone(int[] nums, int val) {
        for(int i=0; i<nums.length; i++){
            if(nums[i]==val && i<nums.length-1 && i>0){
                if(nums[i+1]==val || nums[i-1]==val){
                    continue;
                }else{
                    nums[i] = Math.max(nums[i-1],nums[i+1]);
                }
            }
        }
        return nums;
    }

    public int[] zeroFront(int[] nums) {
        int[] arr = new int[nums.length];
        int count = 0;

        for(int i = 0; i<nums.length; i++){
            if(nums[i]==0){
                count++;
            }
        }

        for(int i = 0; i<nums.length; i++){
            if(nums[i]!=0){
                arr[count]=nums[i];
                count++;
            }
        }

        return arr;
    }

    public int[] withoutTen(int[] nums) {
        int[] arr = new int[nums.length];
        int index=0;

        for(int i = 0; i<nums.length; i++){
            if(nums[i]!=10){
                arr[index]=nums[i];
                index++;
            }
        }

        return arr;
    }

    public int[] zeroMax(int[] nums) {
        for(int i=0; i<nums.length; i++){
            if(nums[i]==0){
                for(int j = i+1; j<nums.length; j++){
                    if(nums[j]%2!=0) nums[i] = Math.max(nums[j], nums[i]);
                }
            }
        }
        return nums;
    }

    public int[] evenOdd(int[] nums) {
        int[] arr = new int[nums.length];
        int count = 0;

        for(int i = 0; i<nums.length; i++){
            if(nums[i]%2==0){
                arr[count]=nums[i];
                count++;
            }
        }

        for(int i = 0; i<nums.length; i++){
            if(nums[i]%2!=0){
                arr[count]=nums[i];
                count++;
            }
        }

        return arr;
    }

    public String[] fizzBuzz(int start, int end) {
        int len = end-start;
        String[] arr = new String[len];

        for(int i=0; i<len; i++){
            arr[i]="";

            if(start%3==0) arr[i]+="Fizz";
            if(start%5==0) arr[i]+="Buzz";

            if(arr[i].isEmpty()) arr[i]=String.valueOf(start);

            start++;
        }

        return arr;
    }
}
