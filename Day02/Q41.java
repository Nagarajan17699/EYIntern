/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day02;

/**
 *
 * @author Nagarajan
 */
class Pass{ 
static int j=20; 
public static void main(String argv[]){ 
        int i=10; 
        Pass p = new Pass(); 
        p.amethod(i); 
        System.out.println(i); 
        System.out.println(j); 
        } 
        public void amethod(int x){ 
        x=x*2; 
        j=j*2; 
        } 
} 

// Output ; 10 40 
