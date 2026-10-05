import java.util.Scanner;
public class Lab_06_Task01_CtoFConverter
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        double Celsius = 0.0;
        double Fahrenheit = 0.0;
        boolean inValid = false;
        do
        {
            System.out.print("Enter the Celsius Temperature: ");
            if (input.hasNextDouble())
            {
                Celsius = input.nextDouble();
                inValid = true;
            }
            else
            {
                String trash = input.nextLine();
                System.out.println("Invalid input: \"" + trash + "\". Please enter a valid number.");
            }
        }
        while (!inValid);
        Fahrenheit = (Celsius * 9.0/5.0) + 32;
        System.out.println("Fahrenheit Temperature: " + Fahrenheit);
    }
}
