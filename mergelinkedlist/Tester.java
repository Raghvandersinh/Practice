/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


package mergelinkedlist;

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
        
        LinkedList listA = new LinkedList();
        LinkedList listB = new LinkedList();
       
       
        
        listA.add(5);
        listA.add(6);
        listA.add(10);
        
        listB.add(24);
        listB.add(56);
        listB.add(12);
        
        System.out.println(listA.toString());
        
        listA.merge(listA.head, listB.head);
        
        System.out.println(listA.toString());
     

    }
    
  
    
}

