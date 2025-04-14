package coding;
import java.util.*;
public class Searching {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size = sc.nextInt();
		int a[]= new int[size];
		System.out.println(" Enter the elements in the array");
		for(int i=0; i<size; i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("Enter the number to be searched");
		int key = sc.nextInt();

		boolean flag = false;
		for(int i=0; i<size; i++) {
			if(a[i]==key) {
				 flag = true;
				 System.out.println("Element "+key+" found at index of "+i);
				 break;
				 	}
		}
			if(!flag){
				 System.out.println("Element "+key+" not found in the array ");
				
				 	}
	}
}

