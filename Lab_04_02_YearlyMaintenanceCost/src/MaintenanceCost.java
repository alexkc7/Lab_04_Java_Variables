import java.util.Scanner;

public class MaintenanceCost {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Winter maintenance cost: ");
        double winterCost = input.nextDouble();
        System.out.print("\nEnter Spring maintenance cost: ");
        double springCost = input.nextDouble();
        System.out.print("\nEnter Summer maintenance cost: ");
        double summerCost = input.nextDouble();
        System.out.print("\nEnter Fall maintenance cost: ");
        double fallCost = input.nextDouble();

        double yearlyCost = winterCost + springCost + summerCost + fallCost;

        System.out.print("Cost per season: " + "\nWinter: " + winterCost + "\nSpring: " + springCost + "\nSummer: " + summerCost + "\nFall: " + fallCost  + "\nTotal Yearly Maintenance Cost: " + yearlyCost);


    }
}