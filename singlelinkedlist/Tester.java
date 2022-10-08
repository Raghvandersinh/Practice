/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package singlelinkedlist;

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
        SingleLinkedList<String> names = new SingleLinkedList<>();
        names.addFirst("Sam");
        names.addFirst("Harry");
        names.addFirst("Bruce");
        names.addFirst("Dick");
        
        names.add(names.indexOf("Sam"), "Sue");
        names.remove(0);
        names.remove(names.indexOf("Sam"));
        System.out.println(names.toString());
        
        names.remove("Harry");
        System.out.println(names.toString());
        
        names.addNoHelper(2, "Adam");
        System.out.println(names.toString());
        
        
        
        
    }
    
}
