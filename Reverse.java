import java.util.Scanner;
public class Reverse {
   public static int rev(int num){
     int rev=0;
    while(num!=0){
        int digit=num%10;
        rev=rev*10+digit;
        num=num/10;
    }
      

    return rev;    
    }
    public static void main(String[] args) {
        System.out.println("enter thr number");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
       // int num=123;
     System.out.println( "the result is"+" "+rev(num));
    }
    
}
