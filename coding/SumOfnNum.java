package coding;

import java.util.*;

public class SumOfnNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of terms you want ");
		int a = scanner.nextInt();
		int sum = 0;
		
		for(int i=1; i <= a; i++) {
			sum = sum+i;
			System.out.println(sum);
			}
		System.out.println("The total sum of first " +a+ " numbers is " +sum);
			
	}

}
