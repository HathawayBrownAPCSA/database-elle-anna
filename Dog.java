
/**
 * Constructor for dogs list
 *
 * @author Elle Wearsch
 * @version 9-21-20`
 */
public class Dog
{
    private String dogName;
    private String dogBreed;
    private double dogWeight;
    private int dogAge;
    
    /** The constructor initializes values for name, breed, weight, and age.
     * @param n the name of the dog
     * @param b the breed of the dog
     * @param w the weight of the dog
     * @param a the weight of the dog
     */
    
    public Dog (String str)
    {
        InputLine dogInfo = new InputLine(str);
    
        String temp = dogInfo.nextToken();
        dogName = temp;
    
        temp = dogInfo.nextToken();
        dogAge = new Integer(temp);
        
        temp = dogInfo.nextToken();
        dogWeight = new Integer(temp);
    
        temp = dogInfo.nextToken();
        dogBreed = temp;
    }
    
    /** Returns a string with all of the information abput the dog
     * @return all the information about the dog
     */
    public String toString()
    {
        return dogName + " is a " + dogBreed + " who is " + dogWeight + "lbs and " 
        + dogAge + " year(s) old.";
    }
    
    /** gets the weight of the dogs
     * @return weight
     */
    public double getWeight()
    {
        return dogWeight;
    }
    
    /** gets names of dogs
     * @return dog name
     */
    public String getName()
    {
        return dogName;
    }
    
     /** gets ages of dogs
     * @return dog age
     */
    public int getAge()
    {
        return dogAge;
    }
    
    /** gets breed of dogs
     * @return dog breed
     */
    public String getBreed()
    {
        return dogBreed;
    }
    
    //copyrightdate,itemcallnumber,title,author,ccode,itemnumber,status
  public String toCSV()
  {
    String result = "";
    result += dogName + "," + dogAge + ",";
    result += dogWeight + ","+ dogBreed + ",";
    return result;
  }

  // If there is a comma in the string,
  // surrounds it with withQuotes
  private String withQuotes (String s)
  {
    if (s.indexOf(',') >= 0)
    {
      return "\"" + s + "\"";
    }
    else
    {
      return s;
    }
  }
  
  public int compareTo(Dog other)
  {
      return (this.dogName.compareTo(other.dogName));
  }
  
  /*
  public String toString ()
  {
      return dogName + "\t" + dogAge + "\t" + dogWeight + "\t" + dogBreed;
  }
  */
}

