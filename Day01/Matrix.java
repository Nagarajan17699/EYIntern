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
public class Matrix {
    
    public static void main(String[] args) {
        
        int num = 1;
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<4;j++)
            {
                System.out.print(num++ +" ");
            }
            System.out.println("");
        }
    }
}
