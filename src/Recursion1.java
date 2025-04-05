public class Recursion1 {
    public int factorial(int n) {
        if(n>1){
            return n*factorial(n-1);
        }else{
            return 1;
        }
    }

    public int bunnyEars(int bunnies) {
        if(bunnies == 0){
            return 0;
        }else{
            return 2+bunnyEars(bunnies-1);
        }
    }

    public int fibonacci(int n) {
        if(n==0) return 0;
        if(n==1) return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public int bunnyEars2(int bunnies) {
        if(bunnies==0){
            return 0;
        }else if(bunnies%2==0){
            return 3+bunnyEars2(bunnies-1);
        }else{
            return 2+bunnyEars2(bunnies-1);
        }
    }

    public int triangle(int rows) {
        if(rows == 0) return 0;
        return rows + triangle(rows-1);
    }

    public int sumDigits(int n) {
        if(n==0) return 0;
        return n%10 + sumDigits(n/10);
    }

    public int count7(int n) {
        if(n==0) return 0;
        return ((n%10==7) ? 1 : 0) + count7(n/10);
    }

    public int count8(int n) {
        if(n==0) return 0;
        return (n%100 == 88 ? 2 : n%10 == 8 ? 1 : 0) + count8(n/10);
    }

    public int powerN(int base, int n) {
        if(n == 1) return base;
        return base * (powerN(base, n-1));
    }

    public int countX(String str) {
        if(str.isEmpty()) return 0;
        return (str.charAt(0) == 'x' ? 1 : 0) + countX(str.substring(1));
    }

    public int countHi(String str) {
        if(str.length()<2) return 0;
        if (str.startsWith("hi")) return 1 + countHi(str.substring(2));
        return countHi(str.substring(1));
    }

    public String changeXY(String str) {
        if(str.isEmpty()) return str;
        char ch = str.charAt(0);
        return (ch == 'x' ? 'y' : ch) + changeXY(str.substring(1));
    }

    //public String changeXY(String str) {
    //  if(str.isEmpty()) return str;
    //  String result = str.replace('x','y');
    //  return result;
    //}

    public String noX(String str) {
        if(str.isEmpty()) return str;
        char ch = str.charAt(0);
        if(ch == 'x') return noX(str.substring(1));
        return ch + noX(str.substring(1));
    }

    public boolean array6(int[] nums, int index) {
        if(index>=nums.length) return false;
        if(nums[index]==6) return true;
        return array6(nums, index+1);
    }

    public int array11(int[] nums, int index) {
        if(index>=nums.length) return 0;
        return nums[index] == 11 ? 1 + array11(nums, index+1) : array11(nums, index+1);
    }

    public String allStar(String str) {
        if(str.length()<2) return str;
        return str.charAt(0) + "*" + allStar(str.substring(1));
    }

    public String endX(String str) {
        if (str.isEmpty()) return str;
        if (str.charAt(0) == 'x') return endX(str.substring(1)) + 'x';
        return str.charAt(0) + endX(str.substring(1));
    }

    public int countAbc(String str) {
        if(str.length()<3) return 0;
        String sub = str.substring(0,3);
        return (sub.equals("abc") || sub.equals("aba") ? 1 : 0) + countAbc(str.substring(1));
    }

    public int count11(String str) {
        if(str.length()<2) return 0;
        if(str.substring(0,2).equals("11")) return 1 + count11(str.substring(2));
        return count11(str.substring(1));
    }

    public String stringClean(String str) {
        if(str.length()<2) return str;
        if(str.charAt(0) == str.charAt(1)) return stringClean(str.substring(1));
        return str.charAt(0) + stringClean(str.substring(1));
    }

    public int countHi2(String str) {
        if(str.length()<2) return 0;
        if(str.length()>2 && str.substring(0,3).equals("xhi")) return countHi2(str.substring(3));
        if(str.substring(0,2).equals("hi")) return 1 + countHi2(str.substring(2));
        return countHi2(str.substring(1));
    }

    public String parenBit(String str) {
        int last = str.length()-1;
        if (str.charAt(0) == '(' && str.charAt(last) == ')' ) return str;
        if (str.charAt(0) != '(' && str.charAt(last) != ')' ) return parenBit(str.substring(1,last));
        if (str.charAt(0) != '(' ) return parenBit(str.substring(1));
        return parenBit(str.substring(0, last));
    }

    public boolean nestParen(String str) {
        if(str.isEmpty()) return true;
        int len = str.length();
        if(len%2 != 0) return false;
        if(str.charAt(0) != '(' || str.charAt(len-1) != ')') return false;
        return nestParen(str.substring(1,len-1));
    }

    public int strCount(String str, String sub) {
        int subL = sub.length();
        if ( str.length() < subL ) return 0;
        if ( str.substring(0,subL).equals(sub) ) return 1 + strCount( str.substring(subL), sub );
        return strCount( str.substring(1), sub );
    }

    public boolean strCopies(String str, String sub, int n) {
        if (n<=0) return true;
        if (str.length() < sub.length() ) return false;
        if (str.startsWith(sub)) return (strCopies(str.substring(1), sub, n-1));
        return (strCopies(str.substring(1), sub, n));
    }

    public int strDist(String str, String sub) {
        int len = str.length();
        int subL = sub.length();
        boolean starts = str.startsWith(sub);
        boolean ends = str.endsWith(sub);

        if (len < subL) return 0;
        if (starts && ends) return len;
        if (len > 1 && !starts && !ends) return strDist(str.substring(1,len-1), sub);
        if (!starts) return strDist( str.substring(1), sub );
        return strDist( str.substring(0,len-1), sub );
    }
}