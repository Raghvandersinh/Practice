/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package intersectionlist;

/**
 *
 * @author nitir
 */
public class IntersectionList
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
       LL l1 = new LL();
       LL l2 = new LL();
       
       l2.addFirst(21);
       l2.addFirst(23);
       l2.addFirst(40);
       l2.addLast(22);
       l2.addLast(41);
       
       l1.addFirst(29);
       l1.addFirst(23);
       l1.addFirst(21);
       l1.addLast(22);
       l1.addLast(41);
       
       l1.printList();
       l2.printList();
       
       l1.head = l1.intersect(l1.head, l2.head);
       
        System.out.println(l1.head);
    }
    
}
