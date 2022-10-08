/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package doublelinklist;

/**
 *
 * @author nitir
 */
public class DLL<E>
{
    private Node<E> head = null;
    
    public class Node<E>
    {
        private E data;
        private Node<E> next;
        private Node<E> prev;
        
        public Node(E dataItem)
        {
            data = dataItem;
            next = null;
            prev = null;
        }
    }
        
        public void addToEnd(E data)
        {
            Node n = new Node(data);
            if(head == null)
            {
                head = n;
            }
            else
            {
                Node curr = head;
                while(curr.next != null)
                {
                    curr = curr.next;
                }
                curr.next = n;
                n.prev = curr;
            }     
        }
        
        public void addToFirst(E data)
        {
            Node n = new Node(data);
            if(head == null)
            {
                head = n;
            }
            else
            {
               n.next = head;
               head.prev = n;
               head = n;
            }
        }
        
        public void printlist()
        {
            Node temp = head;
            while(temp !=  null)
            {
                if(temp.next != null)
                {
                System.out.print(temp.data + " ==> ");
                }
                if(temp.next == null)
                {
                    System.out.print(temp.data);
                }
                        
                temp = temp.next;
            }
  
        }
        public Node deleteLast()
        {
            Node delete = head;
            if(head == null || head.next == null)
            {
                head = null;
                return delete;
            }
            while(delete.next != null)
            {
                delete = delete.next;
            }
            return delete.prev.next = null;
        }
        public Node deleteFirst()
        {
            Node delete = head;
            if(head == null || head.next == null)
            {
                head = null;
                return delete;
            }
            head = head.next;
            head.prev = null;
            return delete;
        }
      
    }

