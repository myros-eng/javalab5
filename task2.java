import java.util.Random;

public class task2 {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        Random random = new Random();
        int smallest = 100;
        int largest = 0;

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100) + 1;
            if (numbers[i] < smallest) {
                smallest = numbers[i];
            }
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
        }

        System.out.println("Smallest element: " + smallest);
        System.out.println("Largest element: " + largest);
    }
}