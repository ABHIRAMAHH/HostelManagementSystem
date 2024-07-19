/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Project;
import java.sql.*;
/**
 *
 * @author HP
 */
public class ConnectionProvider {
       public static Connection getCon()
        {
           try
           {
               Class.forName("com.mysql.cj.jdbc.Driver");
               Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hostel","root","1Abhi*0vishu");
               return con;
           }
           catch (Exception e) {
            System.out.println(e);// print the stack trace for better debugging
            return null;
           }
    }
}
