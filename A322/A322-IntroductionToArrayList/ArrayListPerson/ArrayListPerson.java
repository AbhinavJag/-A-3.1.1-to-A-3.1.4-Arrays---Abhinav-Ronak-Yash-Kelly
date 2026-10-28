import java.util.ArrayList;

public class ArrayListPerson
{
  public static void main(String[] args)
  {
    ArrayList<Person> list = new ArrayList<Person>();
    list.add(new Person("Mike", 18, 750.00));
    list.add(new Person("Priya", 17, 1200.50));
    list.add(new Person("Jordan", 16, 310.25));

    // Error: "incompatible types: String cannot be converted to Person".
    // list is an ArrayList<Person>, so it can only hold Person objects.
    // "My cousin" is a String, so the compiler won't let it in.
    // list.add("My cousin");

    for (Person p : list)
    {
      System.out.println(p.getName() + " is " + p.getAge() + " and has $" + p.getSavings());
    }
  }
}
