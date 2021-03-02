/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day01;

import java.util.Scanner;

/**
 *
 * @author Nagarajan
 */
public class TriangularArray {
    
    public static void main(String[] args) {
        
        int num = new Scanner(System.in).nextInt();
        int t_num = 1;
        
        for(int i=1;i<=num;i++)
        {
            for(int j=1;j<i+1;j++)
            {
                System.out.print(t_num+++" ");
            }
            System.out.println("");
        }
    }
}
