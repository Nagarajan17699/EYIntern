/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day22;

import java.util.Date;

/**
 *
 * @author Nagarajan
 */
public class InvoiceMasterDTO {
    
    private int invno;
    private String invDate;
    private int customerNo;

    @Override
    public String toString() {
        return "InvoiceMasterDTO{" + "invno=" + invno + ", invDate=" + invDate + ", customerNo=" + customerNo + '}';
    }

    public int getInvno() {
        return invno;
    }

    public void setInvno(int invno) {
        this.invno = invno;
    }

    public String getInvDate() {
        return invDate;
    }

    public void setInvDate(String invDate) {
        this.invDate = invDate;
    }
   
    public int getCustomerNo() {
        return customerNo;
    }

    public void setCustomerNo(int customerNo) {
        this.customerNo = customerNo;
    }
    
}
