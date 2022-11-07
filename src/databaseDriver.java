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
            ResultSet resultSet=statement.executeQuery("select * from tasks_table");
            while(resultSet.next())  {
            System.out.println(resultSet.getInt(1)+" , "+resultSet.getString(2)+" , "
                +resultSet.getString(3)+" , "+resultSet.getString(4)+" , "+resultSet.getString(5)
                +",  "+resultSet.getString(6)+",  "+resultSet.getString(7));  
            }
            connection.close();  
            }catch(Exception e){ System.out.println(e);}  
        }
}