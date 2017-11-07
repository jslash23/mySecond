package Lesson10.Lesson10HW;

import java.lang.reflect.Array;
import java.util.Date;

public class Demo {

    public static void main(String[] args) {

        ElectronicsOrder electronicsOrder = new ElectronicsOrder("Komputer", new Date(),
                "Львов", -100, new Customer("Василий", "Киев", "мужской"), 10);
        ElectronicsOrder electronicsOrder1 = new ElectronicsOrder("Monitior", new Date(),
                "Киев", 200, new Customer("Диана", "Харьков", "женский"), 5);

        FurnitureOrder furnitureOrder = new FurnitureOrder("Test", null, "Киев",
                200, new Customer("Тарас", "Днепр", "мужской"), "table");
        FurnitureOrder furnitureOrder1 = new FurnitureOrder("Кресло", null, "Харьков",
                1000, new Customer(null, null, "мужской"), "chear");

        ElectronicsOrder[] electronicsOrders = new ElectronicsOrder[]{electronicsOrder, electronicsOrder1};

        //electronicsOrder.calculatePrice();
        Order order;
        order = electronicsOrder;

        //order = electronicsOrder1;

        order.calculatePrice();
        order.confirmShipping();
        order.validateOrder();

        order = furnitureOrder;

        order.calculatePrice();
        order.confirmShipping();
        order.validateOrder();

    }
}

