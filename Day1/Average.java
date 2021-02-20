/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day1;
import java.util.Scanner;
/**
 *
 * @author Nagarajan
 */
public class Average {
    
    public static void main(String[] args) {
        Scanner s =  new Scanner(System.in);
        int num =s.nextInt();
        int arr[] = new int[num];
        for(int i=0;i<num;i++)
            arr[i] = s.nextInt();
        average(arr,num);
    }
    
    public static void average(int arr[],int n)
    {
        int sum=0;
        for(int i:arr)
            sum += i;
        System.out.println("The Average of the given numbers is: "+ (float)sum/n );
            
    }
}
