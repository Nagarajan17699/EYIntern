package model;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class DBUtility {
//	private static Properties prop;
//	static {
//		try {
//		prop=new Properties();
//		prop.load(new FileInputStream("dbconfig.properties"));
//		Class.forName(prop.getProperty("driver"));
//		}catch(Exception e) {
//			e.printStackTrace();
//		}
//	}
	private static ThreadLocal<Connection> tlocal=new ThreadLocal<>();
	
	synchronized public static Connection getConnection(Properties prop) {
		Connection con=tlocal.get();
		if(con==null) {
			try {
			con=DriverManager.getConnection
        (prop.getProperty("url"),prop.getProperty("username"),prop.getProperty("password"));
			con.setAutoCommit(false);
			tlocal.set(con);
			}catch(Exception e) {
				e.printStackTrace();
				return null;
			}			
		}
		return con;
	}
	
	synchronized public static void closeConnection(Exception e) {
		Connection con=tlocal.get();
		try {
		if(con!=null) {
		if(e==null) {
			con.commit();
			}
		else {
			con.rollback();
			con.commit();
		}
		tlocal.remove();
		con.close();
		}
		}catch(Exception exp) {
			exp.printStackTrace();
		}
	}
	
}
