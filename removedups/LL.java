/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package removedups;

/**
 *
 * @author nitir
 */
public class LL
{
    public Node head;
    private int size;
    
    public Node getHead()
    {
        return this.head;
    }
    
    private class Node
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
    
    public void addFirst(int item)
    {
        head = new Node(item,head);
        size++;
    }
    
    public Node deleteLast(int item)
    {
        Node curr = head;
        
        if(curr == null && curr.next == null)
        {
            head = null;
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
    public Node removeDup()
    {
        Node curr = head;
        while(curr != null && curr.next != null)
        {
            if(curr.data == curr.next.data)
            {
                curr.next = curr.next.next;
            }
            else
            {
                curr = curr.next;
            }
        }
        return head;
    }
    
    public Node merge(Node l1, Node l2)
    {
        Node result = null;
        if(l1==null)
        {
            return l2;
        }
        if(l2 == null)
        {
            return l1;
        }
        if(l1.data <= l2.data)
        {
            result = l1;
            result.next = merge(l1.next,l2);
        }
        else
        {
            result = l2;
            result.next = merge(l2.next, l1);
        }
       return result;
    }
   public Node mergeresult(Node h)
   {
       if(h == null || h.next == null)
       {
           return h;
       }
       Node middle = getMiddle(h);
       Node nextofmiddle = middle.next;
       middle.next = null;
       Node left = mergeresult(h);
       Node right = mergeresult(nextofmiddle);
       Node sortedList = merge(left,right);
       return sortedList;
   }
   
   public Node getMiddle(Node head)
   {
       if(head==null)
       {
           return head;
       }
       Node slow = head, fast = head;
       
       while(fast.next != null && fast.next.next != null)
       {
           slow = slow.next;
           fast = fast.next.next;
       }
       return slow;
   }
   
   public void push(int data)
   {
       Node temp = new Node(data);
       temp.next = head;
       head = temp;
       
   }
   
  
}
