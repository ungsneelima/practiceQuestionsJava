package coding;
import java.util.*;
public class EvenSumOddProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size = sc.nextInt();
		int arr[] = new int[size];
		
		System.out.println("Enter the elements in the array");
		for(int i=0; i<size; i++) {
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Array in forward order");
		for(int i=0; i<size; i++) {
			System.out.print(arr[i] +" ");
			System.out.println();
		}
		
		System.out.println("Array in reverse order");
		for(int i=size-1; i>=0; i--) {
			System.out.print(arr[i] +" ");
		}
		
		
		
	}

}
