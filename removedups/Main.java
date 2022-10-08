/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package removedups;

/**
 *
 * @author nitir
 */
public class Main
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        LL listA = new LL();
        
       listA.addFirst(100);
       listA.addLast(25);
       listA.addFirst(200);
       listA.addLast(24);
       listA.addFirst(200);
       listA.addFirst(25);
       
       System.out.println("Unsorted List:");
       listA.printList();
       
       listA.head = listA.mergeresult(listA.head);
       listA.removeDup();
       listA.printList();
    }
    
}
