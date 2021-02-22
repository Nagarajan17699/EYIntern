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
public class Q18 {
 
  
    public static void main(String argv[]){  
    int i;  
    int j;  
    outer:  
    for (i=1;i <3;i++)  
        inner:  
         for(j=1; j<3; j++) {  
                    if (j==2)  
                    continue outer;  
                    System.out.println("Value for i=" + i + " Value for j=" +j);  
                    }  
        }  
} 

/* Output :  Value for i=1 Value for j=1
Value for i=2 Value for j=1 */   

