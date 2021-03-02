/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day01;

import java.util.Scanner;
import java.util.Arrays;
/**
 *
 * @author Nagarajan
 */
public class ArrayResize {
    
    public static void main(String[] args) {
        
        int arr[] = new int[]{1,2,3,4,5};
        System.out.println("Array Length is: "+arr.length);
        int num = new Scanner(System.in).nextInt();
        arr = Arrays.copyOf(arr, num);
        System.out.println("Array Length is: "+arr.length);
        
        
    }
}
