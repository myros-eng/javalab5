import java.util.Random;

public class task2 {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        Random random = new Random();

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100) + 1;
        }

        int smallest = numbers[0];
        int largest = numbers[0];

        for (int number : numbers) {
            if (number < smallest) {
                smallest = number;
            }
            if (number > largest) {
                largest = number;
            }
        }

        System.out.println("Smallest element: " + smallest);
        System.out.println("Largest element: " + largest);
    }
}