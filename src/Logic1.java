public class Logic1 {
    public boolean cigarParty(int cigars, boolean isWeekend) {
        return(cigars>=40 && cigars<=60 || isWeekend && cigars>=40);
    }

    public int dateFashion(int you, int date) {
        return (you<=2||date<=2) ? 0: (you>=8||date>=8) ? 2 : 1;
    }

    public boolean squirrelPlay(int temp, boolean isSummer) {
        return(!isSummer && temp>=60 && temp<=90 || isSummer && temp>=60 && temp<=100);
    }

    public int caughtSpeeding(int speed, boolean isBirthday) {

        int birthdayDisc = (isBirthday) ? 5: 0;

        return (speed>=81+birthdayDisc) ? 2: (speed>=61+birthdayDisc) ? 1 : 0;

    }

    public int sortaSum(int a, int b) {
        return ((a+b)>=10 && (a+b)<=19) ? 20 : a+b;
    }

    public String alarmClock(int day, boolean vacation) {
        if(!vacation){
            return (day>=1 && day <=5) ? "7:00" : "10:00";
        }else{
            return (day>=1 && day <=5) ? "10:00" : "off";
        }
    }

    public boolean love6(int a, int b) {
        return (a==6 || b==6 || a+b==6 || Math.abs(a-b)==6);
    }

    public boolean in1To10(int n, boolean outsideMode) {
        if(outsideMode){
            return (n<=1  || n>=10);
        }else{
            return (n>=1 && n<=10);
        }
    }

    public boolean specialEleven(int n) {
        return (n%11==0||n%11==1);
    }

    public boolean more20(int n) {
        return (n%20==1 || n%20==2);
    }

    public boolean old35(int n) {
        return (n%3!=n%5 && (n%3==0 || n%5==0));
    }

    public boolean less20(int n) {
        return (n%20==18 || n%20==19);
    }

    public boolean nearTen(int num) {
        return num%10<=2||num%10>=8;
    }

    public int teenSum(int a, int b) {
        return (a>=13 && a<=19 || b>=13 && b<=19) ? 19 : a+b;
    }

    public boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
        return (!isAsleep && !isMorning || !isAsleep && isMorning && isMom);
    }

    public int teaParty(int tea, int candy) {
        return (tea<5 || candy<5) ? 0: (tea>=2*candy || candy>=2*tea) ? 2 : 1;
    }

    public String fizzString(String str) {
        if (str.startsWith("f") && str.endsWith("b")){
            return "FizzBuzz";
        }else if(str.startsWith("f")){
            return "Fizz";
        }else if(str.endsWith("b")){
            return "Buzz";
        }else{
            return str;
        }
    }

    public String fizzString2(int n) {
        String string=String.valueOf(n);

        if (n%3==0 && n%5==0){
            string="FizzBuzz";
        }else if (n%3==0){
            string="Fizz";
        }else if (n%5==0){
            string="Buzz";
        }

        return (string+"!");
    }

    public boolean twoAsOne(int a, int b, int c) {
        return (a+b==c || a+c==b || c+b==a);
    }

    public boolean inOrder(int a, int b, int c, boolean bOk) {
        return (!bOk && b>a && c>b || bOk && c>b);
    }

    public boolean inOrderEqual(int a, int b, int c, boolean equalOk) {
        return (a<b && b<c || equalOk && a<=b && b<=c);
    }

    public boolean lastDigit(int a, int b, int c) {
        return (a%10==b%10 || a%10==c%10 || b%10==c%10);
    }

    public boolean lessBy10(int a, int b, int c) {
        return (Math.abs(a-b)>=10 || Math.abs(a-c)>=10 || Math.abs(b-c)>=10);
    }

    public int withoutDoubles(int die1, int die2, boolean noDoubles) {
        if (noDoubles && die1==die2){
            if(die1==6){
                return die1+die2-5;
            }else{
                return die1+die2+1;
            }
        }else{
            return die1+die2;
        }
    }

    public int maxMod5(int a, int b) {
        if(a==b){
            return 0;
        }else if(a%5==b%5){
            return (a>b) ? b : a;
        }else{
            return (a<b) ? b : a;
        }
    }

    public int redTicket(int a, int b, int c) {
        if(a==b && b==c){
            return (a==2) ? 10 : 5;
        }else{
            return (a!=b && a!=c) ? 1: 0;
        }
    }

    public int greenTicket(int a, int b, int c) {
        return (a==b && b==c) ? 20: (a==b || a==c || b==c) ? 10 : 0;
    }

    public int blueTicket(int a, int b, int c) {
        return (a+b==10 || b+c==10 || a+c==10) ? 10 :
                ((a+b)-(b+c)==10 || (a+b)-(a+c)==10) ? 5 :
                        0;
    }

    public boolean shareDigit(int a, int b) {
        int aL=a/10;
        int bL=b/10;
        int aR=a%10;
        int bR=b%10;

        return (aL==bL || aL==bR || aR==bL || aR==bR);
    }

    public int sumLimit(int a, int b) {
        return (String.valueOf(a).length()==String.valueOf(a+b).length()) ? a+b : a;
    }
}
