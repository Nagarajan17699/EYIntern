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
 class Ref{ 
public static void main(String argv[]){ 
          Ref r = new Ref(); 
          r.amethod(r); 
          } 
          public void amethod(Ref r){ 
          int i=99; 
          multi(r); 
          System.out.println(i); 
          } 
          public void multi(Ref r){ 
         // r.i = r.i*2;  Error line
          } 
} 
// Output: Error at compile time since the "i" is a local variable and not a class variable