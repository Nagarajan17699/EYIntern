/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day1;

/**
 *
 * @author Nagarajan
 */
public class TypeCasting {
    
   
    public static void main(String[] args) {
     
    //Implicit Type Casting 
    System.out.println("IMPLICIT CONVERSION");

         byte b = 20;
         System.out.println("Byte: "+b);
         
         short s = b;
         System.out.println("Short: "+s);
         
         int i = s;
         System.out.println("Int: "+i);
         
         float f = i;
         System.out.println("Float: "+f);
         
         double d =f;
         System.out.println("Double: "+d);
         
         
         //Explicit Conversion
         
         System.out.println("\nEXPLICIT CONVERSION");
         
         double de = 10.0;
         System.out.println("Double: "+de);
         
         float fe = (float)de;
         System.out.println("Float: "+fe);
         
         int ie = (int)fe;
         System.out.println("Int: "+ie);
         
         short se = (short)ie;
         System.out.println("Short: "+se);
         
         byte be = (byte)se;
         System.out.println("Byte: "+be);
         
         
    }
   
    
    
    
}
