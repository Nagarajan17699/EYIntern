/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day2;

/**
 *
 * @author Nagarajan
 */
public class Q58 {
    
}

//package Base; 
class Base6{ 
        protected void amethod(){ 
                System.out.println("amethod"); 
        }//End of amethod 
}//End of class base 
//package Class1; 
//Class1.java 
 class Class1 extends Base6{ 
public static void main(String argv[]){ 
                Base6 b = new Base6(); 
                b.amethod(); 
               }//End of main 
}//End of Class1 

// output :cannot find the method since the classes are in different packages.