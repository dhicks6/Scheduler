public class Task{
// What variables does a task need?
    // A task should have a time/date entered
    // A task should have a time/date of when the task is due/wanted to be displayed
    // A task should have a recurrance variable to set it as daily, weekly, monthly, oneshot
    // A task could have a family like for a specific class or activity
        // this could be displayed in different colors to display the different familys like Calc2 items are in blue, CS items are in green

    // Var for time/date entered. Java provides a Date class in the java.util package
        // tutorial on https://www.tutorialspoint.com/java/java_date_time.htm
    Date dateEntered = new Date;

    // Var for time/date due. Java provides a Date class in the java.util package
    // tutorial on https://www.tutorialspoint.com/java/java_date_time.htm
    Date dueDate = new Date;

    // For recurrance I need to have possibly a method to set which of the different setting is needed
        // this method could take in a string that parses into the wanted recurrance
    //However I could just have boolieans that all start as false and switch to what is wanted
    // For now I will go with a simple string method
    public string recurrence(String input) {
        String selectedRecurrence;
        if (input == "Daily") {
            selectedRecurrence = "Daily";
        }
        else if(input == "Weekly") {
            selectedRecurrence = "Weekly"
        }
        else if(input == "Monthly") {
            selectedRecurrence = "Monthly"
        }
        else if(input == "Oneshot") {
            selectedRecurrence = "Oneshot"
        }

        return selectedRecurrence;
    }

    // For setting the family that a task belongs to firstly if that family does not exist then it needs to be created.
    // If the family does exist then the task should be added to that family.
    // I think I should create a Family constructor that will allow for creation of new familys and have the constructor have
        // an array of tasks
}