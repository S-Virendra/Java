public class CountDuplicates {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 4, 5, 1, 3, 3};
        boolean[] visited = new boolean[arr.length];

        System.out.println("Duplicate elements and their counts:");
        for (int i = 0; i < arr.length; i++) {
            if (visited[i]) continue; // skip if already counted

            int count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    visited[j] = true;
                    count++;
                }
            }
            if (count > 1) {
                System.out.println(arr[i] + " → " + count + " times");
            }
        }
    }
}


