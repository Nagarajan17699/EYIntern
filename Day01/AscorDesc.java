/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day01;

import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author Nagarajan
 */
public class AscorDesc {
    
    public static void main(String[] args) {
        System.out.println("For Ascending : 1\nFor Descending: 2");
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int arr[] = new int[]{2,3,5,6,4,7,9};
        
        if(num == 1)
        {
            for(int i=0;i<arr.length-1;i++)
            {
                for(int j=i+1;j<arr.length;j++)
                {
                    if(arr[i] > arr[j])
                    {
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
                        System.out.println(Arrays.toString(arr));

        }
        else if(num == 2)
        {
            for(int i=0;i<arr.length-1;i++)
            {
                for(int j=i+1;j<arr.length;j++)
                {
                    if(arr[i] < arr[j])
                    {
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
            
            System.out.println(Arrays.toString(arr));
        }
        else
            System.out.println("Enter the correct Number");
    }
}
