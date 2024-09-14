import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter your bill amount: ");
        int billing_amount=sc.nextInt();

        GroceryMart obj=new GroceryMart();
        obj.allowShopping(billing_amount);
        obj.addBalance(500);
    }
}