/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day11_Lab;

import java.io.IOException;

/**
 *
 * @author Nagarajan
 */
public class Q6 {

    public static void main(String[] args) {
        
    }
}

class BaseClass {

    BaseClass() //throws IOException 
    {
       // throw new IOException();
        
    }
}

class Derived extends BaseClass{

    Derived(){
    //No the Derived Class does not catch the error thrown by base class...
    }
}
