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
        int rigthSum = average(scores,split,scores.length);

        return Math.max(leftSum, rigthSum);
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

}
