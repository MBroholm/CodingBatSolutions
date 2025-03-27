public class Warmup2 {
    public String stringTimes(String str, int n) {
        String result = "";

        for(int i=0; i<n; i++){
            result=result+str;
        }

        return result;
    }

    public String frontTimes(String str, int n) {
        String front = (str.length()>=3) ? str.substring(0,3) : str;

        String result = "";

        for(int i =0; i<n; i++){
            result = result+front;
        }

        return result;
    }

    int countXX(String str) {
        int count = 0;

        for(int i = 0; i<str.length()-1; i++){
            if(str.substring(i,i+2).equals("xx")){
                count++;
            }
        }

        return count;
    }

    boolean doubleX(String str) {
        for(int i = 0; i<str.length()-1; i++){
            if(str.charAt(i)=='x' && str.charAt(i+1)=='x'){
                return true;
            }else if(str.charAt(i)=='x' && str.charAt(i+1)!='x'){
                return false;
            }
        }

        return false;
    }

    public String stringBits(String str) {
        String newString = "";

        for(int i = 0; i<str.length(); i+=2){
            newString+=str.charAt(i);
        }

        return newString;
    }

    public String stringSplosion(String str) {
        String string="";

        for(int i=0; i<str.length(); i++){
            string+=str.substring(0,i+1);
        }

        return string;
    }

    public int last2(String str) {
        if (str.length()<2){
            return 0;
        }

        int count=0;

        for(int i = 0; i<str.length()-2; i++){
            if(str.substring(i,i+2).equals(str.substring(str.length()-2))){
                count++;
            }
        }

        return count;
    }

    public int arrayCount9(int[] nums) {
        int count = 0;

        for(int i = 0; i<nums.length; i++){
            if(nums[i]==9) count++;
        }

        return count;
    }

    public boolean arrayFront9(int[] nums) {

        for(int i = 0; i<Math.min(4,nums.length); i++){
            if(nums[i]==9) return true;
        }

        return false;
    }

    public boolean array123(int[] nums) {
        for(int i = 0; i<nums.length-2; i++){
            if(nums[i]==1 && nums[i+1]==2 && nums[i+2]==3) return true;
        }

        return false;
    }

    public int stringMatch(String a, String b) {
        int count = 0;

        for(int i = 0; i<Math.min(a.length()-1,b.length()-1); i++){
            if(a.substring(i,i+2).equals(b.substring(i,i+2))) count++;
        }

        return count;
    }

    public String stringX(String str) {
        String result="";

        for(int i=0; i<str.length(); i++){
            if(i==0 || i==str.length()-1){
                result+=str.charAt(i);
            }else if(str.charAt(i)!='x'){
                result+=str.charAt(i);
            }
        }

        return result;
    }

    public String altPairs(String str) {
        String result = "";

        for(int i = 0; i<str.length(); i+=4){
            if(i+2>str.length()){
                result+=str.charAt(i);
            }else{
                result+=str.substring(i,i+2);
            }
        }

        return result;
    }

    public String stringYak(String str) {
        String result = "";

        for(int i=0; i<str.length(); i++){

            if(i+2<str.length() && str.charAt(i)=='y' && str.charAt(i+2)=='k'){
                i+=2;
            }else{
                result+=str.charAt(i);
            }

        }
        return result;
    }

    public int array667(int[] nums) {
        int count = 0;
        // Note: iterate to length-1, so can use i+1 in the loop
        for (int i=0; i < (nums.length-1); i++) {
            if (nums[i] == 6 && (nums[i+1] == 6 || nums[i+1] == 7)){
                count++;
            }
        }
        return count;
    }

    public boolean noTriples(int[] nums) {
        for(int i=0; i<nums.length-2; i++){
            if(nums[i]==nums[i+1] && nums[i]==nums[i+2]){
                return false;
            }
        }

        return true;
    }

    public boolean has271(int[] nums) {
        for(int i=0; i<nums.length-2; i++){
            if(nums[i+1]==nums[i]+5 && Math.abs(nums[i+2]-(nums[i]-1))<=2){
                return true;
            }
        }

        return false;
    }
}
