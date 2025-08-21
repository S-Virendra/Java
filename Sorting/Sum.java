public class Sum {

     static int AddNum(int number){
        if(number==0) return 0;


        return number+AddNum(number-1);

     }

    public static void main(String[] args) {
        int number=5;
    int res=    AddNum(number);
    System.out.println(res);


    }
}
