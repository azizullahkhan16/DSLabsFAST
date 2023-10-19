package Lab01;

import java.util.Scanner;

public class DynamicArray1D<T extends Comparable<T>> {

    private T[] dynamicArray;

    public DynamicArray1D() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int num = scanner.nextInt();

        dynamicArray = (T[]) new Comparable[num];

        for (int i = 0; i < dynamicArray.length; i++) {
            System.out.print("Enter the value: ");
            dynamicArray[i] = (T) scanner.next();
        }

        System.out.println("The values you entered are: ");
        printDynamicArray();
    }

    public void printDynamicArray() {
        for (int i = 0; i < dynamicArray.length; i++) {
            System.out.print(dynamicArray[i] + " ");
        }
    }
}
