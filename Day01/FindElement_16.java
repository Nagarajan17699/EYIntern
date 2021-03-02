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
public class FindElement_16 {
    
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int num = s.nextInt();
        int arr[] = new int[num];
        for(int i=0;i<num;i++)
            arr[i] = s.nextInt();
        int elem = s.nextInt();
        int flag = 0,sum=0;
        for(int i=0;i<num;i++)
        {
            if(arr[i] == elem){
                System.out.println("The element is at index "+i);
                sum++;
                flag=1;
            }
        }
        
        if(flag == 0)
            System.out.println("The element is not present");
        else
            System.out.println("The Total number of times element is present is "+sum);
    }
}
