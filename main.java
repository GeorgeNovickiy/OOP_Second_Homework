package OOP_java_sem2;

import java.util.ArrayList;

import OOP_java_sem2.buyer.createOrder;
import OOP_java_sem2.shipment.Product;


public class main {
    public static void main(String[] args) {

        ArrayList <Product> list_products = new ArrayList<>();
        list_products.add(new Food(15,"Twix", 80, 10, new GregorianCalendar(2026, 10, 15, 0, 0),80));
        list_products.add(new Food(16,"Mars", 90, 9, new GregorianCalendar(2026, 10,0, 0, 0), 150));
        list_products.add(new Food(13,"Snickers", 60, 15, new GregorianCalendar(2026, 10,0, 0, 0),150));
        list_products.add(new Food(14,"Bounty", 85, 18, new GregorianCalendar(2026, 9, 13, 0, 0, 0), 120));
        list_products.add(new Beverage(32,"Coca-Cola", 150, 7, new GregorianCalendar(2026, 3, 8, 0, 0, 0), 0.5));
        list_products.add(new Hot_beverage(21,"Nesсafe", 150, 35, 
                    new GregorianCalendar(2024, 5, 12, 0, 0, 0), 0.33, 25));
        list_products.add(new Hot_beverage(22,"Jacobs", 120, 3, 
                    new GregorianCalendar(2024, 6, 07, 0, 0, 0), 0.33, 20));
        list_products.add(new Hot_beverage(24,"Bushido", 170, 12, 
                    new GregorianCalendar(2024, 03, 11, 0, 0, 0), 0.6, 25));

        new createOrder().getList_order(list_products);               // Передача базы продуктов для оформления заказа
    }
}
