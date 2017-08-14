import javax.swing.*;

/**
 * Created by jc431075 on 11/08/17.
 */
public class TravelTickets
{
    public static void main(String[] args)
    {
        String GetTicketNumber = JOptionPane.showInputDialog(null, "Please enter ticket number");
        String MakeActualTicketNumber = GetTicketNumber.substring(0, GetTicketNumber.length() - 1);
        String MakeLastTicketNumber = GetTicketNumber.substring(GetTicketNumber.length() -1);
        Long ActualTicketNumber = Long.parseLong(MakeActualTicketNumber);
        Long LastTIcketNumber = Long.parseLong(MakeLastTicketNumber);
        if (ActualTicketNumber % 7 == LastTIcketNumber )
            System.out.println("True");
        else
            System.out.println("False");
    }
}
