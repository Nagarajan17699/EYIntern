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
public class LettertoNum_18 {
    
    public static void main(String[] args) {
        int num = new Scanner(System.in).nextInt();
        numToWords(num);
    }
    
    public static void numToWords(int num)
    {
        String[] ones= {"zero","one","two","three","four","five","six","seven","eight","nine","ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
	String[] tens= {"","","twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety"};
        String[] hundreds = {"","One Hundred", "Two Hundred", "Three Hundred","Four Hundred","Five Hundred","Six Hundred","Seven Hundred", "Eight Hundred","Nine Hundred"};
        
        String str[] = new String[3];
        str[0]="";
        int flag = 0;
        int ind = 3;
        while(num != 0)
        {
            int res = num%10;
            num/=10;
            ind--;
            if(flag == 0)
            {
                int num2 = num%10;
                
                if(num2 == 1 || num2==0)
                {
                    num/=10;
                    num2 = (num2*10)+res;
                    str[ind--] = ones[num2];
                    str[ind] = "";
                    flag = 1;
                    continue;
                }
            }
            flag = 1;
            if(ind == 2)
                str[ind] = ones[res];
            else if(ind == 1)
                str[ind] = tens[res];
            else
                str[ind] = hundreds[res];
        }
        
        for(String c:str)
            System.out.print(c+" ");
    }
}
