/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day1;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Nagarajan
 */
public class reverseArray {
    
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int num = s.nextInt();
        int arr[] = new int[num];
        for(int i=0;i<num;i++)
        {
            arr[i] = s.nextInt();
        }
        int i=0,j=num-1;
        for(int k=0;k<num/2;k++)
        {
            int tmp = arr[i];
            arr[i] = arr[j] ;
            arr[j] = tmp;
            i++;j--;
        }
        
        System.out.println(Arrays.toString(arr));
    }
    
}
