/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day13_lab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Nagarajan
 */
public class Collections2 {
    
    public static void main(String[] args)throws Exception {
        
        List<String> li = new ArrayList<>();
        li = new ArrayList<> (Arrays.asList("January","February","March","April")); //Here ArrayList is returned from the function asList
        //but it is not java.Util.ArrayList instead it is java.Util.Arrays.ArrayList which does not support remove function. 
        //Thus remove function does not work on the list. Thus a conversion is done from Arrays.ArrayList ot ArrayList.
        li.removeIf(x -> x.toLowerCase().contains("ap"));
        li.forEach(System.out::println);
        
    }
}
