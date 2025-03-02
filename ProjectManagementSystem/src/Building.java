// Import required packages
import java.lang.*;
import java.util.*;

// Building class
public class Building {
    private String buildingType;
    private String physicalAddress;
    private String erfNumber;

    // Overload constructors depending on implementation of class
    public Building(String buildingType, String physicalAddress, String erfNumber){
        this.buildingType = buildingType;
        this.physicalAddress = physicalAddress;
        this.erfNumber = erfNumber;
    }

    public Building(){

    }

    // Get functions to retrieve variable values
    private String getBuildingType(){
        return this.buildingType;
    }

    private String getPhysicalAddress(){
        return this.physicalAddress;
    }

    private String getErfNumber(){
        return this.erfNumber;
    }

    // Set functions to set variables values
    private void setBuildingType(String buildingType){
        this.buildingType = buildingType;
    }

    private void setPhysicalAddress(String physicalAddress){
        this.physicalAddress = physicalAddress;
    }

    private void setErfNumber(String erfNumber){
        this.erfNumber = erfNumber;
    }

    // Update functions to modify variable values
    public void updateBuildingType(String buildingType){
        setBuildingType(buildingType);
    }

    public void updatePhysicalAddress(String physicalAddress){
        setPhysicalAddress(physicalAddress);
    }

    public void updateErfNumber(String erfNumber){
        setErfNumber(erfNumber);
    }

    // Functions used to display building information.
    public void displayBuildingType(String buildingType){
        getBuildingType();
    }

    public void displayPhysicalAddress(String physicalAddress){
        getPhysicalAddress();
    }

    public void displayErfNumber(String erfNumber){
        getErfNumber();
    }

    // Function used to register a new building
    public void registerNewBuilding(){
        System.out.print("Type of the building being registered: ");
        Scanner buildingTypeInput = new Scanner(System.in);
        setBuildingType(buildingTypeInput.nextLine());

        System.out.print("Physical address of the building: ");
        Scanner buildingAddressInput = new Scanner(System.in);
        setPhysicalAddress(buildingAddressInput.nextLine());

        System.out.print("ERF number of the building: ");
        Scanner buildingErfNumberInput = new Scanner(System.in);
        setErfNumber(buildingErfNumberInput.nextLine());
    }



}
