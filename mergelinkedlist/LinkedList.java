/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mergelinkedlist;

/**
 *
 * @author nitir
 */
public class LinkedList
{
    
    public Node head = null;
    public int size;
    
    public static class Node
    {
          int data;
          Node next;
        
        public Node(int dataItem)
        {
            data = dataItem;
            next = null;
        }
        public Node(int dataItem, Node refNode)
        {
            data = dataItem;
            next = refNode;
        }
    }
    
    public void add(int item)
    {
        head = new Node(item, head);
        size++;
    }
    
    
    public String toString()
    {
        Node nodeRef = head;
        StringBuilder result = new StringBuilder();
        while(nodeRef != null)
        {
            result.append(nodeRef.data);
            
            if(nodeRef.next != null)
            {
            result.append(" ==> ");
            }
            nodeRef = nodeRef.next;
            
        }
        return result.toString();
    }
    
    public Node merge(Node A, Node B)
    {
        Node temp = new Node(0);
        Node current = temp;
        
        while(A != null && B != null)
        {
            if(A.data < B.data)
            {
                current.next = A;
                A = A.next;
            }
            else
            {
                current.next = B;
                B = B.next;
            }
            current = current.next;
        }
        if(A != null)
        {
            current.next  = A;
        }
        if(B != null)
        {
            current.next = B;
        }
        return temp.next;
    }
    public Node middle(Node node)
    {
        if(node == null)
        {
            return null;
        }
        Node a = node;
        Node b = node.next;
        while(b != null && b.next != null)
        {
            a = a.next;
            b = b.next.next;
        }
        return a;
    }
    public Node sort(Node node)
    {
        if(node == null || node.next == null)
        {
            return node;
        }
        Node mid = middle(node);
        Node secondhalf = mid.next;
        mid.next = null;
        
        return merge(sort(node), sort(secondhalf));
    }
}
