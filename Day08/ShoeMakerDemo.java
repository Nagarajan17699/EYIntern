/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day08;

/**
 *
 * @author Nagarajan
 */
interface Manufacturer {
}

interface ShoeManufacturer extends Manufacturer {

    void makeShoe();
}

interface shoeSeller {

    void sellShoe();
}

abstract class customer {

    abstract void buyShoe();
}

abstract class ShoeShop implements shoeSeller {

    abstract void setArgs(Shoe s, ShoeFactory sf, customer c);

    abstract String shopName();
}

abstract class ShoeFactory implements ShoeManufacturer {

    abstract void setShoe(Shoe s);

    abstract void deliverShoe();

    abstract String getName();
}

abstract class Shoe {

    abstract String typeof();
}

public class ShoeMakerDemo {

    public static void main(String[] args) throws Exception {

        Container c = new Container("ShoeCustomer", "BatashoeFactory", "KadhimShoeShop", "LeatherShoe");
        c.buyShoe();
    }
}

class Container {

    customer c;
    ShoeFactory sf;
    ShoeShop ss;
    Shoe s;

    Container(String customer, String shoefactory, String ShoeShop, String Shoe) throws Exception {
        c = (customer) Class.forName("Day8." + customer).newInstance();
        sf = (ShoeFactory) Class.forName("Day8." + shoefactory).newInstance();
        s = (Shoe) Class.forName("Day8."+Shoe).newInstance();
       ss = (ShoeShop) Class.forName("Day8." + ShoeShop).newInstance();
    }

    public void buyShoe() {
        sf.setShoe(s);
        sf.makeShoe();
        sf.deliverShoe();
        ss.setArgs(s, sf, c);
        ss.sellShoe();
        c.buyShoe();
    }
}

class ShoeCustomer extends customer {

    void buyShoe() {
        System.out.println("Buying the shoe ...");
    }
}

class KadhimShoeShop extends ShoeShop {

    Shoe s;
    ShoeFactory sf;
    customer c;
    
    public void setArgs(Shoe s, ShoeFactory sf, customer c) {

        this.s = s;
        this.sf = sf;
        this.c = c;
    }

    public void sellShoe() {
        System.out.println("Selling the " + s.typeof() + " to the customer from Kadhims Shoe Shop manufactured by " + sf.getName() + " to customer");

    }

    String shopName() {
        return "Kadhim Shoe Shop";
    }
}

class BatashoeFactory extends ShoeFactory {

    Shoe s;

    public void setShoe(Shoe s) {
        this.s = s;

    }

    public void makeShoe() {
        System.out.println("Making " + s.typeof() + " in Bata Shoe Factory...");
    }

    public void deliverShoe() {
        System.out.println("Delivering " + s.typeof());
    }

    public String getName() {
        return "Bata Shoe Factory";
    }
}

class LakhanishoeFactory extends ShoeFactory {

    Shoe s;

    public void setShoe(Shoe s) {
        this.s = s;

    }

    public void makeShoe() {
        System.out.println("Making " + s.typeof() + " in Lakhani Shoe Factory...");
    }

    public void deliverShoe() {
        System.out.println("Delivering " + s.typeof());
    }

    public String getName() {
        return "Lakhani Shoe Factory";
    }
}

class SportsShoe extends Shoe {

    String typeof() {
        return "Sports Shoe";
    }
}

class LeatherShoe extends Shoe {

    String typeof() {
        return "Leather Shoe";
    }

}
