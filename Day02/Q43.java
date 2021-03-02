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
/*private*/class Base4{ // class should not be named private
Base4(){ 
     int i = 100;      
     System.out.println(i); 
     } 
} 
 class Pri extends Base4{ 
static int i = 200; 
public static void main(String argv[]){ 
        Pri p = new Pri(); 
        System.out.println(i); 
        } 
} 

// OUtput: Error at compile time 