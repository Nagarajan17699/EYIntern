/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day22;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 *
 * @author Nagarajan
 */
public class TestingClass {
    
    static InvoiceMasterDTO id = new InvoiceMasterDTO();
    static InvoiceMasterDAO da = new InvoiceMasterDAO();
    public static void main(String[] args) {
        id.setInvno(32423);
        id.setCustomerNo(245234);
        id.setInvDate("23/02/2021");
        System.out.println(da.insertInvoice(id));
        
        
    }
}
//