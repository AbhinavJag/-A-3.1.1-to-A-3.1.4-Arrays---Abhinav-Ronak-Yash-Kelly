public class Person
{
  private String name;
  private int age;
  private double savings;

  public Person(String n, int a, double s)
  {
    name = n;
    age = a;
    savings = s;
  }

  public String getName()
  {
    return name;
  }

  public int getAge()
  {
    return age;
  }

  public double getSavings()
  {
    return savings;
  }
}
