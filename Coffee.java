public class Coffee {
    String blend;
    boolean decaf;
    int price;

    Coffee(int price) {
        this.price = price;
    }

    String brew() {
        return "coffee: $" + price;
    }
    
}

