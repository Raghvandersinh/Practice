/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ispalindrone;

/**
 *
 * @author nitir
 */
public class IsPalindrone
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application logic here
        String str = "eyeyeyeyey";
        isPalindrone(str);
    }
    public static void isPalindrone(String str)
    {
        if(str.length() == 0)
        {
            System.out.println("Empty String");
        }
        for(int i = 0; i < str.length()/2; i++)
        {
            if(str.charAt(i) != str.charAt(str.length() - 1 - i))
            {
                System.out.println("Is no Palindrone");
                break;
            }
        }
        System.out.println("is Palindrone");
    }
}
