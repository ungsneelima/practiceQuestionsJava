package coding;

import java.util.Scanner;

public class UniqEleArr {

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

		System.out.println("Original array");
		for(int i=0; i<size; i++) {
			System.out.println(arr[i]+" ");
		}
		System.out.println();
		
		System.out.println("Unique elements in the array");
		boolean unique = true;
		for(int i=0; i<size; i++) {
			
			for(int j=0; j<size; j++) {
				if(i!=j && arr[i]==arr[j]) {
					unique = false;
					break;

				}
				
			}if(unique) {
				System.out.println(arr[i]+" ");
			}
		}if(!unique) {
			System.out.println("No unique elements found");
		}

	}

}
