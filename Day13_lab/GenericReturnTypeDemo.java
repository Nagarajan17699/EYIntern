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
public class GenericReturnTypeDemo {

    public static void main(String[] args) {
            
        DummyClass d = new DummyClass();
        d.getThings(new String[]{"a","b","c"});
    }
}

class DummyClass {

    public <E> E getThings(E[] elements) {
        for(E a:elements){
            System.out.println(a);
        }
        return null;
    }
}
