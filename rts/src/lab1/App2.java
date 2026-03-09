package lab1;

public class App2 {

    int[][] matrix1 = { {2, 3, 1}, {7, 1, 6}, {9, 2, 4} };
    int[][] matrix2 = { {8, 5, 3}, {3, 9, 2}, {2, 7, 3} };

    int[][] add() {
        final int n = this.matrix1.length;
        int[][] result = new int[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                result[i][j] = this.matrix1[i][j] + this.matrix2[i][j];
        return result;
    }

    int[][] subtract() {
        final int n = this.matrix1.length;
        int[][] result = new int[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                result[i][j] = this.matrix1[i][j] - this.matrix2[i][j];
        return result;
    }

    int[][] multiply() {
        final int n = this.matrix1.length;
        int[][] result = new int[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                for (int k = 0; k < n; k++)
                    result[i][j] += this.matrix1[i][k] * this.matrix2[k][j];
        return result;
    }

    static void printMatrix(int[][] m) {
        int cols = m[0].length;

        for (int[] row : m) {
            for (int val : row)
                System.out.printf(" %5d ", val);
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        final App2 app2 = new App2();
        int [][] multiplicationResult = app2.multiply();
        int [][] substractionResult = app2.subtract();
        int [][] additionResult = app2.add();
        System.out.println("Multiplication");
        printMatrix(multiplicationResult);
        System.out.println("Substraction");
        printMatrix(substractionResult);
        System.out.println("Addition");
        printMatrix(additionResult);
    }
}
