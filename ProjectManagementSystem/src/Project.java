// Import required packages
import java.lang.*;
import java.util.*;

// Project class
public class Project {

    // Declare initial variables. Declare as private. Accessed though get and set functions.
    private String projectNumber;
    private String projectName;
    private String dueDate;
    private String[] projectDetails = new String[3];
    private String projectStatus = "Open";

    // Overload constructors depending on implementation of class
    public Project(String projectNumber, String projectName, String dueDate){
        this.projectNumber = projectNumber;
        this.projectName = projectName;
        this.dueDate = dueDate;

    }

    public Project(){

    }

    // Get functions to retrieve variable values
    private String getProjectNumber(){
      return this.projectNumber;
    }

    private String getProjectName(){
        return this.projectName;
    }

    private String getDueDate(){
        return this.dueDate;
    }

    private String getProjectStatus(){
        return this.projectStatus;
    }

    // Set functions to set variables values
    private void setProjectNumber(String projectNumber){
        this.projectNumber = projectNumber;
    }

    private void setProjectStatus(String projectStatus){
        this.projectStatus = projectStatus;
    }

    private void setProjectName(String projectName){
        this.projectName = projectName;
    }

    private void setDueDate(String dueDate){
        this.dueDate = dueDate;
    }


    // Function is used to display details regarding Project
    public void ProjectDetails(){
        this.projectDetails[0] = getProjectNumber();
        this.projectDetails[1] = getProjectName();
        this.projectDetails[2] = getDueDate();
        this.projectDetails[3] = getProjectStatus();

        System.out.println("\n");
        System.out.println("Project Number: " + projectDetails[0]);
        System.out.println("Project Name: " + projectDetails[1]);
        System.out.println("Project due date: " + projectDetails[2]);
        System.out.println("Project status: " + projectDetails[3]);
        System.out.println("\n");
    }

    // Update funcitons to modify variable values
    public void updateProjectNumber(){
        System.out.print("Please enter a new project number: ");
        Scanner input = new Scanner(System.in);
        setProjectNumber(input.nextLine());
    }


    public void updateProjectName(){
        System.out.print("Please enter a new project name: ");
        Scanner input = new Scanner(System.in);
        setProjectName(input.nextLine());
    }


    public void updateProjectDueDate(){
        System.out.print("Please enter a new project due date: ");
        Scanner input= new Scanner(System.in);
        setDueDate(input.nextLine());
    }

    public void updateProjectStatusToComplete(){
        System.out.println("\nProject finalized and marked as complete\n");
        String projectStatus = "Complete";
        setProjectStatus(projectStatus);
    }

    // Function is used to register a new project.
    public void registerNewProject() {

        System.out.print("Project number: ");
        Scanner projectNumberInput = new Scanner(System.in);
        setProjectNumber(projectNumberInput.nextLine());

        System.out.print("Project name: ");
        Scanner projectNameInput = new Scanner(System.in);
        setProjectName(projectNameInput.nextLine());

        System.out.print("Project due date: ");
        Scanner projectDueDateInput = new Scanner(System.in);
        setDueDate(projectDueDateInput.nextLine());

    }

}
