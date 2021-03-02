/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day01;

import java.util.Arrays;

/**
 *
 * @author Nagarajan
 */
public class GeneratePrime_15a {
    
    public static void main(String[] args) {
        int arr[] = new int[101];
        Arrays.fill(arr, 0);
        findPrime(arr);
        for(int i=2;i<101;i++)
            if(arr[i] == 0)
                System.out.print(i+" ");
    }
    
    public static void findPrime(int arr[]) {
        
        for(int i=2;i<=50;i++)
        {
            int k=i;
            for(int j=2;j*k<=100;j++)
            {
                
                arr[j*k] = 1;
            }
        }
    }
    
}
