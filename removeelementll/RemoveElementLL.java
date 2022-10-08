/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package removeelementll;

/**
 *
 * @author nitir
 */
public class RemoveElementLL
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        LL listA = new LL();
        
        listA.addFirst(20);
        listA.addFirst(25);
        listA.addLast(23);
        listA.addLast(20);
        listA.addLast(30);
        listA.addLast(25);
        
        listA.printList();
        
        listA.removeElement(30);
        
        listA.printList();
    }
    
}
