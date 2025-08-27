public class Fiban {
   
    static int fib(int n)
    {
       
        if (n <= 1) {
         // base condition
            return n;}
          

       
        return fib(n - 1) + fib(n - 2);
    }

   
    public static void main(String args[])
    {
       
        int N = 5;

       
        for (int i = 0; i < N; i++) {

            int res=fib(i);
            System.out.print(res);
        }
    }
}
    

