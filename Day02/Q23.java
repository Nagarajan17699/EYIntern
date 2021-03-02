/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day02;

/**
 *
 * @author Nagarajan
 */
class Base2{  
      public void amethod(int i) {  } 
}  
class Scope extends Base2{ 
        public static void main(String argv[]){ 
        }  
    //Method Here 
       // void amethod(int i) throws Exception {}  //Weaker Acess Specifier and No Exception throwing
       // void amethod(long i)throws Exception {}  //Weaker Acess Specifier and No Exception throwing
          void amethod(long i){}     
       // public void amethod(int i) throws Exception {} //No Exception throwing  
} 
