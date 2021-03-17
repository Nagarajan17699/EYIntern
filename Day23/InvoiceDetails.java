/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day23;

/**
 *
 * @author Nagarajan
 */
public class InvoiceDetails {

    static InvoiceDetails obj;
    private String invno, custname, amount, invdate, nodays;

    public String getNodays() {
        return nodays;
    }

    public void setNodays(String nodays) {
        this.nodays = nodays;
    }

    public String getInvno() {
        return invno;
    }

    public void setInvno(String invno) {
        this.invno = invno;
    }

    public String getCustname() {
        return custname;
    }

    public void setCustname(String custname) {
        this.custname = custname;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getInvdate() {
        return invdate;
    }

    public void setInvdate(String invdate) {
        this.invdate = invdate;
    }

    @Override
    public String toString() {
        return "InvoiceDetails{" + "invno=" + invno + ", custname=" + custname + ", amount=" + amount + ", invdate=" + invdate + ", nodays=" + nodays + '}';
    }

    public static InvoiceDetails getobject() {
        if (obj == null) {
            obj = new InvoiceDetails();
        }
        return obj;
    }

}
