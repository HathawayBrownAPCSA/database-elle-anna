
/**
 * Holds the constructor and methods for manipulating the dog list.
 *
 * @author Elle Wearsch
 * @version 9-21-20
 */

import java.util.ArrayList;


public class Invoice
{
   ArrayList<Dog> dogList;
   
   /**
    * Constructor for new dog
    */
   public Invoice()
   {
       dogList = new ArrayList<Dog>();
   }
   
   //adds dogs to the list
   public void addDog (Dog i)
   {
       dogList.add(i);
   }
   
   //prints the list of dogs and their information
   public void printInvoice()
   {   System.out.println(dogList);
       System.out.println("\n\n");
       for (Dog bubba : dogList)
       {
           System.out.println(bubba);
       }
   }
   
   //adds the weights of all the dogs in the list
   public double getTotalWeight()
   {
       double weight = 0.0;
       for (Dog d : dogList)
       {
           weight += d.getWeight();
       }
       return weight;
   }
   
   //adds the age of all the dogs in the list
   public int getTotalAge()
   {
       int age = 0;
       for (Dog d : dogList)
       {
           age += d.getAge();
       }
       return age;
   }
   
   //creates a list of the names of the dogs in the list
   public String getDogNames()
   {
       String nameList;
       nameList = " ";
       for (Dog bubba : dogList)
       {
           nameList += bubba.getName() + " ";
       }
       return nameList;
   }   
}
