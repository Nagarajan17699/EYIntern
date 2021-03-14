/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day19;

/**
 *
 * @author Nagarajan
 */
public class MethodReferenceDemo {
    
    public static void main(String[] args) {
        
        String str = "Hello from outer main";
        methodref mr = ()->{
            System.out.println("Hello from Main..."+str);
        };
        
        methodref mrf =  new funcinmplemet()::ownfunc;
        mrf.function();
        staticdemo mrfs = funcinmplemet::staticfunc;
        mrfs.staticfunc();
        
    }
}

class funcinmplemet
{
    public void ownfunc()
    {
        System.out.println("Implemented in funcimplement..");
    }
    
    public static void staticfunc()
    {
        System.out.println("Implemented in static function ...");
    }
}

@FunctionalInterface
interface methodref
{
    public void function();
    
}

@FunctionalInterface
interface staticdemo
{
    public void staticfunc();
}