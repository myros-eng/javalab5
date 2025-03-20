public class task3 {
    public static void main(String[] args) {
        int[][] matrix = new int[10][10];
        int diagonalSum = 0;

        for (int i = 0; i < matrix.length; i++) {
            matrix[i][i] = i;
            diagonalSum += i;
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Sum of the elements on the diagonal: " + diagonalSum);
    }
}