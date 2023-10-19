package Lab01;

import java.util.ArrayList;
import java.util.Scanner;

public class JaggedArray {

    private ArrayList<ArrayList<Integer>> jaggedArray;

    public JaggedArray() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int num = scanner.nextInt();
        this.jaggedArray = new ArrayList<>(num);

        for (int i = 0; i < num; i++) {
            System.out.print("Enter Row " + (i+1) + " size: ");
            int size = scanner.nextInt();

            ArrayList<Integer> row = new ArrayList<>(size);
            for (int j = 0; j < size; j++) {
                System.out.print("Enter element " + (j + 1) + " for Row " + (i + 1) + ": ");
                int element = scanner.nextInt();
                row.add(element);
            }

            jaggedArray.add(row);
        }

        printArray();

    }

    private void printArray() {

        for (int i = 0; i < jaggedArray.size(); i++) {
            for (int j = 0; j < jaggedArray.get(i).size(); j++) {
                System.out.print(jaggedArray.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }
}
