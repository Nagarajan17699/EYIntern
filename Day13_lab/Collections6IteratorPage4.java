/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day13_lab;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Nagarajan
 */
public class Collections6IteratorPage4 {
    
    public static void main(String[] args) {
        
        ArrayList<Integer> al = new ArrayList<>();
        for(int i=0;i<5;i++)
        {
            al.add(new Scanner(System.in).nextInt());
        }
        Iterator it = al.listIterator();
        int i=0;
        while(it.hasNext())
        {
            System.out.println(++i+"-> "+it.next()+" ");
        }
        
        // while(it.hasPrevious()) => Iterator has no backtracking option.
        
    }
}
