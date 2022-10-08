/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package counthi;

import java.util.Scanner;

/**
 *
 * @author nitir
 */
public class CountHi
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter the String");
        String input = scan.nextLine();
        
        int count  = countHi(input);
        System.out.println(count);
    }
    public static int countHi(String str)
    {
        if(str.length() <= 1)
        {
            return 0;
        }
        
        String first = str.substring(0,2);
        String rest = str.substring(1);
        if(first.equalsIgnoreCase("hi"))
        {
            return countHi(rest) + 1;
        }
        return countHi(rest) + 0;
    }
    
}
