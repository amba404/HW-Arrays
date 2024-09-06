import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // Task 1
        printTaskTitle(1);

        int[] iArr = new int[3];
        for (int i = 0; i < iArr.length; i++) {
            iArr[i] = i + 1;
        }

        double[] dArr = {1.57, 7.654, 9.986};

        char[] cArr = {'J', 'a', 'v', 'a'};

        System.out.println("(no out)");

        // Task 2
        printTaskTitle(2);

        printArrElements(iArr);
        printArrElements(dArr);
        printArrElements(cArr);

        // Task 3
        printTaskTitle(3);

        printArrElementsReverse(iArr);
        printArrElementsReverse(dArr);
        printArrElementsReverse(cArr);

        //Task 4
        printTaskTitle(4);

        for (int i = 0; i < iArr.length; i++)
            if (iArr[i] % 2 > 0)
                iArr[i]++;

        System.out.println(Arrays.toString(iArr));

    }


    public static void printTaskTitle(int taskNumber) {

        System.out.printf("\n    Task %2d\n", taskNumber);
        System.out.println("---------------");

    }

    public static void printArrElements(Object arr) {

        int arrLen = Array.getLength(arr);
        for (int i = 0; i < arrLen; i++) {
            System.out.print(Array.get(arr, i));
            if (i < arrLen - 1) {
                System.out.print(", ");
            } else {
                System.out.println();
            }
        }

    }

    public static void printArrElementsReverse(Object arr) {

        int arrLen = Array.getLength(arr);
        for (int i = arrLen - 1; i >= 0; i--) {
            System.out.print(Array.get(arr, i));
            if (i > 0) {
                System.out.print(", ");
            } else {
                System.out.println();
            }
        }

    }
}