/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day2;

/**
 *
 * @author Nagarajan
 */
public class Q51 {

    private int i;

    public static void main(String argv[]) {
        Q51 s = new Q51();
        s.amethod();
    }//End of main 

    public static void amethod() {
        //     System.out.println(i); // Error Non static variable cannot accessed from the static method.
    }//end of amethod 
}
