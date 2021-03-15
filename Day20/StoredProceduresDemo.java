/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day20;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Types;

/**
 *
 * @author Nagarajan
 */
public class StoredProceduresDemo {
    
    public static void main(String[] args) throws Exception {
        
           Class.forName("com.mysql.jdbc.Driver");
         Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/zval", "root", "1234");
         CallableStatement cs = con.prepareCall("{call proc1(?,?)}");
         cs.setString(1, "naga");
         cs.registerOutParameter(2, Types.VARCHAR);
         System.out.println(cs.getString(2));
         
    }
}
