/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day22;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Nagarajan
 */
interface ItemMasterDAOInterface {

    public int insertItem(ItemMasterDTO itemMasterDTO);

    public int deleteItem(int itemno);

    public int updateItem(ItemMasterDTO itemMasterDTO);

    public ItemMasterDTO getItem(int itemno);

    public Set<ItemMasterDTO> getItem();
}

public class ItemMasterDAO implements ItemMasterDAOInterface {

    @Override
    public int insertItem(ItemMasterDTO itemDTO) {

        try {
            dbUtils db = new dbUtils();
            Connection con = db.getConnection();
            String sql = "Insert into itemdetails Values(?,?,?,?)";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, itemDTO.getItemno());
            stmt.setString(2, itemDTO.getItemDeac());
            stmt.setString(3, itemDTO.getItemPrice());
            stmt.setString(4, itemDTO.getItemQty());
            int num = stmt.executeUpdate();
            db.closeConnection(null);
            return num;
        } catch (SQLException ex) {
            Logger.getLogger(ItemMasterDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return -1;
    }

    @Override
    public int deleteItem(int itemno) {

        try {
            dbUtils db = new dbUtils();
            Connection con = db.getConnection();
            String sql = "Delete from itemdetails where itemno = ?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, itemno);
            int res = stmt.executeUpdate();
            db.closeConnection(null);
            return res;
        } catch (SQLException ex) {
            Logger.getLogger(ItemMasterDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }

    @Override
    public int updateItem(ItemMasterDTO itemDTO) {
        try {
            dbUtils db = new dbUtils();
            Connection con = db.getConnection();
            String sql = "update itemdetails set desc = ?, price = ?, qty = ? where itemno = ?";
            PreparedStatement stmt = con.prepareStatement(sql);

            stmt.setString(1, itemDTO.getItemDeac());
            stmt.setString(2, itemDTO.getItemPrice());
            stmt.setString(3, itemDTO.getItemQty());
            stmt.setInt(4, itemDTO.getItemno());

            int res = stmt.executeUpdate();
            db.closeConnection(null);
            return res;
        } catch (SQLException ex) {
            Logger.getLogger(ItemMasterDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }

    @Override
    public ItemMasterDTO getItem(int itemno) {

        try {
            dbUtils db = new dbUtils();
            Connection con = db.getConnection();
            String sql = "select * from itemdetails where itemno = ?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, itemno);
            ResultSet rs = stmt.executeQuery();
            ItemMasterDTO obj = new ItemMasterDTO();
            if (rs.next()) {
                obj.setItemno(rs.getInt(1));
                obj.setItemDeac(rs.getString(2));
                obj.setItemPrice(rs.getString(3));
                obj.setItemQty(rs.getString(4));
            }
            db.closeConnection(null);
            return obj;
        } catch (SQLException ex) {
            Logger.getLogger(ItemMasterDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public Set<ItemMasterDTO> getItem() {
        try {
            dbUtils db = new dbUtils();
            Connection con = db.getConnection();
            String sql = "select * from itemdetails";
            PreparedStatement stmt = con.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            Set<ItemMasterDTO> set = new HashSet<>();
            if (rs.next()) {
                ItemMasterDTO obj = new ItemMasterDTO();
                
                obj.setItemno(rs.getInt(1));
                obj.setItemDeac(rs.getString(2));
                obj.setItemPrice(rs.getString(3));
                obj.setItemQty(rs.getString(4));
                
                set.add(obj);
            }
            db.closeConnection(null);
            return set;
        } catch (SQLException ex) {
            Logger.getLogger(ItemMasterDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

}
