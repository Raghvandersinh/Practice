/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reversedlinkedlist;

/**
 *
 * @author nitir
 */
public class SingleLinkedList<E>
{
    private Node<E> head = null;
    private static class Node<E>
    {
        private E data;
        private Node<E> next;
        
        public Node(E dataItem)
        {
            data = dataItem;
            next = null;
        }
    }
    
    public void addFirst(E data)
    {
        head = new Node(data);
    }
    
    
}
