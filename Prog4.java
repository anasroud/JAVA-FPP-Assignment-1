import java.util.Scanner;

import static java.util.Arrays.copyOf;

public class Main {

    public static String[] uniqueStringArray(String[] array) {
        String[] uniqueArray = new String[array.length];
        int index = 0;
        int numberOfDuplicates = 0;
        for (String str : array) {
            boolean isUnique = true;
            for (int i = 0; i < index; i++) {
                if (uniqueArray[i].equals(str)) {
                    numberOfDuplicates++;
                    isUnique = false;
                    break;
                }
            }

            // remove null values with using only copyOf method from Arrays class and not using any other method
            if (isUnique) {
                uniqueArray[index++] = str;
            }
        }
        uniqueArray = copyOf(uniqueArray, uniqueArray.length - numberOfDuplicates);

        return uniqueArray;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size = scanner.nextInt();
        String[] altArray = new String[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            altArray[i] = scanner.next();
        }
        String[] uniqueArray = uniqueStringArray(altArray);
        // now print the unique elements
        System.out.println("The unique elements in the array are:");
        for (String str : uniqueArray) {
            System.out.println(str);
        }
    }
}