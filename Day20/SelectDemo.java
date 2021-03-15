/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day20;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Nagarajan
 */
public class SelectDemo {
    
    public static void main(String[] args)throws Exception {
           Class.forName("com.mysql.jdbc.Driver");
           Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/zval", "root", "1234");
           String str = "select * from iaemarks";
           Statement stmt = con.createStatement();
           ResultSet rs = stmt.executeQuery(str);
           
           while(rs.next())
           {
               System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4));
           }
           
    }
}
