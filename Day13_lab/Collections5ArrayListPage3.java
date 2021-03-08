/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day13_lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Nagarajan
 */
public class Collections5ArrayListPage3 {

    public static void main(String[] args) {
        int arr[] = {1, -3, 0, 5, 4, -3, 8};
        int target = new Scanner(System.in).nextInt();
        List<List<Integer>> li = getList(arr,target);
        for(List<Integer> tmp : li)
        {
            for(int a:tmp)
            {
                System.out.print(a+" ");
            }
            System.out.println("");
        }
        
    }
    
    public static List<List<Integer>> getList(int arr[], int target)
    {
        List<List<Integer>> li = new ArrayList<List<Integer>>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                for(int k=j;k<arr.length;k++)
                {
                    if(i!=j && j!=k && k!=i && arr[i]+arr[j]+arr[k] == target)
                    {
                        List<Integer> al= new ArrayList<>();
                        al.add(i);
                        al.add(j);
                        al.add(k);
                        li.add(al);
                    }
                        
                }
            }
        }
        return li;
    }
}
