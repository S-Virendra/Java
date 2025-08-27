public class CheckString {
    public static void main(String[] args) {
        String input="Rohit@ pal";
        String result="";
        for(int i=0;i<input.length();i++){
            char ch=input.charAt(i);
            if((ch>='A'&& ch<='Z')||(ch>='a'&& ch<='z')||(ch>='0'&& ch<='9') ||(ch==' ')){
                result=result+ch;
            }
            
            
            
        }
        System.out.println(result);
    }
}  
