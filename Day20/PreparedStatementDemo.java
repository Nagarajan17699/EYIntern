/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day20;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

/**
 *
 * @author Nagarajan
 */
public class PreparedStatementDemo {
    
    public static void main(String[] args) throws Exception {
        
         Class.forName("com.mysql.jdbc.Driver");
         Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/zval", "root", "1234");
         String str = "insert into signin values (?,?)";
         PreparedStatement pstmt = con.prepareStatement(str);
         String str1,str2;
         str1 = new Scanner(System.in).nextLine();
         str2 = new Scanner(System.in).nextLine();
         pstmt.setString(1, str1);
         pstmt.setString(2,str2);
         int num = pstmt.executeUpdate();
         if(num > 0)
             System.out.println("Updation Successfull...");
         
           String str3 = "select * from signin";
           Statement stmt = con.createStatement();
           ResultSet rs = stmt.executeQuery(str3);
           
           while(rs.next())
           {
               System.out.println(rs.getString(1)+" "+rs.getString(2));
           }
           
           
         
    }
}
