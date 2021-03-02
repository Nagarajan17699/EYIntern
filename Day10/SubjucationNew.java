/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day10;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Scanner;

/**
 *
 * @author Nagarajan
 */
public class SubjucationNew {

    public static void main(String[] args) {

        Object n = new Nagarajan();
        Scanner s = new Scanner(System.in);
        System.out.println("Created Nagarajan...");
        s.next();

        Engineer e = new Engineer();
        n = Proxy.newProxyInstance(Nagarajan.class.getClassLoader(), new Class[]{Engineering.class}, new MyInvocator(e));
        Engineering EngineerN = (Engineering) n;
        EngineerN.doBuild();
        EngineerN.doCreate();
        
        
    }
}

interface Construction {

    public void doBuild();
}

interface Engineering extends Construction {

    public void doCreate(); //This is my ans for the problem where the object can be casted as both types.. 
    //this is wrong and the right method is to use the object class and method class present in the proxy method...
}


class Nagarajan {
}

class MyInvocator implements InvocationHandler {

    Object obj;

    MyInvocator(Object obj) {
        this.obj = obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("Executing additional features...");
        return method.invoke(obj, args);
    }

}

class Engineer implements  Engineering {

    @Override
     public void doBuild() {
        System.out.println("Engineer Building a Tower...");
    }
     
    @Override
    public void doCreate()
    {
        System.out.println("Engineer building a software...");
    }
   

   
}
