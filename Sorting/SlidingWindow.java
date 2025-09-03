public class SlidingWindow {

    public static int submaxsum(int arr[],int size){
        int winsum=0;
        int n=arr.length;
        for(int i=0;i<size;i++){
            winsum=winsum+arr[i];   
        }
         int maxSum = winsum;
         for(int i=size;i<n;i++){
            winsum=winsum+arr[i]-arr[i-size];
            maxSum=Math.max(maxSum,winsum);
         }
         return maxSum;
        }

      
    
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};
        int size=3;
       int res= submaxsum(arr,size);
       System.out.println(res);
    }
    
}
