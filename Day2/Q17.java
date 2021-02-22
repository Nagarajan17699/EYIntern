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
class Base {}  
class Sub extends Base {}  
class Sub2 extends Base {} 
 class CEx{ 
        public static void main(String argv[]){ 
                Base b=new Base(); 
                Sub s=(Sub) b; 
                } 
}

// Output : Runtime Exception  