/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day01;

/**
 *
 * @author Nagarajan
 */
public class ProtectedExperiment_23 {
    
    public static void main(String[] args) {
        Protected2 pt = new Protected2();
    }
}

class Protected2{
    
        protected String str3;

}

class Protected3{
    
        Protected2 pt2 = new Protected2();
        public void func()
        {
            pt2.str3 = "Hello";
            System.out.println(pt2.str3);
        }

}