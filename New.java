public class New {
    public static void main(String[] args) {
       int arr[]={5,9,4,6,8};
       int i=0;
       int j=arr.length-1;
       int temp;
       while(i!=j){
        temp=arr[i];
       arr[i]=arr[j];
       arr[j]=temp;



        i++;
        j--;
       }
      
      
       System.out.println("reversed array");
       
       for(int k=0;k<arr.length;k++){
        System.out.print(arr[k]+" ");
       }
    }
}
