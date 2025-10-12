/*
Implement console program which will meet the following requirements:

a- Program starts and asks user to specify matrix size. For example if user entered ‘5’ program will generate next matrix:

0.0 0.1 0.2 0.3 0.4
1.0 1.1 1.2 1.3 1.4
2.0 2.1 2.2 2.3 2.4
3.0 3.1 3.2 3.3 3.4
4.0 4.1 4.2 4.3 4.4

b- Program asks user this question with options:
How much do you want to rotate matrix?
- Press 1 to rotate matrix to 90 degrees
- Press 2 to rotate matrix to 180 degrees
- Press 3 to rotate matrix to 270 degrees

c- When user chosen rotation mode programs prints initial matrix and rotated one.

d- Rotation for 90 degrees looks like this:
4.0 3.0 2.0 1.0 0.0
4.1 3.1 2.1 1.1 0.1
4.2 3.2 2.2 1.2 0.2
4.3 3.3 2.3 1.3 0.3
4.4 3.4 2.4 1.4 0.4

e- Rotation for 180 degrees looks like this:
4.4 4.3 4.2 4.1 4.0
3.4 3.3 3.2 3.1 3.0
2.4 2.3 2.2 2.1 2.0
1.4 1.3 1.2 1.1 1.0
0.4 0.3 0.2 0.1 0.0

f- Rotation for 270 degrees looks like this:
0.4 1.4 2.4 3.4 4.4
0.3 1.3 2.3 3.3 4.3
0.2 1.2 2.2 3.2 4.2
0.1 1.1 2.1 3.1 4.1
0.0 1.0 2.0 3.0 4.0


You have to implement next methods:

public static void rotate90(double[][] matrix) {

     <write your code here>

}



public static void rotate180(double[][] matrix) {

      <write your code here>

}



public static void rotate270(double[][] matrix) {

       <write your code here>

}
*/

//Java
        import java.util.Scanner;

        public class MatrixRotation {

            public static void main(String[] args) {
                Scanner in = new Scanner(System.in);

                System.out.print("Please, enter matrix size: ");
                int size = in.nextInt();
                double[][] matrix = generateMatrix(size);

                System.out.println("How you want to rotate matrix:" + System.lineSeparator() +
                        "\t1 - 90" + System.lineSeparator() +
                        "\t2 - 180" + System.lineSeparator() +
                        "\t3 - 270");
                int mode = in.nextInt();

                System.out.println(System.lineSeparator() + "Base matrix:" + System.lineSeparator());
                printMatrixToConsole(matrix);
                System.out.println();

                if (rotateMatrix(matrix, mode)) {
                    printMatrixToConsole(matrix);
                }
            }

            private static double[][] generateMatrix(int size) {
                double[][] matrix = new double[size][size];

                for (int i = 0; i < matrix.length; i++) {
                    for (int j = 0; j < matrix.length; j++) {
                        matrix[i][j] = Double.valueOf(i + "." + j);
                    }
                }
                return matrix;
            }

            private static boolean rotateMatrix(double[][] matrix, int mode) {
                switch (mode) {
                    case 1:
                        System.out.println("90 degrees rotated:" + System.lineSeparator());
                        rotate90(matrix);
                        break;
                    case 2:
                        System.out.println("180 degrees rotated:" + System.lineSeparator());
                        rotate180(matrix);
                        break;
                    case 3:
                        System.out.println("270 degrees rotated:" + System.lineSeparator());
                        rotate270(matrix);
                        break;
                    default:
                        System.out.println("You selected non-existing mode!");
                        return false;
                }
                return true;
            }

            private static void transposeMatrix(double[][] matrix) {
                int n = matrix.length;
                for (int i = 0; i < n; i++) {
                    for (int j = i + 1; j < n; j++) {
                        double temp = matrix[i][j];
                        matrix[i][j] = matrix[j][i];
                        matrix[j][i] = temp;
                    }
                }
            }

            private static void verticalReflection(double[][] matrix) {
                int n = matrix.length;
                for (int i = 0; i < n; i++) {
                    for (int j = 0, k = n - 1; j < k; j++, k--) {
                        double temp = matrix[i][j];
                        matrix[i][j] = matrix[i][k];
                        matrix[i][k] = temp;
                    }
                }
            }

            private static void horizontalReflection(double[][] matrix) {
                int n = matrix.length;
                for (int i = 0, j = n - 1; i < j; i++, j--) {
                    double[] temp = matrix[i];
                    matrix[i] = matrix[j];
                    matrix[j] = temp;
                }
            }

            public static void rotate90(double[][] matrix) {
                transposeMatrix(matrix);
                verticalReflection(matrix);
            }

            public static void rotate180(double[][] matrix) {
                verticalReflection(matrix);
                horizontalReflection(matrix);
            }

            public static void rotate270(double[][] matrix) {
                transposeMatrix(matrix);
                horizontalReflection(matrix);
            }

            private static void printMatrixToConsole(double[][] matrix) {
                for (int i = 0; i < matrix.length; i++) {
                    for (int j = 0; j < matrix.length; j++) {
                        System.out.print(matrix[i][j] + "\t");
                    }
                    System.out.println();
                }
            }
        }

/*
Explanation:
    ** First of all, I'm using VS Code :) **

- This program creates a matrix and rotates it by 90, 180, or 270 degrees

## Program flow:
1- Ask user for matrix size and generate matrix with values like "row.column"
2- Ask user for rotation choice (90°, 180°, 270°)
3- Print original matrix, then apply rotation and print result

## Key rotation methods:
**rotate90()**: 
- First transpose (swap rows and columns)
- Then vertical reflection (flip left-right)

**rotate180()**:
- Vertical reflection (flip left-right)  
- Horizontal reflection (flip top-bottom)

**rotate270()**:
- First transpose (swap rows and columns)
- Then horizontal reflection (flip top-bottom)

## Helper methods:
- **transposeMatrix()**: swaps elements across diagonal
- **verticalReflection()**: reverses each row
- **horizontalReflection()**: reverses rows order

## Important details:
- Uses combinations of transpose and reflections for different rotations
- Matrix values show original positions for easy verification
- Works for any size matrix

📌Note: Each rotation combines basic operations instead of complex calculations
*/