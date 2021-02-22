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
class Q59{ 
private void amethod(int iBase){ 
        System.out.println("Base.amethod"); 
        } 
} 
class Over extends Q59{ 
public static void main(String argv[]){ 
        Over o = new Over(); 
        int iBase=0; 
        o.amethod(iBase); 
        } 
        public void amethod(int iOver){ 
                System.out.println("Over.amethod"); // This function will be executed since the overridden function has higher priority than the base claas function.
        } 
} 
// output : Over.amethod