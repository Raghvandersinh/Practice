/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package singlelinkedlist;

/**
 *
 * @author nitir
 */
public class SingleLinkedList<E>
{
    private Node<E> head = null;
    private int size;
    
    public void addFirst(E item)
    {
        head = new Node<E>(item,head);
        size++;
    }
    
    public E get(int index)
    {
        if(index < 0 || index >= size)
        {
            throw new IndexOutOfBoundsException(Integer.toString(index));
        }
        
        Node<E> node = getNode(index);
        return node.data;
    }
    
    public E set(int index, E newValue)
    {
        if(index < 0 || index >= size)
        {
            throw new IndexOutOfBoundsException(Integer.toString(index));
        }
        Node<E> node = getNode(index);
        E result = node.data;
        node.data = newValue;
        return result;
    }
    
    public void add(int index, E item)
    {
        if(index < 0 || index > size)
        {
            throw new IndexOutOfBoundsException(Integer.toString(index));
        }
        if(index == 0)
        {
            addFirst(item);
        }
        else
        {
            Node<E> node = getNode(index - 1);
            addAfter(node, item);
        }
    }
    public boolean add(E item)
    {
        add(size, item);
        return true;
    }
    
    public E remove(int index)
    {
        if(index < 0 || index > size)
        {
            throw new IndexOutOfBoundsException(Integer.toString(index));
        }
        if(index == 0)
        {
            return removeFirst();
        }
        else
        {
            Node<E> node = getNode(index-1);
            return removeAfter(node);
        }
    }
    
    public int indexOf(E target)
    {
        Node<E> nodeRef = head;
        int i = 0;
        while(nodeRef != null && nodeRef.data != target)
        {
            nodeRef = nodeRef.next;
            i++;
        }
        if(nodeRef != null)
        {
            return i;
        }
        return -1;
    }
    public boolean remove(E item)
    {
        int toRemove = indexOf(item);
        if(toRemove == -1)
        {
            return false;
        }
        else
        {
            remove(toRemove);
        }
        return true;
    }
    
    public void addNoHelper(int index, E item)
    {
        if(index < 0 || index > size+1)
        {
            throw new IndexOutOfBoundsException(Integer.toString(index));
        }
        if(index == 0)
        {
            head = new Node<E>(item, head);
            size++;
        }
        else
        {
            Node<E> node = getNode(index-1);
            node.next = new Node<E>(item, node.next);
            size++;
        }
    }
    
    private void addAfter(Node<E> node, E item)
    {
        node.next = new Node<E>(item, node.next);
        size++;
    }
    private E removeAfter(Node<E> node)
    {
        Node<E> temp = node.next;
        if(temp != null)
        {
            node.next = temp.next;
            size--;
            return temp.data;
        } 
        return null;
    }
    
    private E removeFirst()
    {
        Node<E> temp = head;
        if(head != null)
        {
            head = head.next;
            size--;
            return temp.data;
        }
        return null;
           
    }
    private Node<E> getNode(int index)
    {
        Node<E> node = head;
        for(int i = 0; i < index && node != null; i++)
        {
            node = node.next;
        }
        return node;
    }
    
    public int getSize()
    {
        return size;
    }
    
    public String toString()
    {
        Node<E> nodeRef = head;
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
    private static class Node<E>
    {
        private E data;
        private Node<E> next;
        
        private Node(E dataItem)
        {
            data = dataItem;
            next = null;
        }
        
        private Node(E dataItem, Node<E> nodeRef)
        {
            data = dataItem;
            next = nodeRef;
        }
    }
}
