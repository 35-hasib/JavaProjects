/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PhoneBook;

import java.awt.*;
import java.sql.*;

public class Connection_class {
    Connection con;
    Statement stm;
    
    Connection_class(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/phonebook","root","3434");
            stm = con.createStatement();
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
    }
    public static void main(String[] args) {
        new Connection_class();
    }
}
