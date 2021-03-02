/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day10;

import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;

/**
 *
 * @author Nagarajan
 */
public class GarbageCollection {
    
    public static void main(String[] args) {
        
        Runtime r = Runtime.getRuntime();
        System.out.println("Free Space Before Obj Creation: "+r.freeMemory());
        Apple p = new Apple("Hello");
        System.out.println("Free Space After Obj Creation: "+r.freeMemory());
        SoftReference sapple = new  SoftReference(p);
        WeakReference wapple = new WeakReference(p);
        p=null;
        r.gc();
        System.out.println("Free Space After Obj Deletion: "+r.freeMemory());
        System.out.println(p);
        
        
        
    }
}

class Apple
{
    private String price;

    
    
    Apple(String price)
    {
        this.price = price;
        for(int i=0;i<1000;i++)
        {
            price += "10";
        }
    }
}