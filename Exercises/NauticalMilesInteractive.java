/**
 * Created by jc431075 on 11/08/17.
 */
import javax.swing.*;
import java.util.Scanner;
public class NauticalMilesInteractive
{
    public static void main(String[]args)
    {
        double Kilometers_In_Naut = 1.852;
        double Miles_In_Naut = 1.150779;
        double NumOf_Naut_Miles = getNauticalMiles();
        double Total_Kilometers;
        double Total_Miles;
        Total_Kilometers = NumOf_Naut_Miles * Kilometers_In_Naut;
        Total_Miles = NumOf_Naut_Miles * Miles_In_Naut;
        JOptionPane.showMessageDialog(null,"For " + NumOf_Naut_Miles + " nautical miles, there are " + Total_Kilometers + " total kilometers and " + Total_Miles + " total miles.");
    }
    public static double getNauticalMiles()
    {
        String nauticalString = JOptionPane.showInputDialog(null, "Pleas enter nautical miles");
        Double NumOf_Naut_Miles = Double.parseDouble(nauticalString);
        return NumOf_Naut_Miles;
    }
}
