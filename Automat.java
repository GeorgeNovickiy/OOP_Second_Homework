package OOP_java_sem2.equipment;

import java.util.ArrayList;

import OOP_java_sem2.shipment.Product;
                                                // Конструктор поиска в автомате, продуктов по имени
public class Automat {

    public Product findProduct(ArrayList<Product> list_products, String name){
          for (Product el : list_products) {
            if (el.getName().equals(name)){
                return el;
            }
        }
        return null;
    }
}
