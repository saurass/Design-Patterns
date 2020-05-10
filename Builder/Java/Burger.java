public class Burger {
    // Compulsory params
    private int size;

    // Optional params
    private boolean pepperoni;
    private boolean lettuce;
    private boolean cheese;
    private boolean tomato;

    public Burger(Builder builder) {
        this.size = builder.size;
        this.pepperoni = builder.pepperoni;
        this.lettuce = builder.lettuce;
        this.cheese = builder.cheese;
        this.tomato = builder.tomato;
    }

    @Override
    public String toString() {
        return "Burger{" +
                "size='" + size + '\'' +
                ", pepperoni='" + pepperoni + '\'' +
                ", lettuce='" + lettuce + '\'' +
                ", cheese='" + cheese + '\'' +
                ", tomato='" + tomato + '\'' +
                '}';
    }

    // While building object - so that the user doesn't have to create object of random class,
    // we set builder to inner class
    public static class Builder {
        // Compulsory params
        private int size;

        // Optional params
        private boolean pepperoni;
        private boolean lettuce;
        private boolean cheese;
        private boolean tomato;

        // constructor for compulsory param
        public Builder(int size) {
            this.size = size;
        }

        // Setters for optional params
        public Builder setPepperoni(boolean pepperoni) {
            this.pepperoni = pepperoni;
            return this;
        }

        public Builder setLettuce(boolean lettuce) {
            this.lettuce = lettuce;
            return this;
        }

        public Builder setCheese(boolean cheese) {
            this.cheese = cheese;
            return this;
        }

        public Builder setTomato(boolean tomato) {
            this.tomato = tomato;
            return this;
        }

        // Build the object
        public Burger build() {
            return new Burger(this);
        }
    }

}