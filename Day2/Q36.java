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
 class EqTest{  
    public static void main(String argv[]){  
    EqTest e=new EqTest();  
    } 
EqTest(){  
    String s="Java";  
    String s2="java";  
    if(s.equalsIgnoreCase(s2)) {  //  <=  Answer
        System.out.println("Equal");  
        }else  
        {  
        System.out.println("Not equal");  
        } 
     }  
} 
