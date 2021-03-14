/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week3Projects;

import java.util.ArrayList;

/**
 *
 * @author Nagarajan
 */
public class XMLtoEmail {
    
    public static void main(String[] args) {
        new XMLtoEmail().sendEmail();
    }
    
    public void sendEmail()
    {
        try{
        XMLToArrayListObject xao = new XMLToArrayListObject(FilePath.path+"customer.xml");
        ArrayList<CustomerDetails> al = xao.readXMl();
        new ArrayListObjectToEmail().CustomerDetailsToString(al);
        }catch(Exception e){e.printStackTrace();}
    }
        
}
