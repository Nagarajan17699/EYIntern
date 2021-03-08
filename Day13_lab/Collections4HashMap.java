/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day13_lab;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Nagarajan
 */
public class Collections4HashMap {
    
    public static void main(String[] args) {
        Map hs = new HashMap();
        
        String s1 = "One",s2 = "Two",s3 = "Three";
        hs.put(s1, 1);
        hs.put(s2, 2);
        hs.put(s3, 3);
        System.out.println(hs.size());
        System.out.println(hs.containsKey(s3));
        
    }
}

class Keys implements Comparable{
    
    String value;
    Keys obj;
    Keys(String str){
        this.value = str;
    }

    @Override
    public int compareTo(Object o) {
        this.obj = (Keys) o;
        return this.value.compareTo(obj.value);
    }
    
}