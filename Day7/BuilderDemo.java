/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day7;

/**
 *
 * @author Nagarajan
 */

// This Program is a demo id BUILDER PATTERN in CREATIONAL PATTERNS.

public class BuilderDemo {
    
     public static void main(String[] args) {
            Pizza pz = new Pizza.builderPizza("Wheat Crust", "pepperoni").setAddons("Choco Lava Cake").build();
            System.out.println(pz.toString());
    }
 
}

class Pizza
{
    private String crust;
    private String base;
    private String toppings;
    private String addons;
    
    public String toString()
    {
        return "Pizza Contains: => ["+crust+", "+base+", "+toppings+", "+addons+"]";
    }
    Pizza(builderPizza pizza)
    {
        this.crust = pizza.getCrust();
        this.base = pizza.getBase();
        this.toppings = pizza.getToppings();
        this.addons = pizza.getAddons();
    }
    public static class builderPizza
    {

        private String crust;
        private String base;
        private String toppings;
        private String addons;
        
        public String getCrust() {
            return crust;
        }

        public void setCrust(String crust) {
            this.crust = crust;
        }

        public String getBase() {
            return base;
        }

        public void setBase(String base) {
            this.base = base;
        }

        public String getToppings() {
            return toppings;
        }

        public builderPizza setToppings(String toppings) {
            this.toppings = toppings;
            return this;
        }

        public String getAddons() {
            return addons;
        }

        public builderPizza setAddons(String addons) {
            this.addons = addons;
            return this;
        }
        
        builderPizza(String crust, String base)
        {
            this.crust = crust;
            this.base = base;
        }
        public Pizza build()
        {
            return new Pizza(this);
        }
        
    }
}