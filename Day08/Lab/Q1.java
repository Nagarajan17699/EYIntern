/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day08.Lab;

import java.util.Arrays;

/**
 *
 * @author Nagarajan
 */
public class Q1 {
    public static void main(String[] args) {
        int num = 5;
        int arr[] = {1,2,3,4};
        
        A a= new A();
        a.s="Hello";
        
        System.out.println(num+" "+Arrays.toString(arr)+" "+a.s);
        
        func(num,arr,a);
        
        System.out.println(num+" "+Arrays.toString(arr)+" "+a.s);
        
    }
    
    public static void func(int n, int arr[], A b)
    {
        n=10;
        arr[2]=10;
        b.s = "Hey";
    }
}

class A{
String s = "";
}