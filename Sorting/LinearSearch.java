public class LinearSearch {

   public  static int lnrs(int arr[],int target){
    for(int i=0;i<arr.length;i++){
        if(arr[i]==target){
            return 1;
        }
    }return -1;
   }
    public static void main(String[] args) {
        int arr[]={7,5,8,2,1,9};
        int target=0;
        
        if(lnrs(arr, target)==1){
            System.out.println("yes");

        }
        else{
            System.out.println("no");
        }

    }
    
}
