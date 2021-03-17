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
interface InvoiceMasterDAOinterface{

        public int insertInvoice(InvoiceMasterDTO invDTO);
	public int deleteInvoice(int invno);
	public int updateInvoice(InvoiceMasterDTO invDTO);
	public InvoiceMasterDTO getInvoiceMaster(int invo);
	public Set<InvoiceMasterDTO> getInvoiceMasterAll();
}
public class InvoiceMasterDAO implements InvoiceMasterDAOinterface{

    @Override
    public int insertInvoice(InvoiceMasterDTO invMasterDTO) {
        
        
        try {
            dbUtils db = new dbUtils();
            Connection con = db.getConnection();
            String sql = "Insert into InvoiceMaster Values(?,?,?)";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, invMasterDTO.getInvno());
            stmt.setInt(2,invMasterDTO.getCustomerNo());
            
            SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
            Date utilDate = format.parse(invMasterDTO.getInvDate());
            stmt.setDate(3,new java.sql.Date(utilDate.getTime()));
            
            int num = stmt.executeUpdate();
            db.closeConnection(null);
            return num;
        } catch (Exception ex) {
            Logger.getLogger(InvoiceMasterDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return 0;
    }

    @Override
    public int deleteInvoice(int invno) {
     
        try {
            dbUtils db = new dbUtils();
            Connection con = db.getConnection();
            String sql = "Delete from invoicemaster where invno = ?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1,invno);
            int res = stmt.executeUpdate();
            db.closeConnection(null);
            return res;
            
        } catch (SQLException ex) {
            Logger.getLogger(InvoiceMasterDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }

    @Override
    public int updateInvoice(InvoiceMasterDTO invDTO) {
        
        try {
            dbUtils db = new dbUtils();
            Connection con = db.getConnection();
            String sql = "update invoicemaster set custno = ?, invDate = ? where invno = ?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1,invDTO.getCustomerNo());
            
            SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
            Date utilDate = format.parse(invDTO.getInvDate());
            stmt.setDate(2,new java.sql.Date(utilDate.getTime()));
            
            stmt.setInt(3,invDTO.getInvno());
            
            int res = stmt.executeUpdate();
            db.closeConnection(null);
            return res;
            
        } catch (Exception ex) {
            Logger.getLogger(InvoiceMasterDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
     return 0;   
    }

    @Override
    public InvoiceMasterDTO getInvoiceMaster(int invno) {
        
        try {
            dbUtils db = new dbUtils();
            Connection con = db.getConnection();
            String sql = "select * from InvoiceMaster where invno = ?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1,invno);
            ResultSet rs = stmt.executeQuery();
            InvoiceMasterDTO obj = new InvoiceMasterDTO();
            while(rs.next())
            {
                obj.setInvno(rs.getInt(1));
                obj.setCustomerNo(rs.getInt(2));
                obj.setInvDate(rs.getDate(3).toString());
            }
            db.closeConnection(null);
            return obj;
        } catch (SQLException ex) {
            Logger.getLogger(InvoiceMasterDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public Set<InvoiceMasterDTO> getInvoiceMasterAll() {
        
        try {
            dbUtils db = new dbUtils();
            Connection con = db.getConnection();
            String sql = "select * from InvoiceMaster";
            PreparedStatement stmt = con.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            Set<InvoiceMasterDTO> set = new HashSet<>();
            while(rs.next())
            {
            InvoiceMasterDTO obj = new InvoiceMasterDTO();
                obj.setInvno(rs.getInt(1));
                obj.setCustomerNo(rs.getInt(2));
                obj.setInvDate(rs.getDate(3).toString());
                set.add(obj);
            }
            db.closeConnection(null);
            return set;
        } catch (SQLException ex) {
            Logger.getLogger(InvoiceMasterDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return null;
    }

   
    
}
