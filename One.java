

public class One {
    public static void main(String[] args) {
        
       int num=156;
       int temp=0;
       while(num!=0){
        int digit=num%10;
        temp=temp+digit;
        num=num/10;

       }

System.out.println(temp);
         
    }
}