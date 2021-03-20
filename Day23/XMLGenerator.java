/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day23;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Nagarajan
 */
public class XMLGenerator {
    
    public  void generateXML(String invno,Generator gen) throws Exception
    {
        try {
            Connection con = new dbUtils().getConnection();
            String sql = "Select * from buyinglist where invno = ?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, invno);
            ResultSet rs = stmt.executeQuery();
            HashSet<BuyingList> set = new HashSet<>();
            while(rs.next())
            {
                BuyingList by = new BuyingList();
                by.setInvno(rs.getString(1));
                by.setItemno(rs.getString(2));
                by.setQuantity(rs.getString(3));
                by.setPrice(rs.getString(4));
                set.add(by);
                System.out.println("set size = "+set.size());
            }
                new XMLClass().createXML(set);
                XMLToArrayList xao = new XMLToArrayList("d:/NetBeans Project/InternExercise/src/Day23/newxml.xml");
                ArrayList<BuyingList> al = xao.readXMl();
                System.out.println("Size of ArrayList"+al.size());
                System.out.println("Passing PDF to AL->PDF");
                gen.create(al);
                
                
                    } catch (SQLException ex) {
            Logger.getLogger(XMLGenerator.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
