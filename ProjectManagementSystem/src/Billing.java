// Import required packages
import java.lang.*;
import java.util.*;

public class Billing {

    private double billingAmount;
    private double amountCustomerPaid;

    // Overload constructors depending on implementation of class
    public Billing(double billingAmount, double amountCustomerPaid){
        this.billingAmount = billingAmount;
        this.amountCustomerPaid = amountCustomerPaid;

    }

    public Billing(){

    }

    // Get functions to retrieve variable values
    private double getBillingAmount(){
        return this.billingAmount;
    }

    private double getAmountCustomerPaid(){
        return this.amountCustomerPaid;
    }

    // Set functions to set variables values
    private void setBillingAmount(double billingAmount){
        this.billingAmount = billingAmount;
    }
    private void setAmountCustomerPaid(double amountCustomerPaid){
        this.amountCustomerPaid = amountCustomerPaid;
    }

    // Update functions to modify variable values
    public void updateBillingAmount(double billingAmount){
        setBillingAmount(billingAmount);
    }

    public void updateAmountCustomerPaid(double amountCustomerPaid){
        System.out.println("Enter amount customer has paid: R");
        Scanner input = new Scanner(System.in);
        setAmountCustomerPaid(input.nextDouble());
    }

    // Functions used to display billing information
    public double displayBillingAmount(){
        return getBillingAmount();
    }

    public double displayAmountCustomerPaid(){
        return getAmountCustomerPaid();
    }

    // Function is used to update billing information for project
    public void setBillingAmountForProject(){
        System.out.print("Enter the cost of the project: R");
        Scanner input = new Scanner(System.in);
        setBillingAmount(input.nextDouble());

    }


}




