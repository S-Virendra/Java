import java.util.Scanner;
public class Factorial{
     public static void main(String[] args) {
        System.out.println("enter number");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        //int sum=0;
        int prod=1;
        for(int i=1;i<=num;i++){
             prod=prod*i;


        }
        System.out.println(prod);




        

        
     }


}