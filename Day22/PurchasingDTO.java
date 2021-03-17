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
public class PurchasingDTO {
    
    int invno;
    int itemno;
    int itemunit;

    public int getInvno() {
        return invno;
    }

    public void setInvno(int invno) {
        this.invno = invno;
    }

    public int getItemno() {
        return itemno;
    }

    public void setItemno(int itemno) {
        this.itemno = itemno;
    }

    public int getItemunit() {
        return itemunit;
    }

    public void setItemunit(int itemunit) {
        this.itemunit = itemunit;
    }

    @Override
    public String toString() {
        return "PurchasingDTO{" + "invno=" + invno + ", itemno=" + itemno + ", itemunit=" + itemunit + '}';
    }
    
    
}
