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

}