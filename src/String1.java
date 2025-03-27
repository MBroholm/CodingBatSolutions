public class String1 {
    public String helloName(String name) {
        return "Hello " + name + "!";
    }

    public String makeAbba(String a, String b) {
        return a+b+b+a;
    }

    public String makeTags(String tag, String word) {
        return "<"+tag+">"+word+"</"+tag+">";
    }

    public String makeOutWord(String out, String word) {
        return out.substring(0,2)+word+out.substring(2);
    }

    public String extraEnd(String str) {
        String end = str.substring(str.length()-2,str.length());
        return end+end+end;
    }

    public String firstTwo(String str) {
        if(str.length()>=2){
            return str.substring(0,2);
        }else{
            return str;
        }
    }

    public String firstHalf(String str) {
        return str.substring(0,str.length()/2);
    }

    public String withoutEnd(String str) {
        return str.substring(1,str.length()-1);
    }

    public String comboString(String a, String b) {
        String shortest = ( a.length() < b.length() ) ? a : b;
        String longest = (shortest.equals(a)) ? b : a;
        return shortest+longest+shortest;
    }

    public String nonStart(String a, String b) {
        return a.substring(1)+b.substring(1);
    }

    public String left2(String str) {
        return str.substring(2)+str.substring(0,2);
    }

    public String right2(String str) {
        return str.substring(str.length()-2)+str.substring(0,str.length()-2);
    }

    public String theEnd(String str, boolean front) {
        return (front) ? str.substring(0,1) : str.substring(str.length()-1);
    }

    public String withouEnd2(String str) {
        return (str.length()>=2) ? str.substring(1,str.length()-1): "";
    }

    public String middleTwo(String str) {
        return str.substring(str.length()/2-1,str.length()/2+1);
    }

    public boolean endsLy(String str) {
        return (str.length()>=2 && str.substring(str.length()-2).equals("ly"));
    }

    public String nTwice(String str, int n) {
        return str.substring(0,n)+str.substring(str.length()-n);
    }

    public String twoChar(String str, int index) {
        return (index <= 0 || index>str.length()-2) ? str.substring(0,2) : str.substring(index,index+2);
    }

    public String middleThree(String str) {
        return str.substring(str.length()/2-1, str.length()/2+2);
    }

    public boolean hasBad(String str) {
        return (str.length()>=3 && str.substring(0,3).equals("bad") || str.length()>=4 && str.substring(1,4).equals("bad"));
    }

    public String atFirst(String str) {
        if(str.length()==1){
            return (str+"@");
        }else if(str.length()==0){
            return "@@";
        }else{
            return str.substring(0,2);
        }
    }

    public String lastChars(String a, String b) {
        if(a.length()<1) a="@";
        if(b.length()<1) b="@";

        return(a.substring(0,1)+b.substring(b.length()-1));
    }

    public String conCat(String a, String b) {
        if(!a.isEmpty() && !b.isEmpty() && a.charAt(a.length()-1)==b.charAt(0)){
            return a+b.substring(1);
        }else{
            return a+b;
        }
    }

    public String lastTwo(String str) {
        if(str.length()>=2){
            String a = str.substring(0,str.length()-2);
            String b = str.substring(str.length()-2, str.length()-1);
            String c = str.substring(str.length()-1, str.length());
            return a+c+b;
        }else{
            return str;
        }
    }

    public String seeColor(String str) {
        if(str.length()>=3 && str.substring(0,3).equals("red")){
            return "red";
        }else if(str.length()>=4 && str.substring(0,4).equals("blue")){
            return "blue";
        }else{
            return "";
        }
    }

    public boolean frontAgain(String str) {
        return (str.length()>=2 && str.substring(0,2).equals(str.substring(str.length()-2)));
    }

    public String minCat(String a, String b) {
        int diff = Math.abs(a.length()-b.length());

        if(a.length()>b.length()){
            a=a.substring(diff);
        }else if(a.length()<b.length()){
            b=b.substring(diff);
        }

        return a+b;
    }

    public String extraFront(String str) {
        if(str.length()>2){
            str=str.substring(0,2);
        }

        return str+str+str;
    }

    public String without2(String str) {
        if(str.length()>=2 && str.substring(0,2).equals(str.substring(str.length()-2))){
            str=str.substring(2);
        }
        return str;
    }

    public String deFront(String str) {
        String a = (str.charAt(0)=='a') ? "a" : "";
        String b = (str.charAt(1)=='b') ? "b" : "";
        String c = (str.length()>2) ? str.substring(2) : "";

        return a+b+c;
    }

    public String startWord(String str, String word) {
        if(str.length() >= word.length()){
            if( word.substring(1).equals(str.substring( 1,word.length() ) ) ){
                return str.substring(0,word.length());
            }
        }
        return "";
    }

    public String withoutX(String str) {
        if(str.length()>0 && str.charAt(0)=='x'){
            str = str.substring(1);
        }
        if(str.length()>0 && str.charAt(str.length()-1)=='x'){
            str = str.substring(0,str.length()-1);
        }
        return str;
    }

    public String withoutX2(String str) {
        String result = "";

        if(str.length()>0 && str.charAt(0)!='x'){
            result+=str.charAt(0);
        }
        if(str.length()>1 && str.charAt(1)!='x'){
            result+=str.charAt(1);
        }
        if(str.length()>2){
            result+=str.substring(2);
        }
        return result;
    }
}
