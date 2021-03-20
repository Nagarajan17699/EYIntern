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
public class BuyingList {
    private String invno, itemno, quantity, price;
    
    BuyingList(){}
    public BuyingList(String a, String b, String c, String d)
    {
        this.invno = a;
        this.itemno = b;
        this.quantity = c;
        this.price = d;
    }

    public String getInvno() {
        return invno;
    }

    public void setInvno(String invno) {
        this.invno = invno;
    }

    public String getItemno() {
        return itemno;
    }

    public void setItemno(String itemno) {
        this.itemno = itemno;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
    
    
}
