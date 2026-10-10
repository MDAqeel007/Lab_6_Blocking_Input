import java.util.Scanner;
public class Lab_06_Task03_RectangleInfo
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        double height = 0.0;
        double width = 0.0;
        double area = 0.0;
        double perimeter = 0.0;
        double lengthoftheDiagonol = 0.0;
        boolean validHeight = false;
        do {
            System.out.print("Enter height of the Rectangle: ");
            if (input.hasNextDouble()) {
                height = input.nextDouble();
                if (height > 0) {
                    validHeight = true;
                } else {
                    System.out.println("Please enter a value greater than 0.");
                }
            } else {
                String trash = input.next();
                System.out.println("Invalid input: \"" + trash + "\". Please enter a valid number.");
            }
        } while (!validHeight);

        boolean validWidth = false;
        do {
            System.out.print("Enter width of the Rectangle: ");
            if (input.hasNextDouble()) {
                width = input.nextDouble();
                if (width > 0) {
                    validWidth = true;
                } else {
                    System.out.println("Please enter a value greater than 0.");
                }
            } else {
                String trash = input.next();
                System.out.println("Invalid input: \"" + trash + "\". Please enter a valid number.");
            }
        } while (!validWidth);

        area = width * height;
        System.out.println("The area of the rectangle is " + area);
        perimeter = 2 * (width + height);
        System.out.println("The perimeter of the rectangle is " + perimeter);
        lengthoftheDiagonol = Math.sqrt((width * width) + (height * height));
        System.out.println("The length of the diagonal is " + lengthoftheDiagonol);
    }
}
