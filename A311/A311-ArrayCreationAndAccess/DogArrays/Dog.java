public class Dog {
    private String name;

    // no-arg constructor
    public Dog() {
        name = "Unknown";
    }

    public Dog(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }

    public void sit(int seconds) {
        System.out.println(name + " sits for " + seconds + " seconds.");
    }
}
