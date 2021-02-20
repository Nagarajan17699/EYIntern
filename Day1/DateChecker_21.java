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
public class DateChecker_21 {
    
    public static void main(String[] args) {
        
        String str = new Scanner(System.in).nextLine();
        String arr[] = str.split("/");
        
        switch(Integer.parseInt(arr[1]))
        {
            case 1:
            case 3:
            case 5:
            case 7:
            case 10:
            case 12:
                System.out.println("Number of Days is 31");
                break;
            case 4:
            case 6:
            case 8:
            case 9:
            case 11:
                System.out.println("Number of Days is 30");
                break;
            case 2:
                if(isLeapYear(Integer.parseInt(arr[2])))
                {
                    System.out.println("Number of Days is 28");
                }
                else
                    System.out.println("Number of Days is 27");
                
        }
        
        
    }
    
    static boolean isLeapYear(int num)
        {
            if(num%100 == 0)
            {
                if(num%400 == 0)
                    return true;
                else
                    return false;
            }
            else if(num%4 == 0)
                return true;
            else
                return false;
        }
}
