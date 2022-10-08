/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reversell;

/**
 *
 * @author nitir
 */
public class LL
{
    private Node head;
    private int size;
    
    public Node getHead()
    {
        return this.head;
    }
    
    public class Node
    {
        int data;
        Node next;
        
        public Node(int data)
        {
            this.data = data;
            next = null;
        }
        public Node(int data, Node next)
        {
            this.data = data;
            this.next = next;
        }
    }
    
    public void addFirst(int data)
    {
        head = new Node(data, head);
        size++;
    }
    
    public void addLast(int data)
    {
        Node n = new Node(data);
        if(head == null)
        {
            head = n;
        }
        
        Node curr = head;
        
        while(curr.next != null)
        {
            curr = curr.next;
        }
        curr.next = n;
    }
    
    public Node deleteFirst()
    {
        if(head != null)
        {
            Node toDelete = head;
            head = head.next;
            return toDelete;
        }
        return null;
    }
    public Node deleteLast()
    {
        Node curr = head;
        
        if(curr != null && curr.next != null)
        {
            head = curr;
            return curr;
        }
        Node nodeRef = curr.next;
        if(nodeRef.next != null)
        {
            if(nodeRef.next == null)
            {
                curr.next = null;
            }
            curr = nodeRef;
            nodeRef = nodeRef.next;
        }
        return curr;
    }
    public void printList()
    {
        Node temp = head;
        
        while(temp != null)
        {
            if(temp.next != null)
            {
                System.out.print(temp.data + " ==> ");
            }
            if(temp.next == null)
            {
                System.out.println(temp.data);
            }
            temp = temp.next;
        }
    }
    
    public Node reverseList(Node head)
    {
        if(head == null || head.next == null)
        {
            return head;
        }
        
        Node rest = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return rest;
    }
}
