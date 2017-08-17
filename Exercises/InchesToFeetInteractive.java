import javax.swing.*;

/**
 * Created by jc431075 on 17/08/17.
 */
public class InchesToFeetInteractive
{
    public static void main(String[] args)
    {
        Integer total_inches = get_inches();
        Integer inches_in_foot = 12;
        Integer remainder_inches = total_inches % inches_in_foot;
        Integer total_feet = total_inches / inches_in_foot;
        JOptionPane.showMessageDialog(null, "Total length is "+total_feet+" feet and "+remainder_inches+" inches.");
    }
    public static int get_inches()
    {
        String getInput_Inches = JOptionPane.showInputDialog(null, "Enter total inches:");
        Integer converted_Inches = Integer.parseInt(getInput_Inches);
        return converted_Inches;
    }
}
