
/**
 * A class to test the Book and BookList classes
 */
import java.util.ArrayList;

public class Database
{
    public static void main(String[] args)
    {
        DogList dogs = new DogList("database.csv");
        System.out.println(dogs);
        
        
        System.out.println("\nGoldens:\n");
        ArrayList<Dog> golden = dogs.filter("Golden Retriever");
        for ( Dog d: golden)
        {
             System.out.println(d);
        }
        
    }
}
