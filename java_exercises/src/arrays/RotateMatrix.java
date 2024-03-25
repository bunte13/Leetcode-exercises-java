// package arrays;
/**
 * RotateMatrix
 */
public class RotateMatrix {

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        System.out.println("Matrix:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(); // Move to the next line after printing each row
        }
        //transponiranje na matriksot
        //elementite od dvete strani od glavnata dijagonala sakame da si gi smenat mestata
        for(int i = 0; i<matrix.length;i++){
            for(int j = i; j<matrix[i].length;j++){ //tuka imav greshka
                int pom = matrix[j][i];
                matrix[j][i] = matrix[i][j];
                matrix[i][j] = pom;
            }
        }
        System.out.println("transponated matrix:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(); // Move to the next line after printing each row
        }

        for(int i = 0;i<matrix.length;i++){
            for(int j = 0,k = matrix[i].length-1; j<k;j++,k--){
                 int pom = matrix[i][k];
                 matrix[i][k] = matrix[i][j];
                 matrix[i][j] = pom;
            }
        }
        System.out.println("90 degree rotated matrix:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(); // Move to the next line after printing each row
        }
    }
}