/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package binarytointeger;

/**
 *
 * @author nitir
 */
public class BinaryToInteger
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        LinkedList listA = new LinkedList();
        
        listA.addLast(1);
        listA.addLast(0);
        listA.addLast(1);
        
        listA.printList();
        System.out.println(listA.getDecimal());
    }
    
}
