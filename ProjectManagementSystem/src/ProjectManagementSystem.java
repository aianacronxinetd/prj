// Import required packages
import java.lang.*;
import java.util.*;

//Create main class
public class ProjectManagementSystem {

    //Function is used to display main menu for program
    public static void displayMainMenu(){
        System.out.println("Welcome to the Poise Project Management System");
        System.out.println("Please select one of the following options\n");
        System.out.println("1 - Create new project");
        System.out.println("2 - Update details of project");
        System.out.println("3 - Update billing information of project");
        System.out.println("4 - Update details of architect");
        System.out.println("5 - Update details of contractor");
        System.out.println("6 - Update details of customer");
        System.out.println("7 - Search for existing project");
        System.out.println("8 - Generate project reports");
        System.out.println("9 - Exit");
        System.out.print(": ");

    }

    //Main function
    public static void main(String[] args){

        Project newProject = new Project();
        Architect projectArchitect = new Architect();
        Contractor projectContractor = new Contractor();
        Customer projectCustomer = new Customer();
        Billing projectBilling = new Billing();
        Building projectBuilding = new Building();

        //Start while. Ask the user to select an option
        while(true){

            //Display main menu
            displayMainMenu();

            int userMenuChoice;
            Scanner mainMenuInput = new Scanner(System.in);
            userMenuChoice = mainMenuInput.nextInt();

            //If option 1 is selected, register details of new project
            if(userMenuChoice == 1){

                    // Call function from newProject object to register a new project
                    System.out.println("Project details");
                    System.out.println("=================\n");
                    newProject.registerNewProject();

                    //Call function from building option to register details about building
                    System.out.println("\nBuilding details");
                    System.out.println("=================\n");
                    projectBuilding.registerNewBuilding();

                    // Call function to register details about billing
                    System.out.println("\nBilling Information");
                    System.out.println("=================\n");
                    projectBilling.setBillingAmountForProject();

                    // Register details about project architect
                    System.out.println("\nArchitect details");
                    System.out.println("=================\n");
                    projectArchitect.registerNewUser();

                    // Register details about contractor
                    System.out.println("\nContractor details");
                    System.out.println("=================\n");
                    projectContractor.registerNewUser();

                    // Register details about customer
                    System.out.println("\nCustomer details");
                    System.out.println("=================\n");
                    projectCustomer.registerNewUser();

                }

            // Update project details
            else if(userMenuChoice == 2) {

                    System.out.println("Select one of the following options: ");
                    System.out.println("1 - Update project number");
                    System.out.println("2 - Update Project name");
                    System.out.println("3 - Update project due date");
                    System.out.println("4 - Mark project as complete");
                    System.out.println("-1 - Return to the previous menu");
                    System.out.print(": ");

                    Scanner input = new Scanner(System.in);

                    // Use switch statement to specify which details regarding project to update.
                    switch(input.nextInt()){
                        case 1:
                            newProject.updateProjectNumber();
                            break;
                        case 2:
                            newProject.updateProjectName();
                            break;
                        case 3:
                            newProject.updateProjectDueDate();
                            break;
                        case 4:
                            newProject.updateProjectStatusToComplete();
                            break;
                        case -1:
                            break;
                        default:
                            System.out.println("Invalid option chosen");
                            break;

                    }

                }

            // Update billing information for project
            else if(userMenuChoice == 3){

                    System.out.println("Select one of the following options");
                    System.out.println("1 - Enter amount customer has paid");
                    System.out.println("-1 - Return to the previous menu");
                    System.out.print(": ");

                    Scanner input = new Scanner(System.in);

                    switch(input.nextInt()) {
                        case -1:
                            break;
                        case 1:
                            System.out.print("Enter the amount the customer has paid: R");
                            Scanner customerAmountPaid = new Scanner(System.in);
                            projectBilling.updateAmountCustomerPaid(customerAmountPaid.nextDouble());
                        default:
                            System.out.println("Invalid option chosen");
                            break;
                    }

                }

            // Still needs to be implemented
            else if(userMenuChoice == 4){}

            // Update contactor information
            else if(userMenuChoice == 5) {

                    System.out.println("Select one of the following options");
                    System.out.println("1 - Update name");
                    System.out.println("2 - Update telephone number");
                    System.out.println("3 - Update email address");
                    System.out.println("4 - Update physical address");
                    System.out.println("-1 - Return to the previous menu");
                    System.out.print(": ");

                    Scanner input = new Scanner(System.in);
                    switch (input.nextInt()) {
                        case 1:
                            projectContractor.updateName();
                            break;
                        case 2:
                            projectContractor.updateTelephoneNumber();
                            break;
                        case 3:
                            projectContractor.updateEmailAddress();
                            break;
                        case 4:
                            projectContractor.updatePhysicalAddress();
                            break;
                        default:
                            System.out.println("Invalid option chosen\n");
                            break;
                    }
            }


            // Still needs to be implemented
            else if(userMenuChoice == 6){}

            // Still needs to be implemented
            else if(userMenuChoice == 7){}

            else if(userMenuChoice == 8){}

            // Exit program.
            else if(userMenuChoice == 9){
                System.out.println("Goodbye!");
                break;
            }

            // Inform user if an invalid option is selected
            else{
                System.out.println("Invalid option chosen");
            }



        }

    }
}
