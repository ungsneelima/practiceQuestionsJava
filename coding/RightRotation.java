package coding;

public class RightRotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {12,89,34,90,56};
		int n = arr.length;
		
		int temp = arr[n-1];
		int i;
		System.out.println("Original array is");
		for( i=0; i<n; i++) {
			System.out.println(arr[i]);
		}
		for(i= n-1;i>0; i--) {
		
				arr[i]=arr[i-1];
				
			}
		arr[i] = temp;
		System.out.println("The rotated array is");
		for( i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		

	}

}
