//Java program to remove elements from an ArrayList

import java.util.ArrayList;
import java.util.List;
 
public class prog9arraylist
{
    public static void main(String[] args)
    {
        List<Integer> myarraylist = new ArrayList<>();
 
        myarraylist.add(10);
        myarraylist.add(20);
        myarraylist.add(30);
        myarraylist.add(1);
        myarraylist.add(2);

        System.out.println("original array list");
        System.out.println(myarraylist);
 
        myarraylist.remove(1);
        myarraylist.remove(2);

        System.out.println("array list after removing elements");
        System.out.println(myarraylist);
    }
}
