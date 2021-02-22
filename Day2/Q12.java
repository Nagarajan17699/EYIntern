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
public class Q12 {
    
    public static void main(String[] args) {
        
        
        int i=1;  
        switch (i) {  
                case 0:  
                System.out.println("zero");  
        break;  
        case 1:  
                System.out.println("one");  
        case 2:  
                System.out.println("two");  
        default:  
                System.out.println("default");  
        } 

    }
}
/* Output: One
          two
          default

Since break is not present it executes till the last case */