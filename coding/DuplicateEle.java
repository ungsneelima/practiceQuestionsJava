package coding;
import java.util.Scanner;
public class DuplicateEle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the elements in the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Original array:");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("Duplicate elements in the array:");
        boolean hasDuplicates = false; 
        boolean[] visited = new boolean[size];
        for (int i = 0; i < size; i++) {
            if (visited[i]) {
                continue; 
            }
            boolean isDuplicate = false;
            for (int j = i + 1; j < size; j++) {
                if (arr[i] == arr[j]) {
                    isDuplicate = true;
                    visited[j] = true; 
                }
            }
            if (isDuplicate) {
                System.out.println(arr[i]);
                hasDuplicates = true;
            }
        }
        if (!hasDuplicates) {
            System.out.println("No duplicate elements found.");
        }
    }
}
