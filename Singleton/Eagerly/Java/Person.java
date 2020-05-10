public class Person {
    // Eagerly
    // This object will be created upon class load;
    // NOT as in lazy singleton where obj is instantiated only upon call
    private static Person PersonInstance = new Person();

    private Person() {
        // just to make this class private
        // Not accessible from outside
    }

    // Making static so that it can be accessed from outside
    public static Person getInstance() {
        return PersonInstance;
    }

}
