public class Logic2 {
    public boolean makeBricks(int small, int big, int goal) {
        return (small+big*5>=goal && goal%5<=small);
    }

    public int loneSum(int a, int b, int c) {
        int sum = 0;
        if (a!=b && a!=c) sum+=a;
        if (b!=c && b!=a) sum+=b;
        if (c!=a && c!=b) sum+=c;
        return sum;
    }

    public int luckySum(int a, int b, int c) {
        int sum=0;
        if(a!=13){
            sum+=a;
            if(b!=13){
                sum+=b;
                if(c!=13){
                    sum+=c;
                }
            }
        }
        return sum;
    }

    public int noTeenSum(int a, int b, int c) {
        return fixTeen(a)+fixTeen(b)+fixTeen(c);
    }

    public int fixTeen(int n){
        return (n>=13 && n<=14 || n>=17 && n<=19) ? 0 : n;
    }

    public int roundSum(int a, int b, int c) {
        return round10(a)+round10(b)+round10(c);
    }

    public int round10(int n){
        int right = n%10;

        if (right>=5){
            return n+(10-right);
        }else{
            return n-right;
        }
    }

    public boolean closeFar(int a, int b, int c) {
        if(Math.abs(b-a)<=1 && Math.abs(c-a)>=2 && Math.abs(c-b) >=2) return true;
        if(Math.abs(c-a)<=1 && Math.abs(b-a)>=2 && Math.abs(b-c) >=2) return true;
        return false;
    }

    public int blackjack(int a, int b) {
        return Math.max( (a>21)?0:a, (b>21)?0:b );
    }

    public boolean evenlySpaced(int a, int b, int c) {
        int small = Math.min(a, Math.min(b, c));
        int large = Math.max(a, Math.max(b, c));
        int medium = a + b + c - small - large;

        return(medium-small==large-medium);
    }

    public int makeChocolate(int small, int big, int goal) {
        if(small+big*5>=goal && goal%5<=small){
            return Math.max(goal%5, goal-big*5);
        }
        return -1;
    }
}
