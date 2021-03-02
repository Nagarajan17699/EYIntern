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
public class Q16 extends A {
    
     void func(){}
    // void funB(){} // Static methods cannot be overridden
}

class A
{
    void funA(){}
    static void funB(){}
    private void func(){}
}