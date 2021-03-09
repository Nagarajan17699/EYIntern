/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day16;

import java.util.StringJoiner;

/**
 *
 * @author Nagarajan
 */
public class StringJoinerDemo {

    public static void main(String[] args) {

        StringJoiner sj = new StringJoiner(",");
        System.out.println(sj);
        sj.add("Hello");
        sj.add("Hi");
        sj.add("How Are You ...");
        System.out.println(sj);
        sj = new StringJoiner(",", "[", "]");
        sj.add("a");
        sj.add("b");
        sj.add("c");
        sj.add("f");
        System.out.println(sj);

    }
}
