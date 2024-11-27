import java.util.Scanner;

public class Main {

    public static void secondMin(int[] arrayOfInts) {
        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;
        for (int arrayOfInt : arrayOfInts) {
            if (arrayOfInt < min) {
                secondMin = min;
                min = arrayOfInt;
            } else if (arrayOfInt < secondMin && arrayOfInt != min) {
                secondMin = arrayOfInt;
            }
        }
        System.out.println("The second minimum value is: " + secondMin);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size = scanner.nextInt();
        int[] arrayOfInts = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            arrayOfInts[i] = scanner.nextInt();
        }
        secondMin(arrayOfInts);
    }
}