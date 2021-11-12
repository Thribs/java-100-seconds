class HelloWorld {
    public static void main(String[] args) {
        System.out.println(sayHi());
        Coffee joe = new Coffee(5);
        System.out.println(joe.brew());
    }

    public static String sayHi() {
        return "Hi, mom!";
    }

}

// public class Coffee {
//     String blend;
//     boolean decaf;
//     int price;

    
// }