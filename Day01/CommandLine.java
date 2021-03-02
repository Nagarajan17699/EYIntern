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
public class CommandLine {
    
    public static void main(String[] args) {
        
        for(int i=0;i<args.length;i++)
            System.out.println("The "+i+"th Element in the CommandLine arguments is: "+args[i]);
    }
    
}
