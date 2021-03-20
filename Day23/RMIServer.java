/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day23;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Nagarajan
 */
public class RMIServer extends UnicastRemoteObject implements Business {

    /**
     *
     * @throws RemoteException
     */
    static RMIServer obj;

    public static RMIServer getObject() throws RemoteException {
        if (obj == null) {
            obj = new RMIServer();
        }
        return obj;
    }

    public RMIServer() throws RemoteException {
        System.out.println("Welcome to server ...");
    }

    @Override
    public int createInvoice(InvoiceDetails id) {
        try {
            BufferedWriter brw = new BufferedWriter(new OutputStreamWriter(System.out));
            System.out.println("Entering the Details in DataBase ...");
            dbUtils db = new dbUtils();
            Connection con = db.getConnection();
            String sql = "insert into invoicedetails values(?,?,?,?,?)";
            PreparedStatement pstmt = con.prepareStatement(sql);
            pstmt.setString(1, id.getInvno());
            pstmt.setString(2, id.getCustname());
            pstmt.setString(3, id.getAmount());
            pstmt.setString(4, id.getInvdate());
            pstmt.setString(5, id.getNodays());
            int res = pstmt.executeUpdate();
            db.closeConnection(null);
            System.out.println("Data inserted Successfully ...!");
            return res;

        } catch (Exception ex) {
            Logger.getLogger(RMIServer.class.getName()).log(Level.SEVERE, null, ex);
        }
        return -1;
    }

    @Override
    public int insertBuyingItems(HashSet<BuyingItems> bi) throws RemoteException {
        BufferedWriter brw = new BufferedWriter(new OutputStreamWriter(System.out));
        System.out.println("Entering the Details in DataBase ...");
        dbUtils db = new dbUtils();
        Connection con = db.getConnection();
        for (BuyingItems by : bi) {
            try {
                String sql = "insert into buyinglist values(?,?,?,?)";
                PreparedStatement stmt = con.prepareStatement(sql);
                stmt.setString(1, by.getInvno());
                stmt.setString(2, by.getItemno());
                stmt.setString(3, by.getQty());
                stmt.setString(4, by.getPrice());
                int res = stmt.executeUpdate();
                db.closeConnection(null);
                System.out.println("Inserted an Item...");
            } catch (SQLException ex) {
                Logger.getLogger(RMIServer.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

        return 0;
    }

    @Override
    public void createPDF(String invno) {
        
        try {
            BufferedWriter brw = new BufferedWriter(new OutputStreamWriter(System.out));
            System.out.println("Creating PDF ...");
            XMLGenerator xgen = new XMLGenerator();
            ArrayListToPDF pdf = new ArrayListToPDF();
            xgen.generateXML(invno,pdf);
        } catch (Exception ex) {
            Logger.getLogger(RMIServer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void createExcel(String invno) throws RemoteException {

        try {
            BufferedWriter brw = new BufferedWriter(new OutputStreamWriter(System.out));
            System.out.println("Creating Excel ...");
            XMLGenerator xgen = new XMLGenerator();
            ArrayListToExcel ex = new ArrayListToExcel();
            xgen.generateXML(invno,ex);
        } catch (Exception ex) {
            Logger.getLogger(RMIServer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
