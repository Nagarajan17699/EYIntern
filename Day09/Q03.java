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
class Exercise3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a string: ");
        char[] letters = scanner.nextLine().toCharArray();
        System.out.print("Reverse string: ");
        for (int i = letters.length - 1; i >= 0; i--) {
            System.out.print(letters[i]);
        }
        System.out.print("\n");
    }
}