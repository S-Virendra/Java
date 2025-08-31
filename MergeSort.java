public class MergeSort {

    // Function to merge two sorted halves
    public static void merge(int arr[], int low, int mid, int high) {
        int n1 = mid - low + 1;
        int n2 = high - mid;

        int left[] = new int[n1];
        int right[] = new int[n2];

        // Copy data
        for (int i = 0; i < n1; i++) left[i] = arr[low + i];
        for (int j = 0; j < n2; j++) right[j] = arr[mid + 1 + j];

        int i = 0, j = 0, k = low;

        // Merge
        while (i < n1 && j < n2) {
            if (left[i] <= right[j]) {
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
            }
        }

        // Copy remaining elements
        while (i < n1) arr[k++] = left[i++];
        while (j < n2) arr[k++] = right[j++];
    }

    // Recursive function
    public static void mergeSort(int arr[], int low, int high) {
        if (low < high) {
            int mid = (low + high) / 2;
            mergeSort(arr, low, mid);      // left half
            mergeSort(arr, mid + 1, high); // right half
            merge(arr, low, mid, high);    // merge them
        }
    }

    public static void main(String[] args) {
        int arr[] = {6, 3, 9, 5, 2, 8};

        System.out.println("Before Sorting:");
        for (int num : arr) System.out.print(num + " ");

        mergeSort(arr, 0, arr.length - 1);

        System.out.println("\nAfter Sorting:");
        for (int num : arr) System.out.print(num + " ");
    }
}

