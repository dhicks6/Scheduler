

public class Main {
    public static void main(String[] args) {
        gui begingui = new gui();
        begingui.startgui();
        databaseDriver startDB = new databaseDriver();
        startDB.startDB();

    }
    // How is my main class going to operate?
    // I will need a method that calls TaskDisplay
    // I will need a method that gets information as input and creates the new tasks
    //
}