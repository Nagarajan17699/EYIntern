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
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Nagarajan
 */
interface PurchasingDAOInterface{
        public int insertPurchasing(PurchasingDTO purchasingDTO);
	public int deletePurchasing(int invno, int itemno);
	public int updatePurchasing(PurchasingDTO purchasingDTO);
	public PurchasingDTO getPurchasing(int invo, int itemno);
	public Set<PurchasingDTO> getPurchasing();
}
public class PurchasingDAO implements PurchasingDAOInterface{

    @Override
    public int insertPurchasing(PurchasingDTO purchasingDTO) {

        try {
            dbUtils db = new dbUtils();
            Connection con = db.getConnection();
            String sql = "Insert into purchasing Values(?,?,?)";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1,purchasingDTO.getInvno());
            stmt.setInt(2,purchasingDTO.getItemno());
            stmt.setInt(3,purchasingDTO.getItemunit());
            
            int num = stmt.executeUpdate();
            db.closeConnection(null);
            return num;
        } catch (SQLException ex) {
            Logger.getLogger(PurchasingDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }

    @Override
    public int deletePurchasing(int invno, int itemno) {
        try {
            dbUtils db = new dbUtils();
            Connection con = db.getConnection();
            String sql = "delete from purchasing where invno = ? and itemno = ?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, invno);
            stmt.setInt(2,itemno);
            int num = stmt.executeUpdate();
            db.closeConnection(null);
            return num;
        } catch (SQLException ex) {
            Logger.getLogger(PurchasingDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }

    @Override
    public int updatePurchasing(PurchasingDTO purchasingDTO) {
        try {
            dbUtils db = new dbUtils();
            Connection con = db.getConnection();
            String sql = "update purchasing set itemno = ?, itemunit = ? where invno = ?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1,purchasingDTO.getItemno());
            
            stmt.setInt(2,purchasingDTO.getItemunit());
            
            stmt.setInt(3,purchasingDTO.getInvno());
            
            int res = stmt.executeUpdate();
            db.closeConnection(null);
            return res;
        } catch (SQLException ex) {
            Logger.getLogger(PurchasingDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
 }

    @Override
    public PurchasingDTO getPurchasing(int invno, int itemno) {
        try {
            dbUtils db = new dbUtils();
            Connection con = db.getConnection();
            String sql = "select * from purchasing where invno = ? and itemno = ?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1,invno);
            stmt.setInt(2, itemno);
            ResultSet rs = stmt.executeQuery();
            PurchasingDTO obj = new PurchasingDTO();
            if(rs.next())
            {
                obj.setInvno(rs.getInt(1));
                obj.setItemno(rs.getInt(2));
                obj.setItemunit(rs.getInt(3));
                
            }
            db.closeConnection(null);
            return obj;
        } catch (SQLException ex) {
            Logger.getLogger(PurchasingDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
 }

    @Override
    public Set<PurchasingDTO> getPurchasing() {
        try {
            dbUtils db = new dbUtils();
            Connection con = db.getConnection();
            String sql = "select * from purchasing";
            PreparedStatement stmt = con.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            Set<PurchasingDTO> set = new HashSet<>();
            if(rs.next())
            {
                
                PurchasingDTO obj = new PurchasingDTO();
                obj.setInvno(rs.getInt(1));
                obj.setItemno(rs.getInt(2));
                obj.setItemunit(rs.getInt(3));
                set.add(obj);
            }
            db.closeConnection(null);
            return set;
        } catch (SQLException ex) {
            Logger.getLogger(PurchasingDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
 }
    
}
