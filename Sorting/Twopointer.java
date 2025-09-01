public class Twopointer {
    static void twosum_brute(int arr[], int sum, int sizeArr) {
  for (int i = 0; i < sizeArr - 1; i++) {
    for (int j = 0; j < sizeArr; j++) {
      if (arr[i] + arr[j] == sum) {
        System.out.println(i + " " + j);
        return;
      }
    }
  }
  System.out.println("-1 -1");
}

public static void main(String[] args) {
    int arr[]={1,2,3,4,5};
    int sum=3;
    int sizeArr=arr.length;
     twosum_brute(arr,sum,sizeArr);

}
    
}
