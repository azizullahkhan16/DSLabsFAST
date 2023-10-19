package Lab01;

import java.util.Scanner;

public class DynamicArray2D<T extends Comparable<T>> {


    private T[][] dynamicArray;

    public DynamicArray2D() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int columns = scanner.nextInt();

        this.dynamicArray = (T[][]) new Comparable[rows][columns];

        print2DArray();

        for (int i = 0; i < dynamicArray.length; i++) {
            for (int j = 0; j < dynamicArray[i].length; j++) {
                System.out.print("Enter the value: ");
                dynamicArray[i][j] = (T) scanner.next();
                print2DArray();
            }
        }



    }

    private void print2DArray() {
        for (int i = 0; i < dynamicArray.length; i++) {
            for (int j = 0; j < dynamicArray[i].length; j++) {
                System.out.print(dynamicArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}
