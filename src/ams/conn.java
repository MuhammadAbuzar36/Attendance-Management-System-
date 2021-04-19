/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ams;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
public class conn {
    Connection con;
    Statement stmt;
    conn(){
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");  
            con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","abuzar","portable");  
            stmt=con.createStatement();  
        }
        catch(Exception e){ System.out.println(e);}
    }
    
}
