import java.util.Scanner;

public class Automorphic {                     // square of number ends with that number
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int square = num * num;

        // Check if square ends with the number
        String numStr = String.valueOf(num);
        String squareStr = String.valueOf(square);

        if (squareStr.endsWith(numStr)) {
            System.out.println(num + " is an Automorphic number.");
        } else {
            System.out.println(num + " is NOT an Automorphic number.");
        }

        sc.close();
    }
}

