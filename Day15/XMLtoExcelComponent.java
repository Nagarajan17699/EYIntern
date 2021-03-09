/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day15;

import java.util.ArrayList;

/**
 *
 * @author Nagarajan
 */

/* Classes used XMLToArrayListObject, ArrayObjectToExcel, FilePath
    
    
 */
public class XMLtoExcelComponent {

}

class XMLtoExcelConversion {

    public void XMLtoExcel() throws Exception {
        XMLToArrayListObject xao = new XMLToArrayListObject(FilePath.path + "customer.xml");
        ArrayList<CustomerDetails> al = xao.readXMl();
        ArrayListObjectToExcel aoe = new ArrayListObjectToExcel();
        
    }

}
