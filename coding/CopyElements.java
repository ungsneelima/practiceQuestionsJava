package coding;
import java.util.Scanner;

public class CopyElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter size of the array: ");
        int size = scanner.nextInt();
        int[] arr1 = new int[size];
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            arr1[i] = scanner.nextInt();
        }
        int[] arr2 = new int[size];
        for (int i = 0; i < size; i++) {
            arr2[i] = arr1[i];
        }
        System.out.print("Copied Array: ");
        for (int num : arr2) {
            System.out.print(num + " ");
        }

        scanner.close();
    }
}
