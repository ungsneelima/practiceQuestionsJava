package coding;

import java.util.Scanner;

public class SaloonCustomers {
	class Salon {
	    private String name;
	    private int customerCount;

	    public Salon(String name) {
	        this.name = name;
	        this.customerCount = 0;
	    }

	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	}

	        public static void main(String[] args) {
	    	String[] salons = new String[100]; 
	        int[] customerCounts = new int[100]; 
	        int salonCount = 0;
	        int totalCustomers = 0;

	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Enter the salon name and customer name (type 'done' to finish):");

	        while (true) {
	            System.out.print("Enter salon name: ");
	            String salonName = scanner.nextLine();

	            if (salonName.equalsIgnoreCase("done")) {
	                break;
	            }

	            
	            System.out.print("Enter customer name: ");
	            String customerName = scanner.nextLine();

	            if (customerName.equalsIgnoreCase("done")) {
	                break;
	            }

	            
	            boolean salonExists = false;
	            for (int i = 0; i < salonCount; i++) {
	                if (salons[i].equals(salonName)) {
	                    customerCounts[i]++;
	                    salonExists = true;
	                    break;
	                }
	            }

	            
	            if (!salonExists) {
	                salons[salonCount] = salonName;
	                customerCounts[salonCount] = 1;
	                salonCount++;
	            }

	           
	            totalCustomers++;
	        }

	       
	        System.out.println("\nTotal number of salons: " + salonCount);
	        System.out.println("Total number of customers: " + totalCustomers);

	        System.out.println("\nSalon-wise customer counts:");
	        for (int i = 0; i < salonCount; i++) {
	            System.out.println("Salon: " + salons[i] + ", Customers: " + customerCounts[i]);
	        }

	       
	        scanner.close();
	    }
	}
