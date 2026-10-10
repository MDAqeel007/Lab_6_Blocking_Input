import java.util.Scanner;
public class Lab_06_Task04_HighorLow
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int enternumber = 0;
        int randomNum = (int) (Math.random() * 10) + 1;
        boolean validInt = false;
        do {
            System.out.print("Enter the number 1 to 10: ");
            if (input.hasNextInt()) {
                enternumber= input.nextInt();
                if (enternumber >= 1 && enternumber <= 10) {
                    validInt = true;
                } else {
                    System.out.println("Please enter a value 1 to 10 inclusive.");
                }
            } else {
                String trash = input.next();
                System.out.println("Invalid input: \"" + trash + "\". Please enter a valid input 1 to 10 inclusive.");
            }
        } while (!validInt);

        System.out.println("The generated random value is : " + randomNum);
        if (enternumber > randomNum)
        {
            System.out.println("Your guess is High");
        }
        else  if (enternumber < randomNum)
        {
            System.out.println("Your guess is Low");
        }
        else
        {
            System.out.println("Your guess is on the money");
        }
    }
}
