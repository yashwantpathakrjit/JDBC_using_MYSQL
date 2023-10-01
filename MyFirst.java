import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


    public class MyFirst
    {
        public static void main(String args[]){
            String URL="JDBC:Mysql://localhost:3306/login";
            String username="root";
            String password="";
            try (Connection con = DriverManager.getConnection(URL, username, password);
            Statement stm = con.createStatement()) {

           
           String sqlQuery = "SELECT * FROM sem4 where name ='yashwant pathak'";

           
           ResultSet resultSet = stm.executeQuery(sqlQuery);

           
           while (resultSet.next()) {
               String  result = resultSet.getString("BT401"); //result is column name in mysql db
               String name = resultSet.getString("name"); // name is also column name 
               
               System.out.println("Result is: " + result + ", Name: " + name);//variables
           }

       } catch (SQLException e) {
                e.printStackTrace();
            }
           } 

        }