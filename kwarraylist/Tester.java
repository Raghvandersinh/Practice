/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package kwarraylist;

import java.util.Arrays;
import java.util.ArrayList;


/**
 *
 * @author nitir
 */
public class Tester
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application logic here
        int[] arr1 = {0,1,2,3,4,5,6,7};
        System.out.println(Arrays.toString(arr1));
        for(int i = 3; i < arr1.length - 1; i++)
        {
            arr1[i+1] = arr1[i];
        }
        System.out.println(Arrays.toString(arr1));
        
        
        int[] arr2 = {0,1,2,3,4,5,6,7};
        System.out.println(Arrays.toString(arr2));
        for(int i = arr2.length-1; i > 3; i--)
        {
            arr2[i] = arr2[i-1];
        }
        System.out.println(Arrays.toString(arr2));
        
        KWArrayList<Integer> ints = new KWArrayList<>();
        ints.add(24);
        ints.add(26);
        ints.add(28);
        ints.add(30);
        ints.add(32);
        printArrayList(ints);
        ints.add(2, 24);
        printArrayList(ints);
    }
    
    public static void printArrayList(KWArrayList<Integer> data)
    {
        for(int i = 0; i < data.size(); i++)
        {
            System.out.println(data.get(i) + ", ");
        }
        System.out.println("Size = " + data.size());
    }
    
    
}
