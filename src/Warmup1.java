public class Warmup1 {
    public boolean sleepIn(boolean weekday, boolean vacation) {
        return(!weekday||vacation);
    }

    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        return(aSmile && bSmile || !aSmile && !bSmile);
    }

    public int sumDouble(int a, int b) {
        int sum = a+b;
        if(a!=b){
            return sum;
        }else{
            return 2*sum;
        }
    }

    public int diff21(int n) {
        return (n>21) ? Math.abs(n-21)*2 : Math.abs(n-21);
    }

    public boolean parrotTrouble(boolean talking, int hour) {
        return (talking && (hour<7 || hour >20));
    }

    public boolean makes10(int a, int b) {
        return a==10 || b==10 || a+b==10;
    }

    public boolean nearHundred(int n) {
        return Math.abs(100-n)<=10 || Math.abs(200-n)<=10;
    }

    public boolean posNeg(int a, int b, boolean negative) {
        return (!negative && (a<0 && b>0 || b<0 && a>0)) || (negative && (a<0 && b<0));
    }

    public String notString(String str) {
        if(str.startsWith("not")){
            return str;
        }else{
            return "not "+str;
        }
    }

    public String missingChar(String str, int n) {
        return (str.substring(0,n)+str.substring(n+1,str.length()));
    }

    public String frontBack(String str) {
        if(str.length()>1){
            String frontChar=str.substring(0,1);
            String endChar=str.substring(str.length()-1);
            String middleChars=str.substring(1,str.length()-1);

            return (endChar+middleChars+frontChar);
        }else{
            return str;
        }
    }

    public String front3(String str) {
        String front = (str.length()>=3) ? str.substring(0,3) : str;

        return front+front+front;
    }

    public String backAround(String str) {
        String lastChar = str.substring(str.length()-1);

        return lastChar+str+lastChar;
    }

    public boolean or35(int n) {
        return (n%3==0 || n%5==0);
    }

    public String front22(String str) {
        String front = (str.length()>=2) ? str.substring(0,2) : str;

        return front+str+front;
    }

    public boolean startHi(String str) {
        return (str.length()>=2) && (str.substring(0,2).equals("hi"));
    }

    public boolean icyHot(int temp1, int temp2) {
        return (temp1<0 && temp2>100 || temp1>100 && temp2<0);
    }

    public boolean in1020(int a, int b) {
        return (Math.abs(a-15)<=5 || Math.abs(b-15)<=5);
    }

    public boolean hasTeen(int a, int b, int c) {
        return a>=13 && a<=19 || b>=13 && b<=19 || c>=13 && c<=19;
    }

    public boolean loneTeen(int a, int b) {
        boolean aTeen = a>=13 && a<=19;
        boolean bTeen = b>=13 && b<=19;

        return aTeen && !bTeen || bTeen && !aTeen;
    }

    public String delDel(String str) {
        if(str.length()>=4 && str.substring(1,4).equals("del")){
            return str.charAt(0)+str.substring(4);
        }else{
            return str;
        }
    }

    public boolean mixStart(String str) {
        return (str.length()>=3 && str.substring(1,3).equals("ix"));
    }

    public String startOz(String str) {

        boolean o = (str.length()>=1 && str.substring(0,1).equals("o"));
        boolean z = (str.length()>=2 && str.substring(1,2).equals("z"));

        return (o && z) ? "oz" : (o && !z) ? "o" :(!o && z) ? "z" : "";
    }

    public int intMax(int a, int b, int c) {
        int[] arr = {a,b,c};

        int max = arr[0];

        for(int i=0; i<=arr.length-1; i++){
            if (arr[i]>max){
                max=arr[i];
            }
        }

        return max;

    }

    public int close10(int a, int b) {
        int aDif = Math.abs(a-10);
        int bDif = Math.abs(b-10);

        return (aDif==bDif) ? 0 : (aDif>bDif) ? b : a;
    }

    public boolean in3050(int a, int b) {
        return a>=30 && a<=40 && b>=30 && b<=40 || a>=40 && a<=50 && b>=40 && b<=50;
    }

    public int max1020(int a, int b) {
        int max = (a>b) ? a : b;
        int min = (a<b) ? a : b;

        if(max>=10 && max<=20){
            return max;
        }else if(min>=10 && min<=20){
            return min;
        }else{
            return 0;
        }
    }

    public boolean stringE(String str) {
        String result = "";

        for(int i = 0; i<=str.length()-1; i++){
            if (str.charAt(i)=='e'){
                result=result+str.charAt(i);
            }
        }

        return result.length()>=1 && result.length()<=3;

    }

    public boolean lastDigit(int a, int b) {
        return (a%10==b%10);
    }

    public String endUp(String str) {
        if(str.length()>=3){
            int cut = str.length()-3;
            String last = str.substring(cut);
            last = last.toUpperCase();
            return str.substring(0,cut)+last;
        }else{
            return str.toUpperCase();
        }

    }

    public String everyNth(String str, int n) {
        String result = "";

        for(int i = 0; i<str.length(); i=i+n){
            result=result+str.charAt(i);
        }

        return result;
    }
}
