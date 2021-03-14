/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week3Projects;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Nagarajan
 */
public class XMLToSMS {
    
    public static void main(String[] args) {
        
        XMLToArrayListObject xao = new XMLToArrayListObject(FilePath.path+"customer.xml");
        try {
            ArrayList<CustomerDetails> al = xao.readXMl();
            new ArrayListObjectToSMS().send(al);
        } catch (Exception ex) {
            Logger.getLogger(XMLToSMS.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
