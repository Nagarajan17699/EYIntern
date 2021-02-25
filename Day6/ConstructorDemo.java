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
public class ConstructorDemo {
    
    public static void main(String[] args) {
        Demo2 d2 = new Demo2();
        
    }
}

abstract class ConsDemo
{
    ConsDemo(int i){
        System.out.println("Constructor Demo ... "+i);
    }
}

class Demo2 extends ConsDemo
{
    Demo2(){
        super(34);
        System.out.println("Demo2 Object Created...");
    }
}