import java.util.Scanner;
public class CtoF
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int userInput = 0;
        String invalid = "";
        int degreesF = 0;

        for (int i = 0; i < 1; i++)
        {
            System.out.println("Please enter the temperature to be converted from Celsius to Fahrenheit: ");
            if(in.hasNextInt())
            {
                userInput = in.nextInt();
                in.nextLine();
                System.out.println("Converting " + userInput + " degrees Celsius to Fahrenheit...");
            }
            else {
                invalid = in.nextLine();
                System.out.println("Did not enter a valid input! Try again and input an integer.");
                i = -1;
            }
        }
        degreesF = 32 + (userInput * 9) / 5;
        System.out.println(userInput + " degrees Celsius converts to " + degreesF + " degrees Fahrenheit.");
    }
}
