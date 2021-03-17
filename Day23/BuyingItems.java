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
public class BuyingItems {
    private String invno;
    private String itemno;
    private String qty;
    private String price;

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

    public String getQty() {
        return qty;
    }

    public void setQty(String qty) {
        this.qty = qty;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "BuyingItems{" + "invno=" + invno + ", itemno=" + itemno + ", qty=" + qty + ", price=" + price + '}';
    }

    
}
