/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package directorytest;

/**
 *
 * @author nitir
 */
import java.util.ArrayList;
public class Directory
{
   ArrayList<DirectoryEntry> theDirectory;
  
  public Directory()
    {
           theDirectory = new ArrayList<DirectoryEntry>();
    }   
  
  public void phoneDirectory()
  {
      theDirectory.add(new DirectoryEntry("Jane Smith", "555=549-1234"));
      theDirectory.add(new DirectoryEntry("Jamese Smith" , "555-469-1893"));
      printDirectory(theDirectory);
      int index = directorySearch(theDirectory, "Jane Smith");
      System.out.println("Our Target is at Index: " + index);
      DirectoryEntry jane = getDirectoryEntry(theDirectory, index);
      System.out.println(jane);
      System.out.println("Adding Jack... ");
      addOrChangeEntry("Jack", "867-5309");
      printDirectory(theDirectory);
      System.out.println("Changing John...");
      addOrChangeEntry("John Doe", "555-469-7777");
      printDirectory(theDirectory);
      System.out.println("Removing Jane...");
      removeEntry("Jane Smith");
      printDirectory(theDirectory);
   
  }
  
  public int directorySearch(ArrayList<DirectoryEntry> theDirectory, String aName)
  {
      int index = theDirectory.indexOf(new DirectoryEntry(aName, ""));
      return index;
  }
  
  public DirectoryEntry getDirectoryEntry(ArrayList<DirectoryEntry> theDirectory, int index)
  {
      if(index != -1)
      {
          return theDirectory.get(index);
      }
      return null;
  }
  
  public DirectoryEntry getDirectoryEntry(ArrayList<DirectoryEntry> theDirectory, String aName)
    {
      int i = directorySearch(theDirectory,aName);
      return getDirectoryEntry(theDirectory,i);
    }
  
  public String addOrChangeEntry(String aName, String newNumber)
  {
      int index = directorySearch(theDirectory, aName);
      if(index != -1)
      {
          String toReturn = theDirectory.get(index).getNumber();
          theDirectory.set(index, new DirectoryEntry(aName, newNumber));
          return toReturn;
      }
      else
            theDirectory.add(new DirectoryEntry(aName, newNumber));
      return null;
  }
  
  public DirectoryEntry removeEntry(String aName)
  {
      int index = directorySearch(theDirectory, aName);
      if(index != -1)
      {
          DirectoryEntry entry = theDirectory.get(index);
          theDirectory.remove(index);
          return entry;
      }
      return null;
  }
  
  public void printDirectory(ArrayList<DirectoryEntry> theList)
  {
      for(int i = 0; i < theList.size(); i++)
      {
          System.out.println(theList.get(i) + ", ");
      }
      System.out.println("Size: " + theList.size());
  }
  
}