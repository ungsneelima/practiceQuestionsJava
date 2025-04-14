package coding;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// Owner Class: Manages the menu
class Owner {
    private Map<String, Double> menu;

    public Owner() {
        menu  = new HashMap<>();
        // Adding some default menu items
        menu.put("IDLY", 30.00);
        menu.put("DOSA", 50.00);
        menu.put("VADA", 40.00);
        menu.put("CHAPATHI", 50.00);
    }

    public void displayMenu() {
        System.out.println("\n--- Menu ---");
        for (Map.Entry<String, Double> item : menu.entrySet()) {
            System.out.println(item.getKey() + " - Rs " + item.getValue());
        }
    }

    public Map<String, Double> getMenu() {
        return menu;
    }
}

// Customer Class: Places orders
class Customer {
    private String name;
    private Map<String, Integer> order;

    public Customer(String name) {
        this.name = name;
        this.order = new HashMap<>();
    }

    public void placeOrder(String item, int quantity, Map<String, Double> menu) {
        if (menu.containsKey(item)) {
            order.put(item, order.getOrDefault(item, 0) + quantity);
        } else {
            System.out.println("Please select the item which is present in the menu.");
        }
    }

    public Map<String, Integer> getOrder() {
        return order;
    }

    public String getName() {
        return name;
    }
}

// Bill Class: Calculates and prints the bill
class Bill {
    public static void generateBill(Customer customer, Map<String, Double> menu) {
        System.out.println("\n--- Bill for " + customer.getName() + " ---");
        double total = 0;

        for (Map.Entry<String, Integer> item : customer.getOrder().entrySet()) {
            String itemName = item.getKey();
            int quantity = item.getValue();
            double price = menu.get(itemName);
            double cost = price * quantity;
            total += cost;
            System.out.println(itemName + " x " + quantity + " = Rs " + cost);
        }

        System.out.println("-------------------------");
        System.out.println("Total: Rs " + total);
    }
}

// Main Class
public class RestaurantManagement {
    public static void main(String[] args) {
        Owner owner = new Owner();
        owner.displayMenu();
       

        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter Customer Name: ");
        String customerName = scanner.nextLine();
        Customer customer = new Customer(customerName);

        while (true) {
            System.out.print("\nEnter item to order (or type 'done' to finish): ");
            String item = scanner.nextLine();
            if (item.equalsIgnoreCase("done")) break;

            if (!owner.getMenu().containsKey(item)) {
                System.out.println("Please select the item which is present in the menu.");
                continue;
            }

            System.out.print("Enter quantity: ");
            while (!scanner.hasNextInt()) {  // Ensure valid integer input
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.next();  // Clear the invalid input
            }
            int quantity = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            customer.placeOrder(item, quantity, owner.getMenu());
        }

        Bill.generateBill(customer, owner.getMenu());
        scanner.close();
    }
}
