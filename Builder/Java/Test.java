public class Test {
    public static void main(String[] args) {
        Burger obj = new Burger.Builder(2)
                .setCheese(true)
                .setTomato(true)
                .build();
        System.out.println(obj);
    }
}