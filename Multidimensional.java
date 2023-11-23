import java.util.Scanner;

public class Multidimensional {
    public  static int rawSize;
    public  static int columnSize;
    public  static int[][] array;

    public Multidimensional() {
        enterValuesFromConsole();
    }

    public static void enterValuesFromConsole() {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.print("rawSize ve columnSize-i  daxil edin: ");
            rawSize = scanner.nextInt();
            columnSize = scanner.nextInt();

            if (rawSize == columnSize) {
                break;
            } else {
                System.out.println("rawSize ve columnSize eyni olmalidir. Yeniden daxil edin.");
            }
        }

        array = new int[rawSize][columnSize];

        System.out.println("Array elementlerini daxil edin:");

        for (int i = 0; i < rawSize; i++) {
            for (int j = 0; j < columnSize; j++) {
                array[i][j] = scanner.nextInt();
            }
        }
    }

    public static int[] findFirstDiagonalElements() {
        int[] diagonalElements = new int[rawSize];

        for (int i = 0; i < rawSize; i++) {
            diagonalElements[i] = array[i][i];
        }
        return diagonalElements;
    }
    public static int[] findSecondDiagonalElements() {
        int[] diagonalElements = new int[rawSize];

        for (int i = 0; i < rawSize; i++) {
            diagonalElements[i] = array[i][rawSize - i - 1];
        }

        return diagonalElements;
    }

    public static void printArrayElementsInMatrixFormat() {
        System.out.println("Array elementleri ");

        for (int i = 0; i < rawSize; i++) {
            for (int j = 0; j < columnSize; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Multidimensional multidimensional = new Multidimensional();

        int[] firstDiagonalElements = findFirstDiagonalElements();
        int[] secondDiagonalElements = findSecondDiagonalElements();

        System.out.print("1-ci diaqonal: ");
        for (int element : firstDiagonalElements) {
            System.out.print(element + ", ");
        }
        System.out.println();
        System.out.print("2-ci diaqonal: ");
        for (int element : secondDiagonalElements) {
            System.out.print(element + ", ");
        }
        System.out.println();
        printArrayElementsInMatrixFormat();
    }
}