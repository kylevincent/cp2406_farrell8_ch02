/**
 * Created by jc431075 on 11/08/17.
 */
import java.util.Scanner;
public class QuartsToGallonsInteractive
{
    public static void main(String[] args)
    {
        int Quarts_In_Gallon = 4;
        int Quarts_Needed = 18;
        int Gallons_Needed;
        int Extra_Quarts;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your quarts needed:");
        Quarts_Needed = input.nextInt();
        Gallons_Needed = Quarts_Needed / Quarts_In_Gallon;
        Extra_Quarts = Quarts_Needed % Quarts_In_Gallon;
        System.out.println("A job that needs " + Quarts_Needed + " quarts requires " + Gallons_Needed + " gallons plus " + Extra_Quarts + " quarts.");
    }
}
