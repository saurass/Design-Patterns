public class Person {
    private static Person PersonInstance;

    private Person() {
        // just to make this class private
        // Not accessible from outside
    }

    // Making static so that it can be accessed from outside
    public static Person getInstance() {
        if(PersonInstance == null) {
            PersonInstance = new Person();
        }

        return PersonInstance;
    }

}
