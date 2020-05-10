public class Solution {
    public static void main(String[] args) {
        Person obj = Person.getInstance();
        System.out.println(obj);

        Person obj2 = Person.getInstance();
        System.out.println(obj2);

        // It is observed that both have same address
    }
}