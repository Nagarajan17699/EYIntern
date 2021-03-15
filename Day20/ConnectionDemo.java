/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day20;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Nagarajan
 */
public class ConnectionDemo {

    public static void main(String[] args) throws Exception {

            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/zval", "root", "1234");
            String sql = "select * from signin";
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            
            ResultSetMetaData rsmd = rs.getMetaData();
            System.out.println(rsmd.getColumnCount());
            
        

    }
}
