import java.util.Scanner;

public class MagicalSquare {
    private static int matrixDimension = 2;
    private static int numberOfRows = 2;
    private static int numberOfColumns = 2;
    private static int matrix[][] = new int[numberOfRows][numberOfColumns];

    public static void readMatrixFromConsoleAndSeeIfItIsMagic(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give the elements for two dimensional matrix: ");
        for (int i = 0; i < numberOfRows; i++){
            for(int j = 0; j < numberOfColumns; j++){
                System.out.print("a["+i+"]["+j+"] = ");
                matrix[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Matrix elements are: ");
        for (int i = 0; i < numberOfRows; i++) {
            for (int j = 0; j < numberOfColumns; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        if (MagicalSquare.checkIfMatrixIsMagic(matrix)){
            System.out.println("Entered Matrix is MAGIC!");
        }
        else {
            System.out.println("Entered Matrix is not magic!");
        }
    }

    public static boolean checkIfMatrixIsMagic(int matrix[][]){
        int diagonalSum = 0;

        for(int d = 0; d < matrixDimension; d++){
            diagonalSum += matrix[d][d];
        }

        for(int i = 0; i < numberOfRows; i++){
            int rowSum = 0;
            for(int j = 0; j < numberOfColumns; j++){
                rowSum += matrix[i][j];
            }
            if (rowSum != diagonalSum){
                return false;
            }
        }

        for(int i = 0; i < numberOfRows; i++){
            int colSum = 0;
            for(int j = 0; j < numberOfColumns; j++){
                colSum += matrix[j][i];
            }
            if (diagonalSum != colSum){
                return false;
            }
        }

    return true;
    }
}
