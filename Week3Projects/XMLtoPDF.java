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
public class XMLtoPDF {
    
    public static void main(String[] args) throws Exception {
        
        XMLToArrayListObject xao = new XMLToArrayListObject(FilePath.path+"customer.xml");
        ArrayList<CustomerDetails> al = xao.readXMl();
        ArrayListObjectToPDF aop = new ArrayListObjectToPDF(al);
        aop.createPDF(al);
    }
    
}
