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
public class ItemMasterDTO {
    private int itemno;
    private String itemDeac;
    private String itemPrice;
    private String itemQty;

    public int getItemno() {
        return itemno;
    }

    public void setItemno(int itemno) {
        this.itemno = itemno;
    }

    public String getItemDeac() {
        return itemDeac;
    }

    public void setItemDeac(String itemDeac) {
        this.itemDeac = itemDeac;
    }

    public String getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(String itemPrice) {
        this.itemPrice = itemPrice;
    }

    public String getItemQty() {
        return itemQty;
    }

    public void setItemQty(String itemQty) {
        this.itemQty = itemQty;
    }

   
    @Override
    public String toString() {
        return "ItemMasterDTO{" + "itemno=" + itemno + ", itemDeac=" + itemDeac + ", itemPrice=" + itemPrice + ", itemQty=" + itemQty + '}';
    }
    
    
}
