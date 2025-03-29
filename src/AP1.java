import java.util.ArrayList;
import java.util.List;

public class AP1 {
    public boolean scoresIncreasing(int[] scores) {
        for(int i = 0; i<scores.length-1; i++){
            if(scores[i]>scores[i+1]){
                return false;
            }
        }

        return true;
    }

    public boolean scores100(int[] scores) {
        for(int i = 0; i<scores.length-1; i++){
            if(scores[i]==100 && scores[i+1]==100) return true;
        }

        return false;
    }

    public boolean scoresClump(int[] scores) {
        for(int i = 0; i<scores.length-2; i++){
            int diff1 = Math.abs(scores[i]-scores[i+2]);
            if(diff1 <= 2) return true;
        }
        return false;
    }

    public int scoresAverage(int[] scores) {
        int split = scores.length/2;
        int leftSum = average(scores,0,split);
        int rightSum = average(scores,split,scores.length);

        return Math.max(leftSum, rightSum);
    }

    public int average(int[] scores, int start, int end){
        int sum = 0;
        for(int i = start; i < end; i++){
            sum+=scores[i];
        }
        int len = end-start;
        return sum/len;
    }

    public int wordsCount(String[] words, int len) {
        int count = 0;
        for(String str : words){
            if(str.length()==len) count++;
        }
        return count;
    }

    public String[] wordsFront(String[] words, int n) {
        String[] result = new String[n];

        for(int i = 0; i<result.length; i++){
            result[i]=words[i];
        }

        return result;
    }

    public List wordsWithoutList(String[] words, int len) {
        ArrayList<String> list = new ArrayList<>();
        for(int i = 0; i<words.length; i++){
            if(words[i].length() != len){
                list.add(words[i]);
            }
        }
        return list;
    }

    public boolean hasOne(int n) {
        while(n!=0){
            if(n%10==1) return true;
            n = n/10;
        }
        return false;
    }

    public boolean dividesSelf(int n) {
        int temp = n;
        int right = 0;

        while(temp!=0){
            right = temp%10;
            if(right == 0 || n%right!=0) return false;
            temp /= 10;
        }
        return true;
    }

    public int[] copyEvens(int[] nums, int count) {
        int[] result = new int[count];
        int index = 0;

        for(int i = 0; i<nums.length; i++){
            if(nums[i]%2==0){
                result[index++]=nums[i];
            }
            if(index>count-1) break;
        }

        return result;
    }

    public int[] copyEndy(int[] nums, int count) {
        int[] arr = new int[count];
        int index = 0;
        for(int num : nums){
            if(num <= 10 || num >= 90 && num <= 100){
                arr[index] = num;
                index++;
            }
            if(index == count) break;
        }
        return arr;
    }

    public int matchUp(String[] a, String[] b) {
        int count = 0;

        for(int i = 0; i<a.length; i++){
            if(!a[i].isEmpty() && !b[i].isEmpty() && a[i].charAt(0)==b[i].charAt(0)){
                count++;
            }
        }

        return count;
    }

    public int scoreUp(String[] key, String[] answers) {
        int score = 0;
        for(int i = 0; i<key.length; i++){
            score += (answers[i].equals("?")) ? 0 : (answers[i].equals(key[i])) ? +4 : -1;
        }
        return score;
    }

    public String[] wordsWithout(String[] words, String target) {
        int count = 0;
        for(String word : words){
            if(!word.equals(target)) count++;
        }

        String[] arr = new String[count];

        int index = 0;
        for(String word : words){
            if(!word.equals(target)){
                arr[index++]=word;
            }
        }

        return arr;
    }

    public int scoresSpecial(int[] a, int[] b) {
        int aMax = largestSpecial(a);
        int bMax = largestSpecial(b);
        return aMax + bMax;
    }

    public int largestSpecial(int[] a){
        int max = 0;
        for(int num : a){
            if(num%10==0){
                max = Math.max(max,num);
            }
        }
        return max;
    }

    public int sumHeights(int[] heights, int start, int end) {
        int count = 0;
        for(int i = start+1; i<end+1; i++){
            count += Math.abs(heights[i]-heights[i-1]);
        }
        return count;
    }

    public int sumHeights2(int[] heights, int start, int end) {
        int count = 0;
        int diff = 0;
        for(int i = start+1; i<end+1; i++){
            diff=Math.abs(heights[i]-heights[i-1]);
            if(heights[i]>heights[i-1]){
                count+=2*diff;
            }else{
                count+=diff;
            }
        }
        return count;
    }

    public int bigHeights(int[] heights, int start, int end) {
        int count = 0;
        int diff = 0;
        for(int i = start+1; i<=end; i++){
            diff = Math.abs(heights[i]-heights[i-1]);
            if(diff>=5) count++;
        }
        return count;
    }

    public int userCompare(String aName, int aId, String bName, int bId) {
        int nameComp = aName.compareTo(bName);

        if(nameComp<0 || nameComp==0 && aId<bId){
            return -1;
        }else if(nameComp>0 || nameComp ==0 && aId>bId){
            return 1;
        }else{
            return 0;
        }
    }

    public String[] mergeTwo(String[] a, String[] b, int n) {
        String[] arr = new String[n];
        int ai = 0, bi = 0, comp = 0;

        for(int i = 0; i<arr.length; i++){
            comp = a[ai].compareTo(b[bi]);
            if(comp<0){
                arr[i] = a[ai++];
            }else if(comp>0){
                arr[i] = b[bi++];
            }else{
                arr[i] = a[ai++];
                bi++;
            }
        }
        return arr;
    }

}
