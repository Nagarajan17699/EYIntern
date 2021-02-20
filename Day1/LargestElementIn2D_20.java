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
public class LargestElementIn2D_20 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int arr[][] = new int[num][num];

        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                arr[i][j] = s.nextInt();
            }
        }

        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num / 2; j++) {
                int tmp = arr[i][(num-1) - j];
                arr[i][(num-1) - j] = arr[i][j];
                arr[i][j] = tmp;
            }
        }
        
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < num; i++) {
            largest = arr[i][0];
            for (int j = 1; j < num; j++) {
                if(arr[i][j] > largest)
                    largest = arr[i][j];
            }
            System.out.println("Largest in "+i+"th row is "+largest);
        }
    }
}


