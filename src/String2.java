public class String2 {
    public String doubleChar(String str) {
        String result = "";
        for(int i=0; i<str.length(); i++){
            result = result+str.charAt(i)+str.charAt(i);
        }
        return result;
    }

    public int countHi(String str) {
        int count = 0;
        for(int i=0; i<str.length()-1;i++){
            if(str.charAt(i)=='h' && str.charAt(i+1)=='i') count++;
        }
        return count;
    }

    public boolean catDog(String str) {
        int diff = 0;

        for(int i=0; i<str.length()-2;i++){
            String sub = str.substring(i,i+3);
            if(sub.equals("dog")){
                diff++;
            }else if(sub.equals("cat")){
                diff--;
            }
        }

        return(diff==0);
    }

    public int countCode(String str) {
        int count = 0;

        for(int i=0; i<str.length()-3; i++){
            if(str.substring(i,i+2).equals("co") && str.charAt(i+3)=='e') count ++;
        }

        return count;
    }

    public boolean endOther(String a, String b) {
        a=a.toLowerCase();
        b=b.toLowerCase();

        if(a.length() >= b.length() && a.substring(a.length()-b.length(), a.length()).equals(b)){
            return true;
        }
        if(b.length() >= a.length() && b.substring(b.length()-a.length(), b.length()).equals(a)){
            return true;
        }
        return false;
    }

    public boolean xyzThere(String str) {

        for(int i=0; i<str.length()-2; i++){
            if (str.substring(i,i+3).equals("xyz")){
                if(i==0 || str.charAt(i-1)!='.'){
                    return true;
                }
            }
        }

        return false;
    }

    public boolean bobThere(String str) {
        for(int i = 0; i<str.length()-2; i++){
            if(str.charAt(i)=='b' && str.charAt(i+2)=='b'){
                return true;
            }
        }
        return false;
    }

    public boolean xyBalance(String str) {

        for(int i = str.length()-1; i>=0; i--){
            if(str.charAt(i)=='x') return false;
            if(str.charAt(i)=='y') return true;
        }
        return true;
    }

    public String mixString(String a, String b) {
        String result = "";

        for(int i = 0; i<Math.min(a.length(),b.length()); i++){
            result = result + a.charAt(i) + b.charAt(i);
        }

        result+= (a.length()>=b.length()) ? a.substring(b.length()) : b.substring(a.length());

        return result;
    }

    public String repeatEnd(String str, int n) {
        String result = "";
        for(int i = 0; i<n; i++){
            result += str.substring(str.length()-n);
        }
        return result;
    }

    public String repeatFront(String str, int n) {
        String result = "";
        for(int i = n; i>0; i--){
            result+=str.substring(0,i);
        }
        return result;
    }

    public String repeatSeparator(String word, String sep, int count) {
        String result = "";
        for(int i = 0; i<count; i++){
            result+=word;
            if(i<count-1) result+=sep;
        }
        return result;
    }

    public boolean prefixAgain(String str, int n) {
        String sub = str.substring(0,n);

        for(int i = 1; i<str.length()-(n-1); i++){
            if(str.substring(i,i+n).equals(sub)) return true;
        }
        return false;
    }

    public boolean xyzMiddle(String str) {
        if(str.length()<3) return false;

        if(str.substring(str.length()/2-1,str.length()/2+2).equals("xyz")) return true;

        if(str.length()%2==0){
            if(str.substring(str.length()/2-2,str.length()/2+1).equals("xyz")) return true;
        }

        return false;

    }

    public String getSandwich(String str) {
        String bread = "bread";
        int firstBread = str.indexOf(bread);
        int lastBread = str.lastIndexOf(bread);

        // Check if there are at least two "bread"
        if (firstBread == -1 || firstBread == lastBread) {
            return "";
        }

        // Extract and return what's between them
        return str.substring(firstBread + bread.length(), lastBread);
    }

    public boolean sameStarChar(String str) {

        for(int i = 1; i<str.length()-1; i++){
            if(str.charAt(i)=='*' && str.charAt(i-1)!=str.charAt(i+1)) return false;
        }
        return true;
    }

    public String oneTwo(String str) {
        String result="";

        for(int i = 0; i<str.length()-2; i+=3){
            result+= str.substring(i+1,i+3)+str.charAt(i);
        }
        return result;
    }

    public String zipZap(String str) {
        String result = "";
        for(int i = 0; i<str.length(); i++){
            if(i<str.length()-2 && str.charAt(i)=='z' && str.charAt(i+2)=='p'){
                result+="zp";
                i+=2;
            }else{
                result = result + str.charAt(i);
            }
        }
        return result;
    }

    public String starOut(String str) {
        String result = "";

        if(str.equals("*")) return result;

        if(str.length()<2) return str;

        if(str.charAt(0)!='*' && str.charAt(1)!='*') result+=str.charAt(0);

        for(int i = 1; i<str.length()-1; i++){

            if(str.charAt(i)!='*' && str.charAt(i-1)!='*' && str.charAt(i+1)!='*'){
                result+=str.charAt(i);
            }
        }

        if(str.charAt(str.length()-1)!='*' && str.charAt(str.length()-2)!='*'){
            result+=str.charAt(str.length()-1);
        }


        return result;
    }

    public String plusOut(String str, String word) {
        String result = "";

        for(int i = 0; i<str.length(); i++){
            if(i<str.length()-word.length()+1 && str.substring(i,i+word.length()).equals(word)){
                result+=word;
                i+=word.length()-1;
            }else{
                result+='+';
            }
        }

        return result;
    }

    public String wordEnds(String str, String word) {
        String result = "";

        for(int i = 0; i<str.length()-word.length()+1; i++){
            if(str.substring(i, i+word.length()).equals(word)){
                if(i>0){
                    result+=str.charAt(i-1);
                }
                if(i<str.length()-word.length()){
                    result+=str.charAt(i+word.length());
                }
            }
        }

        return result;
    }
}
