/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week3Projects;

import Week3Projects.CustomerDetails;
import Week3Projects.XMLToArrayListObject;
import Week3Projects.ArrayListObjectToExcel;
import java.util.ArrayList;

/**
 *
 * @author Nagarajan
 */

/* Classes used XMLToArrayListObject, ArrayObjectToExcel, FilePath
    
    
 */
public class XMLtoExcelComponent {

    public static void main(String[] args) throws Exception {
        
        XMLtoExcelConversion xec = new XMLtoExcelConversion();
        xec.XMLtoExcel();
    }
}

/** 
 Execute this file to convert the XML to Excel in the given format
 
 */
class XMLtoExcelConversion {

    public void XMLtoExcel() throws Exception {
        XMLToArrayListObject xao = new XMLToArrayListObject(FilePath.path + "customer.xml");
        ArrayList<CustomerDetails> al = xao.readXMl();
        ArrayListObjectToExcel aoe = new ArrayListObjectToExcel();
        aoe.ObjecttoExcel(al);
        
    }

}
