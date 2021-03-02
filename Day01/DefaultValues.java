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
public class DefaultValues {
    
       
        
    public static void main(String[] args) {
        PrintDefault p = new PrintDefault();
    }
       
}
class PrintDefault
{
    int i;
    float f;
    double d;
    char c;
    boolean b;
     PrintDefault()
        {
                System.out.println("The Default Values of Primitive Data Types are \n int: "+i+"\n Float: "+f+"\n Double: "+d+"\n Character: "
                +c+"\n Boolean: "+b);
        }
}