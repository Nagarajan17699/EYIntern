/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day09;

import java.util.Scanner;

/**
 *
 * @author Nagarajan
 */
public class Q04 {
    
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        String str  = s.nextLine();
        char arr[] = str.toCharArray();
        int count=0;
        for(char c: arr)
        {
            if(!(c>=97 && c<=122))
                count++;
        }
        
        System.out.println("The Count is "+count);
    }
}
