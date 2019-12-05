package functions;

import java.util.Arrays;

public class matrix {
    public static void main(String[] args) {
        print2D(myMatrix(4));
    }

    public static int[][] myMatrix(int matrixSize) {
        int[][] outputMatrix = new int[matrixSize][matrixSize];

        for (int i = 0; i < matrixSize; i++) {
            for (int j = 0; j < matrixSize; j++) {
                if (i == j) {
                    outputMatrix[i][j] = 1;
                    //System.out.println(i + " " + j);
                } else {
                    outputMatrix[i][j] = 0;
                }
            }
        }

        for (int i = 0; i < outputMatrix.length; i++) {
            for (int j = 0; j < outputMatrix[i].length; j++) {
                System.out.print("| " + outputMatrix[i][j] + " ");
            }
            System.out.println("|");
        }
        return outputMatrix;
    }

    public static void print2D(int mat[][])
    {
        for (int i = 0; i < mat.length; i++)
        {
            for (int j = 0; j < mat[i].length; j++)
            {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }

    }
}
