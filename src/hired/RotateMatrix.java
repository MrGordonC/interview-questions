package hired;

public class RotateMatrix {
    public static long[][] rotateMatrix(long[][] matrix) {
        // Type your solution here
        int size = matrix.length;
         long[][] ret = new long[size][size];

         for (int i = 0; i < size; ++i)
             for (int j = 0; j < size; ++j)
                 ret[i][j] = matrix[size - j - 1][i]; //***
         //     ret[i][j] = matrix[j][size - i - 1] counter cw rotation

         return ret;
    }
    
}
