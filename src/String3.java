public class String3 {
    public int countYZ(String str) {
        int count = 0;
        str=str.toLowerCase();

        for(int i = 0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch == 'y' || ch == 'z'){
                if(i==str.length()-1 || !Character.isLetter(str.charAt(i+1))) count++;
            }
        }
        return count;
    }

    public String withoutString(String base, String remove) {
        String str = "";

        for(int i = 0; i<base.length(); i++){

            if(i<base.length()-remove.length()+1 && base.substring(i,i+remove.length()).equalsIgnoreCase(remove)){
                i+=remove.length()-1;
            }else{
                str+=base.charAt(i);
            }
        }
        return str;
    }

    public boolean equalIsNot(String str) {
        int count = 0;

        for(int i = 0; i<str.length(); i++){
            if(i<str.length()-1 && str.substring(i,i+2).equals("is")) count++;
            if(i<str.length()-2 && str.substring(i,i+3).equals("not")) count--;
        }

        return (count==0);
    }

    public boolean gHappy(String str) {

        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)=='g'){
                if(str.length()==1) return false;

                if(i<str.length()-1 && str.charAt(i+1)=='g'){
                    continue;
                }
                if(i>0 && str.charAt(i-1)!='g'){
                    return false;
                }
            }
        }
        return true;
    }

    public int countTriple(String str) {
        int count = 0;

        for(int i = 0; i<str.length()-2; i++){
            if(str.charAt(i)==str.charAt(i+1) && str.charAt(i) == str.charAt(i+2)){
                count++;
            }
        }

        return count;
    }

    public int sumDigits(String str) {
        int sum = 0;

        for(int i = 0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(Character.isDigit(ch)){
                sum+=Integer.parseInt(Character.toString(ch));
            }
        }
        return sum;
    }

    public String sameEnds(String string) {
        int hLen = string.length()/2;

        for(int i = hLen; i>0; i--){
            String beginning = string.substring(0,i);
            String end = string.substring(string.length()-i);
            if(beginning.equals(end)) return beginning;
        }

        return "";
    }

    public String mirrorEnds(String string) {
        String result = "";
        for(int i = 0; i<string.length(); i++){
            char front = string.charAt(i);
            char end = string.charAt(string.length()-1-i);
            if (front!=end){
                break;
            }else{
                result+=front;
            }
        }
        return result;
    }

    public int maxBlock(String str) {
        int max = 0;
        int count = 1;

        for(int i = 0; i<str.length(); i++){
            if(i<str.length()-1 && str.charAt(i) == str.charAt(i+1)){
                count++;
            }else{
                max = Math.max(max, count);
                count = 1;
            }
        }

        return max;
    }

    public int sumNumbers(String str) {
        int sum = 0;
        String number = "";

        for(int i = 0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(Character.isDigit(ch)){
                number+=ch;
            }else if(!number.isEmpty()){
                sum+=Integer.parseInt(number);
                number="";
            }
        }
        if(!number.isEmpty()) sum+=Integer.parseInt(number);

        return sum;
    }

    public String notReplace(String str) {
        boolean leftIsLetter;
        boolean rightIsLetter;

        String result = "";

        for(int i = 0; i<str.length(); i++){
            if(i<str.length()-1 && str.substring(i,i+2).equals("is")){

                leftIsLetter = (i>0 && Character.isLetter(str.charAt(i-1)));
                rightIsLetter = (i<str.length()-2 && Character.isLetter(str.charAt(i+2)));

                if(!leftIsLetter && !rightIsLetter){
                    result+="is not";
                    i++;
                }else{
                    result+=str.charAt(i);
                }
            }else{
                result+=str.charAt(i);
            }
        }

        return result;
    }
}
