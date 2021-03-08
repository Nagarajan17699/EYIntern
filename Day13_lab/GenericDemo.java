/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day13_lab;

/**
 *
 * @author Nagarajan
 */
public class GenericDemo {
    
    public static void main(String[] args) {
        genDem<demo2> p = new genDem<>();
        p.obj = new demo2();
        demo2 d = p.getObj();
        System.out.println(d);
    }
    
    
}

class genDem<T>
{
    T obj;
    
    public T getObj()
    {
        return obj;
    }
}

abstract class paint{
    
   abstract public void func1();
}

class demo2 extends paint
{
    public void func1(){
}
}