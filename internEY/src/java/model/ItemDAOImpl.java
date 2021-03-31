/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletContext;

/**
 *
 * @author Nagarajan
 */
public class ItemDAOImpl implements ItemDAO{

    static ItemDAOImpl id;
    public static ItemDAOImpl getItemDAOImpl()
    {
        if(id == null)
           id = new ItemDAOImpl();
        return id;
    }
    
    @Override
    public ArrayList<ItemDTO> getByCatagory(String cat, Properties prop) {
        try {
           // System.out.println("inside getByCatagory");
            Connection con = DBUtility.getConnection(prop);
            String sql = "select * from itemstable where catagory = ?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1,cat);
            ResultSet rs = stmt.executeQuery();
            ArrayList<ItemDTO> arr = new ArrayList<>();
            while(rs.next())
            {
               ItemDTO td =  new ItemDTO();
               td.setName(rs.getString("name"));
               td.setDescp(rs.getString("descp"));
               td.setPrice(rs.getString("price"));
               td.setCatagory(rs.getString("catagory"));
                System.out.println("IN while loop getBy Cat");
                System.out.println(td);
               arr.add(td);
            }
            
            return arr;
        } catch (SQLException ex) {
            Logger.getLogger(ItemDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public void insertItem(ItemDTO id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteItem(String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updateItem(String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ItemDTO getByName(String name, Properties prop) {
        try {
            Connection con = DBUtility.getConnection(prop);
            String sql = "select * from itemstable where name = ?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1,name);
            ResultSet rs = stmt.executeQuery();
            ItemDTO td =  new ItemDTO();
            if(rs.next())
            {
               
               td.setName(rs.getString("name"));
               td.setDescp(rs.getString("descp"));
               td.setPrice(rs.getString("price"));
               td.setCatagory(rs.getString("catagory"));
            }
            return td;
        } catch (SQLException ex) {
            Logger.getLogger(ItemDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    
}
