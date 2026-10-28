public class DogArray {
    public static void main(String[] args) {
        Dog[] myDogs = {new Dog("Lady"),
                        new Dog("Tramp"),
                        new Dog("Trusty")};
        Dog[] neighborsDogs = new Dog[2];

        System.out.println("My dogs:");
        System.out.println(myDogs[0].getName());
        System.out.println(myDogs[1].getName());
        System.out.println(myDogs[2].getName());

        // the neighbor visited, so now I know their dogs' names
        neighborsDogs[0] = new Dog("Biscuit");
        neighborsDogs[1] = new Dog("Pepper");
        System.out.println("Neighbor's dogs:");
        System.out.println(neighborsDogs[0].getName());
        System.out.println(neighborsDogs[1].getName());

        Dog[] friendsDogs = {new Dog("Lady"), new Dog("Tramp")};
        System.out.println(friendsDogs[0].getName() + " and " + friendsDogs[1].getName());

        // Error: "illegal start of expression". An initializer list only works
        // when the array is declared, so it can't be used to change an array later.
        // neighborsDogs = {new Dog("Cinnamon"), new Dog("Mocha")}; // error

        // Error: ArrayIndexOutOfBoundsException. neighborsDogs only has 2 elements
        // (index 0 and 1), and an array's length can't change after it's made.
        // neighborsDogs[2] = new Dog("Cocoa"); // error

        neighborsDogs = new Dog[3];
        // Error: NullPointerException. new Dog[3] made a brand new empty array, so
        // every element is null and there's no Dog object to call getName() on.
        // System.out.println(neighborsDogs[0].getName()); // error
        // System.out.println(neighborsDogs[1].getName()); // error

        myDogs[2] = null; // gave my puppy to my neighbor!
        System.out.println("myDogs[2] is now " + myDogs[2]);
    }
}
