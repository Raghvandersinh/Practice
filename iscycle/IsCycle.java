/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package iscycle;

/**
 *
 * @author nitir
 */
public class IsCycle
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        LL list = new LL();
        
        list.add(20);
        list.add(2);
        list.add(22);
        list.add(32);
        
        list.isCycle();
        list.printList();
        System.out.println(list.isCycle());
    }
    
}
