/*Write a program for shopping carts. Ask users to enter item name, quantity and amount
per item and calculate final and show the bill in a pretty format.
Operations
1. Add Item
2. Remove Item
3. View Cart
4. Exit
Add Item
Item Name
Quantity
Price per Unit
Remove Item
Item Name
View Cart */


import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

class Shopping_Cart {
    private String name;
    private int quantity;
    private double price;

    public String getName() {
        return this.name;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public double getPrice() {
        return this.price;
    }

    public Shopping_Cart(String name, int quantity, double price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

}

public class eCommerce {

    ArrayList<Shopping_Cart> cart = new ArrayList<>();


    public void Add_Item(String name, int quantity, double price) {
//        name=name;
//        quantity=quantity;
//        price=price;
        Shopping_Cart c = new Shopping_Cart(name, quantity, price);
        cart.add(c);
    }

    public void Remove_Item(Scanner sc) {

        Iterator<Shopping_Cart> i = cart.iterator();
        String name;
        if (i.hasNext()) {
            System.out.println("Enter the Item Name for remove:");
            name = sc.next();
            while (i.hasNext()) {
                Shopping_Cart c = i.next();
                if (c.getName().equals(name)) {
                    i.remove();
                    System.out.println("Item Removed Successfully");
                }else {
                    System.out.println("\nThis item does not exist");
                    System.out.println("Items in cart...\n");
                    View_cart();
                }
            }
        } else {
            System.out.println("No item exists to remove ");
        }
        // cart.removeIf(c -> c.getName().equals(name));
    }

    public void View_cart() {
        if (cart.isEmpty()) {
            System.out.println("Nothing is in the cart...");
        } else {
            System.out.println("Item Name  Quantity   amount   Total price");
            for (Shopping_Cart c : cart) {
                System.out.println(c.getName() + " " + c.getQuantity() + " " + c.getPrice());
            }
        }
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        eCommerce pr = new eCommerce();
        String name;
        int quantity;
        double price;

        while (true) {

            System.out.println("\nOperations....\n");
            System.out.println("1.Add Item \n" + "2. Remove Item \n" + "3. View Cart \n" + "4. Exit");
            System.out.println("\nEnter your choice :");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter Item Name :");
                    name = sc.next();
                    System.out.println("Enter the Quantity :");
                    quantity = sc.nextInt();
                    System.out.println("Enter Item Price pr Unit :");
                    price = sc.nextInt();
                    pr.Add_Item(name, quantity, price);
                    System.out.println("Item Added Successfully");
                    break;
                case 2:
//                    System.out.println("Enter the Item Name :");
//                    name = sc.next();
                    pr.Remove_Item(sc);
                    break;
                case 3:
//                        System.out.println("Item Name  Quantity   amount   Total price");
                    pr.View_cart();

                    break;
                case 4:
                    return;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
