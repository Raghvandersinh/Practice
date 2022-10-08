/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package doublelinklist;

/**
 *
 * @author nitir
 */
public class Main
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        DLL<String> listA = new DLL();
        
        listA.addToEnd("Monti");
        listA.addToEnd("Monkey");
        listA.addToEnd("tit");
        listA.addToFirst("donkey");
        listA.deleteLast();
        listA.deleteFirst();
        listA.printlist();
    }
    
}
