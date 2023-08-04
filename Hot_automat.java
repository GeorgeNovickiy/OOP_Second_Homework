package OOP_java_sem2.equipment;

import java.util.ArrayList;

import OOP_java_sem2.shipment.Hot_beverage;
import OOP_java_sem2.shipment.Product;
                                               // Конструктор поиска в автомате, горячих напитков по температуре и объему (нет в тукущей реализации)
public class Hot_automat extends Automat{

    public Product findProduct(ArrayList<Product> list_products, String name,  double volume, int temperature){
        for (Product el : list_products) {
            if (el instanceof Hot_beverage ){
                if ((((Hot_beverage) el).getName().equals(name))&&
                    (((Hot_beverage) el).getVolume() == (volume))&&
                    (((Hot_beverage) el).getTemperature() == temperature)){
                      return el;  
                }
            }
        }
        return null;
    }
}
