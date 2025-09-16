public class OccurrenceCount {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 2, 5, 2, 6}; // Example array
        int target = 2; // Number whose occurrence we want to count
        
        int count = 0;
        for (int num : numbers) {
            if (num == target) {
                count++;
            }
        }
        
        System.out.println("Number " + target + " occurs " + count + " times.");
    }
}

