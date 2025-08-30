public class QuickSort {

     public static void quicksort(int arr[],int low,int high){
        if(low<high){
        int pivotindx=partition(arr,low,high);
        quicksort(arr, low, pivotindx-1);
        quicksort(arr, pivotindx+1, high);
     }
    }
    public static int partition(int arr[],int low,int high){
        int i=low-1;
        int pivot=arr[high];
        
        for(int j=low;j<high;j++){
            if(arr[j]<pivot){
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
            

        }
        int temp=arr[i+1];
            arr[i+1]=arr[high];

            arr[high]=temp;
        return i+1;
    }




    public static void main(String[] args) {
        int arr[]={4,8,3,9,5};
        int n=arr.length;
        quicksort(arr,0,n-1);


        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }
    }
    
}
