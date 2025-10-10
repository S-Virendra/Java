import java.util.Scanner;

public class RotateArrayLeft {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        System.out.print("Rotate left by: ");
        int k = sc.nextInt();

        // normalize k (in case it's larger than n)
        k = k % n;

        // store first k elements
        int temp[] = new int[k];
        for (int i = 0; i < k; i++) temp[i] = arr[i];

        // shift remaining elements to left
        for (int i = k; i < n; i++) arr[i - k] = arr[i];

        // put back stored elements at end
        for (int i = 0; i < k; i++) arr[n - k + i] = temp[i];

        System.out.print("Array after left rotation: ");
        for (int x : arr) System.out.print(x + " ");
    }
}

