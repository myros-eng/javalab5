import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String str1 = scanner.nextLine();

        System.out.print("Enter the second string: ");
        String str2 = scanner.nextLine();

        // Concatenate the strings
        String concatenated1 = str1 + str2;
        String concatenated2 = str2 + str1;

        // Check if the composition of the concatenated strings is alternating
        boolean isAlternating1 = isAlternating(concatenated1);
        boolean isAlternating2 = isAlternating(concatenated2);

        if (isAlternating1) {
            System.out.println("The composition of the concatenated strings is alternating.");
        } else if (isAlternating2) {
            System.out.println("The composition of the concatenated strings is alternating.");
        } else {
            System.out.println("The composition of the concatenated strings is not alternating.");
        }
        scanner.close();
    }

    // Method to check if a string is alternating
    public static boolean isAlternating(String str) {
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                return false;
            }
        }
        return true;
    }
}