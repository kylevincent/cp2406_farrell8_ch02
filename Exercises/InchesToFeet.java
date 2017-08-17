import javax.swing.*;

/**
 * Created by jc431075 on 17/08/17.
 */
public class InchesToFeet
{
    public static void main(String[] args)
    {
        Integer total_inches = 86;
        Integer inches_in_foot = 12;
        Integer remainder_inches = total_inches % inches_in_foot;
        Integer total_feet = total_inches / inches_in_foot;
        JOptionPane.showMessageDialog(null, "Total length is "+total_feet+" feet and "+remainder_inches+" inches.");
    }
}
