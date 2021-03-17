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
interface CustomerDetailsDAOinterface {

    public int insertCustomerDetails(CustomerDetailsDTO custDTO);

    public int deleteCustomerDetails(int custno);

    public int updateCustomerDetails(CustomerDetailsDTO invMasterDTO);

    public CustomerDetailsDTO getCustomerDetails(int custno);

    public Set<CustomerDetailsDTO> getInvoiceMasterAl();
}

public class CustomerDetailsDAO implements CustomerDetailsDAOinterface {

    @Override
    public int insertCustomerDetails(CustomerDetailsDTO custDTO) {

        try {
            dbUtils db = new dbUtils();
            Connection con = db.getConnection();
            String sql = "Insert into customerdetails Values(?,?,?,?)";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, custDTO.getCustomerno());
            stmt.setString(2, custDTO.getCustomerEmail());
            stmt.setString(3, custDTO.getCustomerAddress());
            stmt.setString(4, custDTO.getCustomerPhone());
            int num = stmt.executeUpdate();
            db.closeConnection(null);
            return num;
        } catch (Exception ex) {
            Logger.getLogger(InvoiceMasterDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return 0;
    }

    @Override
    public int deleteCustomerDetails(int custno) {
        try {
            dbUtils db = new dbUtils();
            Connection con = db.getConnection();
            String sql = "Delete from customerdetails where custno = ?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, custno);
            int res = stmt.executeUpdate();
            db.closeConnection(null);
            return res;

        } catch (SQLException ex) {
            Logger.getLogger(InvoiceMasterDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }

    @Override
    public int updateCustomerDetails(CustomerDetailsDTO custDTO) {
        try {
            dbUtils db = new dbUtils();
            Connection con = db.getConnection();
            String sql = "update customerdetails set email = ?, address = ?, phone = ? where custno = ?";
            PreparedStatement stmt = con.prepareStatement(sql);
            
            stmt.setString(1, custDTO.getCustomerEmail());
            stmt.setString(2, custDTO.getCustomerAddress());
            stmt.setString(3, custDTO.getCustomerPhone());
            stmt.setInt(4, custDTO.getCustomerno());

            int res = stmt.executeUpdate();
            db.closeConnection(null);
            return res;

        } catch (Exception ex) {
            Logger.getLogger(CustomerDetailsDTO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return 0;
    }

    @Override
    public CustomerDetailsDTO getCustomerDetails(int custno) {
    
        try {
            dbUtils db = new dbUtils();
            Connection con = db.getConnection();
            String sql = "select * from customerdetails where custno = ?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1,custno);
            ResultSet rs = stmt.executeQuery();
            CustomerDetailsDTO obj = new CustomerDetailsDTO();
            if(rs.next())
            {
                obj.setCustomerno(rs.getInt(1));
                obj.setCustomerEmail(rs.getString(2));
                obj.setCustomerAddress(rs.getString(3));
                obj.setCustomerPhone(rs.getString(4));
            }
            db.closeConnection(null);
            return obj;
        } catch (SQLException ex) {
            Logger.getLogger(CustomerDetailsDTO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public Set<CustomerDetailsDTO> getInvoiceMasterAl() {
        
        try {
            dbUtils db = new dbUtils();
            Connection con = db.getConnection();
            String sql = "select * from customerdetails";
            PreparedStatement stmt = con.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            Set<CustomerDetailsDTO> set = new HashSet<>();
            if(rs.next())
            {
                
            CustomerDetailsDTO obj = new CustomerDetailsDTO();
                obj.setCustomerno(rs.getInt(1));
                obj.setCustomerEmail(rs.getString(2));
                obj.setCustomerAddress(rs.getString(3));
                obj.setCustomerPhone(rs.getString(4));
                set.add(obj);
            }
            db.closeConnection(null);
            return set;
        } catch (SQLException ex) {
            Logger.getLogger(CustomerDetailsDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

}
