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
 class Conv{ 
    public static void main(String argv[]){  
        Conv c=new Conv();  
        String s=new String("ello");  
        c.amethod(s);  
    }  
public void amethod(String s){  
    char c='H';  
    //c+=s;  
    System.out.println(c);  
    }  
} 
 //Ans : Compile time error  