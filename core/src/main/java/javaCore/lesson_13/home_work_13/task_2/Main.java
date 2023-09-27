package javaCore.lesson_13.home_work_13.task_2;

//супер!++
public class Main {
    public static void main(String[] args) {
        Product[] products = {
                new Apple("Luiza", 22.0, 12, "Red"),
                new Apple("Courtney", 22.0, 12, "Red"),
                new Coffee("Arabic", 63, 2, "Ground"),
                new Computer("Sony", 1250, 1, "Intel", 15)
        };
        Cart cart = new Cart(products);
        User mike = new User("Mike", 22, cart);

        cart.addProduct(new Apple("Ally", 22.0, 13, "Yellow"));
        cart.removeProduct(new Apple("Luiza", 22.0, 12, "Red"));
        System.out.println(mike.getName()+" has "+cart.getTotalPrice()+" in cart");
        System.out.println(mike.getName()+" has "+cart.getTotalQuantity()+" products in cart");
        cart.printCart();
    }
}
