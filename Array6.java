/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package array6;

import java.util.Scanner;

/**
 *
 * @author nitir
 */
public class Array6
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter index.");
        int index = in.nextInt();
        int[] nums = {1,2,5,123,6};
        System.out.println(array6(nums, index));
        int[] num2 = {1,2,3,15};
        System.out.println(array6(num2,index));
        
        
    }
    public static boolean array6(int[] nums, int index)
    {
        if(nums.length == index)
        {
            return false;
        }
        if(nums.length == 0)
        {
            return false;
        }
        if(nums[index] == 6)
        {
            return true;
        }
        return array6(nums, index+1);
    }
    
}
