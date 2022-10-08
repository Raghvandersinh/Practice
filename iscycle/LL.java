/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package iscycle;

/**
 *
 * @author nitir
 */
public class LL
{
    private Node head;
    private int size;
    
    private class Node
    {
        int data;
        Node next;
        
        public Node(int data)
        {
            this.data =data;
            next = null;
        }
        
        public Node(int data, Node next)
        {
            this.data = data;
            this.next = next;
        }
    }
    
    public void add(int item)
    {
        head = new Node(item, head);
        size++;
    }
    
    public void addLast(int item)
    {
        Node temp = new Node(item);
        
        if(head == null)
        {
            head = temp;
        }
        else
        {
          Node curr = head;
          if (curr != null)
            {
                curr = curr.next;
            }
          curr.next = temp;
        }
    }
    
    public Node deleteLast(int data)
    {
        Node curr = head;
        
        if(curr == null && curr.next == null)
        {
            head = curr;
            return curr;
        }
        Node nextNode = curr.next;
        if(nextNode.next != null)
        {
            if(nextNode.next == null)
            {
                curr.next = null;
            }
            curr = nextNode;
            nextNode = nextNode.next;
        }
        return curr;
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
    
    public boolean isCycle()
    {
        Node slow = head;
        Node fast = head;
        
        while(fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
            
            if(slow == fast)
            {
                return true;
            }
        }
        return false;
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
    
}
