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
public class ReverseEachRow_19 {

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
        
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                System.out.print(arr[i][j]+" ");
                
            }
            System.out.println("");
        }
    }
}
