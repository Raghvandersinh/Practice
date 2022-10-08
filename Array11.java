/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package array11;

/**
 *
 * @author nitir
 */
public class Array11
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        int index = 0;
        int[] nums = {1,231,123,11,2512,11,1234,11,23};
        
        System.out.println(array11(nums, index));
    }
    
public static int array11(int[] nums, int index) {
  if(nums.length == index)
  {
    return 0;
  }
  if(nums[index] == 11){
    return 1 + array11(nums, index+1);
  }
  return array11(nums, index+1);
}

}
