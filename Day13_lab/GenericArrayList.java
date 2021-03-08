/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day13_lab;

import java.util.ArrayList;

/**
 *
 * @author Nagarajan
 */
public class GenericArrayList {
    
    public static void main(String[] args) {
           ArrayList ar = new ArrayList();
           ar.add("abs");
           ar.add(1);
           
           for(int i=0;i<ar.size();i++) {
                    String s=(String)ar.get(i);
                    
                    /*
                    Exception in thread "main" java.lang.ClassCastException: java.lang.Integer cannot be cast to java.lang.String
	at Day13_lab.GenericArrayList.main(GenericArrayList.java:22)
C:\Users\Nagarajan\AppData\Local\NetBeans\Cache\8.2\executor-snippets\run.xml:53: Java returned: 1
BUILD FAILED (total time: 0 seconds)
                    */
 }
    }
    
}
