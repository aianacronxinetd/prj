// Import required packages
import java.lang.*;
import java.util.*;

public class User {

    private String name;
    private String telephoneNumber;
    private String emailAddress;
    private String physicalAddress;

    // Overload constructors depending on implementation of class
    public User(String name, String telephoneNumber, String emailAddress, String physicalAddress){
        this.name = name;
        this.telephoneNumber = telephoneNumber;
        this.emailAddress = emailAddress;
        this.physicalAddress = physicalAddress;
    }

    public User(){

    }

    // Get functions to retrieve variable values
    private String getName(){
        return this.name;
    }

    private String getTelephoneNumber(){
        return this.telephoneNumber;
    }

    private String getEmailAddress(){
        return this.emailAddress;
    }

    private String getPhysicalAddress(){
        return this.physicalAddress;
    }

    // Set functions to set variables values
    private void setName(String name){
        this.name = name;
    }

    private void setTelephoneNumber(String telephoneNumber){
        this.telephoneNumber = telephoneNumber;
    }

    private void setEmailAddress(String emailAddress){
        this.emailAddress = emailAddress;
    }

    private void setPhysicalAddress(String physicalAddress){
        this.physicalAddress = physicalAddress;
    }

    // Update funcitons to modify variable values
    public void updateName(){
        System.out.println("Enter new name: ");
        Scanner input = new Scanner(System.in);
        setName(input.nextLine());

    }

    public void updateTelephoneNumber(){
        System.out.println("Enter new telephone number: ");
        Scanner input = new Scanner(System.in);
        setTelephoneNumber(input.nextLine());
    }

    public void updateEmailAddress(){
        System.out.println("Enter new email address: ");
        Scanner input = new Scanner(System.in);
        setEmailAddress(input.nextLine());
    }

    public void updatePhysicalAddress(){
        System.out.println("Enter new physical address: ");
        Scanner input = new Scanner(System.in);
        setPhysicalAddress(input.nextLine());
    }

    // Functions to display information about user.
    public String displayName(){
        return this.name;
    }

    public String displayTelephoneNumber(){
        return this.telephoneNumber;
    }

    public String displayEmailAddress(){
        return this.emailAddress;
    }

    public String displayPhysicalAddress(){
        return this.physicalAddress;
    }

    // Function used to register a new user
    public void registerNewUser(){
        System.out.print("Name of contact person: ");
        Scanner userNameInput = new Scanner(System.in);
        setName(userNameInput.nextLine());

        System.out.print("Number of contact person: ");
        Scanner userNumberInput = new Scanner(System.in);
        setTelephoneNumber(userNumberInput.nextLine());

        System.out.print("Email address of contact person: ");
        Scanner userEmailAddressInput = new Scanner(System.in);
        setEmailAddress(userEmailAddressInput.nextLine());

        System.out.print("Physical address of contact person: ");
        Scanner userPhysicalAddressInput = new Scanner(System.in);
        setPhysicalAddress(userPhysicalAddressInput.nextLine());

    }


}
