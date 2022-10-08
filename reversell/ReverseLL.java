/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package reversell;

/**
 *
 * @author nitir
 */
public class ReverseLL
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application logic here
        LL listA = new LL();
        
        listA.addFirst(21);
        listA.addLast(22);
        listA.addFirst(2412);
        listA.addFirst(21324);
        listA.addFirst(124125);
        
        listA.printList();
        
        listA.reverseList(listA.getHead());
        
        listA.printList();
    }
    
}
