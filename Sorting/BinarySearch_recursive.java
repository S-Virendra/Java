public class BinarySearch_recursive {

   public  static int bs(int arr[],int target,int low,int high){

   
    if(low<=high){
         int mid=(low+high)/2;
         if(target>arr[mid]){
       return  bs(arr, target, mid+1, high);

    }

     else if(target<arr[mid]){
      return  bs(arr,target,low,mid-1);
    }
    else{
        return mid;
    }
}
        return -1;
   }
    public static void main(String[] args) {

     
     


        int arr[]={1,2,3,4,5,6};
        int target=9;
        int n=arr.length;
        int low=0;
     int res=   bs(arr,target,low,n-1);
    
     if(res==-1){
        System.out.println("not found target");
     }
     else{
        System.out.println( "target at index of "+res);
     }


    }
}
    

