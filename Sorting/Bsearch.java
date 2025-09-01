public class Bsearch {
    public static int bs(int arr[],int target){
       
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==target) return mid;
            else if(arr[mid]>target)  low=mid+1;
            else {
            high=mid-1;
            }
        }


        return-1;
    }
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50};
        int target=20;
      System.out.println( bs(arr,target)); 
    }
    
}
