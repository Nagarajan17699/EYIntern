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
class Base3{ 
        Base3(int i){ 
        System.out.println("base constructor"); 
        } 
        Base3(){ 
        } 
} 
 class Sup extends Base3{
        public static void main(String argv[]){ 
             Sup s= new Sup(); 
         
        } 
        Sup() 
        { 
            super(10);    //Two  Option 3
        } 
        public void derived() 
        { 
            //Three 
        } 
} 

