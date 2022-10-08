/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package countx;

import java.util.Scanner;

/**
 *
 * @author nitir
 */
public class CountX
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
        
        int count  = countX(input);
        System.out.println(count);
    }
    
    public static int countX(String str)
    {
        if(str.length() == 0)
        {
            return 0;
        }
        String first = str.substring(0,1);
        String rest = str.substring(1);
        if(first.equalsIgnoreCase("x"))
        {
            return 1 + countX(rest);
        }
        return 0 + countX(rest);
    }
    
}
