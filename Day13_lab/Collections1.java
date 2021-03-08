/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day13_lab;

import java.util.Collections;
import java.util.Comparator;
import java.util.TreeSet;

/**
 *
 * @author Nagarajan
 */
public class Collections1 {
    
    public static void main(String[] args) {
        Comparator<TreeSetDemo> cmp = new PBComparator();
    TreeSet<TreeSetDemo> ts = new TreeSet<>(cmp);
    ts.add(new TreeSetDemo("Naga"));
    ts.add(new TreeSetDemo("John"));
    ts.add(new TreeSetDemo("Aeghan"));
      ts.stream().forEach(System.out::println);

    }
}


class PBComparator implements Comparator<TreeSetDemo>
{

    public int compare(TreeSetDemo o1, TreeSetDemo o2) {

        return o1.name.compareTo(o2.name);
    }

    
    
}
class TreeSetDemo{

    String name;
    TreeSetDemo(String name){
            this.name = name;
    }
    
    public String toString(){
        return this.name;
    }
}