// Import required packages
import java.lang.*;
import java.util.*;

// Class inherits from user class. Overload constructors depending on implementation
public class Architect extends User {
    public Architect(String name, String telephoneNumber, String emailAddress, String physicalAddress) {
        super(name, telephoneNumber, emailAddress, physicalAddress);
    }

    public Architect(){
        super();
    }


}
