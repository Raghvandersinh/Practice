/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package directorytest;

/**
 *
 * @author nitir
 */
public class DirectoryEntry
{
    String name;
    String number;

    public DirectoryEntry(String name, String number)
    {
        this.name = name;
        this.number = number;
    }

    public String getName()
    {
        return name;
    }

    public String getNumber()
    {
        return number;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setNumber(String number)
    {
        this.number = number;
    }

    @Override
    public String toString()
    {
        return "DirectoryEntry{" + "name=" + name + ", number=" + number + '}';
    }
    
    public boolean equals(Object obj)
    {
        if(obj == this)
        {
            return true;
        }
        if(obj == null)
        {
            return false;
        }
        if(this.getClass() == obj.getClass())
        {
            DirectoryEntry other = (DirectoryEntry) obj;
            return name.equals(other.name);
        }
        return false;
    }
}
