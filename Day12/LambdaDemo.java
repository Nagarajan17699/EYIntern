/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day12;

/**
 *
 * @author Nagarajan
 */
public class LambdaDemo {
    public static void main(String[] args) {
        
        display(() -> {System.out.println("Displaying Lambda...");});
        display(new dispDemo(){
                
            public void demo()
            {
                System.out.println("Displaying from Anonymous Inner Class...");
            }
        });
        display(new DemoClass());
        
        
    }
    
    public static void display(dispDemo dp)
    {
        dp.demo();
    }
}

interface dispDemo{
    public void demo();
}

class DemoClass implements dispDemo{

    @Override
    public void demo() {
            System.out.println("Displaying from Class DemoClass...");
    }
    
}