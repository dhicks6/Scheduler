import java.sql.*;
public class databaseDriver {
    
    public void startDB() {
        String url="jdbc:mysql://localhost:3306/tasks";
        String username="root";
        String password="password";

        try{  
            Class.forName("com.mysql.cj.jdbc.Driver");  
            Connection connection=DriverManager.getConnection(url, username, password);  
            Statement statement=connection.createStatement(); 
            ResultSet rs=statement.executeQuery("select * from tasks_table");
            while(rs.next())  {
            System.out.println(rs.getInt(1)+" , "+rs.getString(2)+" , "+rs.getString(3)
            +" , "+rs.getString(4)+" , "+rs.getString(5)+",  "+rs.getString(6)
            +",  "+rs.getString(7));  
            }
            connection.close();  
            }catch(Exception e){ System.out.println(e);}  
        }

        /*
         * Here I want CRUD opperations for my database
         */
        public Void createTask(Date entryDate, Date dueDate, String taskFamily, String taskName, String taskDescription) {
            
            return(null);
        }

        public void readTask() {

        }

        public void updateTake() {

        }

        public void deleteTask() {

            
        }
}