/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package intersectionlist;

/**
 *
 * @author nitir
 */
public class LL
{
    public Node head;
    public int size;
    
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
            this.data =data;
            this.next = next;
        }
    }
        
        public void addFirst(int item)
        {
            head = new Node(item,head);
            size++;
        }
        
        public void addLast(int item)
        {
            Node n = new Node(item);
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
            }
        }
        
        public Node deleteLast()
        {
            Node curr = head;
            
            if(head == null && head.next == null)
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
                Node isDelete = head;
                head = head.next;
                return isDelete;
            }
            return null;
        }
        
        public Node intersect(Node a, Node b)
        {
            if(a == null && b == null)
            {
                return null;
            }
            
            Node ap = a;
            Node bp = b;
            
           while(ap != bp)
            {
                if(ap == null)
                {
                    ap = b;  
                }
                else
                {
                    ap = ap.next;
                }
                if(bp == null)
                {
                    bp = a;
                }
                else
                {
                    bp = bp.next;
                }
            }
           return ap;
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
