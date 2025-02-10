import java.util.Scanner;

public class SalesTax {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the purchase price: ");
        double purchasePrice = input.nextDouble();
        double salesTax = purchasePrice * 1.05;

        System.out.println("Initial purchase price: " + purchasePrice + ".");
        System.out.println("Price after sales tax (5%): " + salesTax + ".");
    }
}