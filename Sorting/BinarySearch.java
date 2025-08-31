public class BinarySearch {

public static int binarysearch(int arr[],int target){
    
    int n=arr.length; // length of array
    int low=0;
    int high=n-1;
    while (low<=high){
        int mid=(low+high)/2;
        if(arr[mid]==target){
            return mid;
        }
        else if(target>arr[mid]){
            low=mid+1;
        }
        else high=mid-1;
    }

    return -1;
}


    public static void main(String[] args) {
        int arr[]={4,5,9,11,26};
        int target=26;
      int res=  binarysearch(arr,target);
      if(res==-1){
        System.out.println("not found");
      }
     
      else{
        System.out.println(res);
      }

        
    }
    
}
