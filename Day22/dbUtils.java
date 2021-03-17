/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day22;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Nagarajan
 */
public class dbUtils {

    static Properties prop;

    static {

        try {
            prop = new Properties();
            prop.load(new FileInputStream("dbconfig.properties"));
            Class.forName(prop.getProperty("driver"));

        } catch (Exception ex) {

        }
    }

    private static ThreadLocal<Connection> tl = new ThreadLocal<>();

    public Connection getConnection() {
        Connection con = tl.get();
        try {
            if (con == null) {
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/zval","root","1234");
                tl.set(con);
                con.setAutoCommit(false);
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        return con;

    }

    public void closeConnection(Exception e) {
       Connection con = tl.get();
        try{
            
            if(e == null)
            {
                con.commit();
            }
            else
            {
                con.rollback();
                con.commit();
            }
            
            con.close(); 
            tl.remove();
        }catch(Exception xe){}
    }

}
