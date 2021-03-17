/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day22;

/**
 *
 * @author Nagarajan
 */
public class CustomerDetailsDTO {
    
    private int customerno;
    private String customerAddress;
    private String customerEmail;
    private String customerPhone;

    public int getCustomerno() {
        return customerno;
    }

    public void setCustomerno(int customerno) {
        this.customerno = customerno;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

    @Override
    public String toString() {
        return "CustomerDetailsDTO{" + "customerno=" + customerno + ", customerAddress=" + customerAddress + ", customerEmail=" + customerEmail + ", customerPhone=" + customerPhone + '}';
    }
    
    
    
}
