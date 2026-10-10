import java.util.Scanner;
public class Lab_06_Task02_FuelCosts
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        double gallonsofGasintank = 0.0;
        double Fuelefficiencymilespergallon = 0.0;
        double priceofgaspergallon = 0.0;
        double costtodrive100miles = 0.0;
        double fulltankMiles = 0.0;
        boolean validGallons = false;
        do {
            System.out.print("Enter Gallons of Gas in tank: ");
            if (input.hasNextDouble()) {
                gallonsofGasintank = input.nextDouble();
                if (gallonsofGasintank > 0) {
                    validGallons = true;
                } else {
                    System.out.println("Please enter a value greater than 0.");
                }
            } else {
                String trash = input.next();
                System.out.println("Invalid input: \"" + trash + "\". Please enter a valid number.");
            }
        } while (!validGallons);

        boolean validMpg = false;
        do {
            System.out.print("Enter Fuel Efficiency miles per gallon: ");
            if (input.hasNextDouble()) {
                Fuelefficiencymilespergallon = input.nextDouble();
                if (Fuelefficiencymilespergallon > 0) {
                    validMpg = true;
                } else {
                    System.out.println("Please enter a value greater than 0.");
                }
            } else {
                String trash = input.next();
                System.out.println("Invalid input: \"" + trash + "\". Please enter a valid number.");
            }
        } while (!validMpg);

        boolean validPrice = false;
        do {
            System.out.print("Enter Price of gas per gallon: ");
            if (input.hasNextDouble()) {
                priceofgaspergallon = input.nextDouble();
                if (priceofgaspergallon > 0) {
                    validPrice = true;
                } else {
                    System.out.println("Please enter a value greater than 0.");
                }
            } else {
                String trash = input.next();
                System.out.println("Invalid input: \"" + trash + "\". Please enter a valid number.");
            }
        } while (!validPrice);

        costtodrive100miles = (100.0 / Fuelefficiencymilespergallon) * priceofgaspergallon;
        System.out.printf("The cost to drive 100 miles is $%.2f%n", costtodrive100miles);

        fulltankMiles = gallonsofGasintank * Fuelefficiencymilespergallon;
        System.out.printf("Full tank of gas miles is %.2f miles%n", fulltankMiles);
    }
}