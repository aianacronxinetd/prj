// Import required packages
import java.lang.*;
import java.util.*;

// Class inherits from user class. Overload constructors depending on implementation
public class Customer extends User{
    public Customer(String name, String telephoneNumber, String emailAddress, String physicalAddress) {
        super(name, telephoneNumber, emailAddress, physicalAddress);
    }

    public Customer(){
        super();
    }

}
