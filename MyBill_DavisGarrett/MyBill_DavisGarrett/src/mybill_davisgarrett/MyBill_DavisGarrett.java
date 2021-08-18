
package mybill_davisgarrett;

/**
 * Garrett Davis
 * CSC 251
 * 9/16/21
 * MyBill_DavisGarrett
 */
import javax.swing.JOptionPane;//import joptionpane
public class MyBill_DavisGarrett {
    public static void main(String[] args) {
        String name;//declare name for user input
        String creditHours;//declare creditHours for user input
        String bill;//declare our pricerpercredit hour variable as "bill"
        double fees = 56;//hard code our fees as they do not change(for now)
        
        name = JOptionPane.showInputDialog("What is your name? ");//prompt user for name input
        creditHours = JOptionPane.showInputDialog("How many credit hours are you taking? ");//prompt user for credit hour input
        bill = JOptionPane.showInputDialog("How much does each credit hour cost? ");//prompt user for bill input
        
        int realBill = calculateBill(creditHours, bill);//we're running ouur calculateBill method and applying our return variable "realBill" to our actual realBill placeholder that we made earlier
       
        printBill(realBill, name, creditHours, bill, fees);//calling our printBill method so that we will print our bill
    };
        public static int calculateBill(String creditHours, String  bill)//calculateBill method that requires our credithour input and bill input
        {
            int fees = 56;
            int realBill;
            int intHours = Integer.parseInt(creditHours);
            int pricePerHour = Integer.parseInt(bill);
            realBill = (intHours * pricePerHour) + fees;
            return realBill;
            
        };
         public static void printBill(int entry, String name, String creditHours, String bill, double fees)//printBill method that will take pretty much all input and print our bill and info required
         {
             JOptionPane.showMessageDialog(null,"Your name is: " + name + "\n" 
                     + creditHours + " credit hours" + "\n" +
                "\n" + "Your complete bill is: " + entry + " This includes " 
                     + creditHours + " credit hours at 76$ per hour " +
                fees + (" in fees") + "\n(25$ for activity fee)\n " 
                        + "(15$ for campus fee)\n (16$ for tech fee)" );
         };
        
    }
    

