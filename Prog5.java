import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the first array:");
        int size1 = scanner.nextInt();
        int[] arr1 = new int[size1];
        System.out.println("Enter the elements of the first array:");
        for (int i = 0; i < size1; i++) {
            arr1[i] = scanner.nextInt();
        }
        System.out.println("Enter the size of the second array:");
        int size2 = scanner.nextInt();
        int[] arr2 = new int[size2];
        System.out.println("Enter the elements of the second array:");
        for (int i = 0; i < size2; i++) {
            arr2[i] = scanner.nextInt();
        }
        int[] arr3 = new int[arr1.length + arr2.length];
        int i = 0;
        for (int value : arr1) {
            arr3[i] = value;
            i++;
        }
        for (int value : arr2) {
            arr3[i] = value;
            i++;
        }
        for (int value : arr3) {
            System.out.print(value + " ");
        }
    }
}