/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package directorytest;

/**
 *
 * @author nitir
 */
import java.util.ArrayList;
public class DirectoryTest
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application logic here
        
        intArrayAdder();
        System.out.println("\n");
        Directory theDirectory = new Directory();
        theDirectory.phoneDirectory();
    }
    public static ArrayList<Integer> intArrayAdder()
    {
        ArrayList<Integer> someInts = new ArrayList<Integer>();
        int nums[] = {5,7,2,15};
        for(int i = 0; i < nums.length; i++)
        
            someInts.add(nums[i]);
        printList(someInts);
        
        
        int sum = 0;
        for(int i = 0; i < someInts.size(); i++)
        
            sum+=someInts.get(i);
        System.out.println("the sum is: " + sum);
        
        return someInts;
          
    }
    
    public static void printList(ArrayList<Integer> theList)
    {
        for(int i = 0; i < theList.size(); i++)
        {
            System.out.println(theList.get(i) + ", ");
        }
        System.out.println("Size: " + theList.size());
    }
}
