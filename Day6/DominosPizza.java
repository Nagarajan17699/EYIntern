/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day6;

/**
 *
 * @author Nagarajan
 */
public class DominosPizza {
    
    public static void main(String[] args) {
        
        VelacheryDominos d = new VelacheryDominos();
        d.ingredients();
        d.makePizza();
        d.packingBox();
        d.delivery();
        
        
    }
}

abstract class  Dominos
{
    final void ingredients(){
        System.out.println("Ingredients required are added...");
    }
    abstract void makePizza();
    final void packingBox(){
        System.out.println("Packing in the dominos box...");
    }
    abstract void delivery();
}

class VelacheryDominos extends Dominos
{
    void makePizza(){
        System.out.println("Making Pizza...");
    }
    void delivery(){
        System.out.println("Delivering Pizza...");
    }
}