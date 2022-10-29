import java.util.ArrayList;
public class TestOrders {
    public static void main(String[] args) {
        CoffeeKiosk coffee = new CoffeeKiosk();
        coffee.addMenuItem("Capputchino", 5.5);
        coffee.addMenuItem("Tea", 2.5);
        coffee.addMenuItem("Espresso", 2.0);
        coffee.addMenuItem("Cola", 2.0);
        coffee.newOrder();
    }
}
