/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package removeelementll;

/**
 *
 * @author nitir
 */
public class LL
{
    private Node head;
    private int size;
    
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
            this.data= data;
            this.next = next;
        }
    }
        
        public void addFirst(int item)
        {
            head = new Node(item, head);
            size++;
        }
        
        public void addLast(int item)
        {
            Node n = new Node(item);
            
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
                Node toDelete=  head;
                head = head.next;
                return toDelete;
            }
            return null;
        }
        
        public Node deleteLast()
        {
            Node curr = head;
            
            if(curr == null && curr.next == null)
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
        
        public Node removeElement(int data)
        {
           while(head != null && head.data == data)
            {
                head = head.next;
            }
            Node curr = head;
            while(curr != null && curr.next != null)
            {
                if(curr.next.data == data)
                {
                    curr.next = curr.next.next;
                }
                else
                {
                    curr = curr.next;
                }
            }
            return curr;
        }
    }

