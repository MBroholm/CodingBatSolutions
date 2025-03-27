public class Array1 {
    public boolean firstLast6(int[] nums) {
        return (nums[0]==6 || nums[nums.length-1]==6);
    }

    public boolean sameFirstLast(int[] nums) {
        return (nums.length>=1 && nums[0]==nums[nums.length-1]);
    }

    public int[] makePi() {
        int[] pi = {3,1,4};
        return pi;
    }

    public boolean commonEnd(int[] a, int[] b) {
        return (a[0]==b[0]||a[a.length-1]==b[b.length-1]);
    }

    public int sum3(int[] nums) {
        int sum = 0;
        for(int i = 0; i<nums.length; i++){
            sum +=nums[i];
        }
        return sum;
    }

    public int[] rotateLeft3(int[] nums) {
        int[] result = new int[nums.length];

        for(int i = 0; i<nums.length; i++){
            if(i==nums.length-1){
                result[i]=nums[0];
            }else{
                result[i]=nums[i+1];
            }
        }

        return result;

    }

    public int[] reverse3(int[] nums) {
        int[] result = new int[nums.length];

        result[0]=nums[2];
        result[1]=nums[1];
        result[2]=nums[0];

        return result;
    }

    public int[] maxEnd3(int[] nums) {
        int high = Math.max(nums[0],nums[nums.length-1]);

        for(int i=0; i<nums.length; i++){
            nums[i]=high;
        }

        return nums;

    }

    public int sum2(int[] nums) {
        if(nums.length>=2){
            return nums[0]+nums[1];

        }else if(nums.length==1){
            return nums[0];
        }else{
            return 0;
        }
    }

    public int[] middleWay(int[] a, int[] b) {
        int[] result = new int[2];
        result[0]=a[1];
        result[1]=b[1];
        return result;
    }

    public int[] makeEnds(int[] nums) {
        int[] arr = new int[2];

        arr[0]=nums[0];
        arr[1]=nums[nums.length-1];
        return arr;
    }

    public boolean has23(int[] nums) {
        return (nums[0]==2 || nums[0] == 3 || nums[1]==2 || nums[1] == 3);
    }

    public boolean no23(int[] nums) {
        return (nums[0]!=2 && nums[0]!=3 && nums[1]!=2 && nums[1]!=3);
    }

    public int[] makeLast(int[] nums) {
        int[] arr = new int[nums.length*2];
        arr[arr.length-1]=nums[nums.length-1];
        return arr;
    }

    public boolean double23(int[] nums) {
        return (nums.length==2 && nums[0]==nums[1] && (nums[0]==2 || nums[0]==3));
    }

    public int[] fix23(int[] nums) {
        if(nums[0]==2 && nums[1]==3) nums[1]=0;
        if(nums[1]==2 && nums[2]==3) nums[2]=0;
        return nums;
    }

    public int start1(int[] a, int[] b) {
        int result=0;
        if(a.length>0 && a[0]==1) result++;
        if(b.length>0 && b[0]==1) result++;
        return result;
    }

    public int[] biggerTwo(int[] a, int[] b) {
        if(a[0]+a[1]<b[0]+b[1]) a=b;
        return a;
    }

    public int[] makeMiddle(int[] nums) {
        int[] arr = new int[2];
        arr[0]=nums[nums.length/2-1];
        arr[1]=nums[nums.length/2];
        return arr;
    }

    public int[] plusTwo(int[] a, int[] b) {
        int[] arr = new int[] {a[0], a[1], b[0], b[1]};
        return arr;
    }

    public int[] swapEnds(int[] nums) {
        if(nums.length>1){
            int temp = nums[0];
            nums[0] = nums[nums.length-1];
            nums[nums.length-1] = temp;
        }
        return nums;
    }

    public int[] midThree(int[] nums) {
        int l = nums.length/2;
        int[] arr = new int[] {nums[l-1],nums[l], nums[l+1]};
        return arr;
    }

    public int maxTriple(int[] nums) {
        return Math.max(nums[0],Math.max(nums[nums.length/2],nums[nums.length-1]));
    }

    public int[] frontPiece(int[] nums) {
        if(nums.length>2){
            int[] arr = new int[] {nums[0],nums[1]};
            return arr;
        }
        return nums;
    }

    public boolean unlucky1(int[] nums) {
        if(nums.length>=2 && nums[0]==1 && nums[1]==3){
            return true;
        }
        if(nums.length>=3 && nums[1]==1 && nums[2]==3){
            return true;
        }
        if(nums.length>=4 && nums[nums.length-2]==1 && nums[nums.length-1]==3){
            return true;
        }
        return false;

    }

    public int[] make2(int[] a, int[] b) {
        return (a.length==0) ? new int[] {b[0], b[1]}:
               (a.length==1) ? new int[] {a[0], b[0]}:
               new int[] {a[0], a[1]};
    }

    public int[] front11(int[] a, int[] b) {
        if(a.length==0){
            if(b.length==0){
                return new int[0];
            }else{
                return new int[]{b[0]};
            }
        }else if(b.length==0){
            return new int[]{a[0]};
        }else{
            return new int[]{a[0],b[0]};
        }
    }
}
