package Week3;
import java.util.Scanner;
import java.util.Random;
public class Pro3_64010801 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size for the matrix: ");
        int size = input.nextInt();
        input.close();
        Random rand = new Random();
        if (size >= 2) {
            int[][] matrix = new int[size][size];
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    matrix[i][j] = rand.nextInt(2);
                    System.out.print(matrix[i][j]);
                }
                System.out.println();
            }
            rowcol(matrix, size);
            diagonal(matrix, size);
        }else  System.out.print("ERROR");
    }

    public static void rowcol(int[][] matrix, int num) {
        boolean rowc = false;
        boolean colc = false;
        for (int i = 0; i < num; i++) {
            int n = 0;
            for (int j = 0; j < num; j++) {
                n += matrix[i][j];
                if (n == 0 && j == num - 1) {
                    rowc = true;
                    System.out.print("All 0s on row " + i + "\n");
                } else if (n == num) {
                    rowc = true;
                    System.out.print("All 1s on row " + i + "\n");
                }
            }
        }
        if (rowc == false)
            System.out.print("No same numbers on a row\n");
        for (int i = 0; i < num; i++) {
            int n = 0;
            for (int j = 0; j < num; j++) {
                n += matrix[j][i];
                if (n == 0 && j == num - 1) {
                    colc = true;
                    System.out.print("All 0s on column " + i + "\n");
                } else if (n == num) {
                    colc = true;
                    System.out.print("All 1s on column " + i + "\n");
                }
            }
        }
        if (colc == false)
            System.out.print("No same numbers on a column\n");
    }

    public static void diagonal(int[][] matrix, int num) {
        boolean check = false;
        int n = 0;
        int j = 0;
        for (int i = 0; i < num - 1; i++) {
            j++;
            n += matrix[i][j];
            if (n == 0 && i == num - 2) {
                check = true;
                System.out.print("All 0s on the superdiagonal\n");
            } else if (n == num - 1) {
                check = true;
                System.out.print("All 1s on the superdiagonal\n");
            }
        }
        if (check == false)
            System.out.print("No same numbers on the superdiagonal\n");
        check = false;
        n = 0;
        for (int i = 0; i < num; i++) {
            n += matrix[i][i];
            if (n == 0 && i == num - 1) {
                check = true;
                System.out.print("All 0s on the diagonal\n");
            } else if (n == num) {
                check = true;
                System.out.print("All 1s on the diagonal\n");
            }
        }
        if (check == false)
            System.out.print("No same numbers on the diagonal\n");
        check = false;
        n = 0;
        j = 0;
        for (int i = 1; i < num; i++) {
            n += matrix[i][j];
            if (n == 0 && i == num - 2) {
                check = true;
                System.out.print("All 0s on the subdiagonal\n");
            } else if (n == num - 1) {
                check = true;
                System.out.print("All 1s on the subdiagonal\n");
            }
            j++;
        }
        if (check == false)
            System.out.print("No same numbers on the subdiagonal\n");
    }
}