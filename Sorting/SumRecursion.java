public class SumRecursion {
    static int sum(int n){
        if(n==0) return 0; // base case
        return n + sum(n-1); // recursive call
    }

    public static void main(String[] args){
        int n = 10;
        System.out.println("Sum of 1 to " + n + " = " + sum(n));
    }
}

