/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package changexy;

import java.util.Scanner;

/**
 *
 * @author nitir
 */
public class ChangeXY
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
        
        String ChangeY  = change(input);
        System.out.println(ChangeY);
    }
    
    public static String change(String str)
    {
        if(str.length() == 0)
        {
            return str;
        }
        String first = str.substring(0,1);
        String rest = str.substring(1);
        if(first.equalsIgnoreCase("x"))
        {
            
            return "y" + change(rest);
        }
        return  first + change(rest);
    }
    
}
