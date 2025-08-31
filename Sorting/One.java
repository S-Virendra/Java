public class One {

    public static int binarys(int arr[],int target){
        int low=0;
        int high=arr.length-1;
        
        while(low<high){
             int mid=(low+high)/2;
        if(target>arr[mid]){
            low=mid+1;
        }
        else if(target<arr[mid]){
            high=mid-1;
        }
        else{
           return  mid;
        }

    }

        return-1;
    }
    public static void main(String[] args) {
      int arr[]={1,2,3,4,5,6};
     
      int target=6;
     int res= binarys(arr,target);
     
     if(res==-1){
     System.out.println("not found");}
     else{
        System.out.println("index of target:"+" "+res);
     }
    }
    
}
