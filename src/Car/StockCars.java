package Car;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class StockCars implements StockCarsInterface {
    private List<BuildCar> stockCars = new ArrayList<BuildCar>();

    public void orderCars(BuildCar car) {
        stockCars.add(car);
    }


    public void sellCars(String orderNumber) {
        Iterator<BuildCar> iterator = stockCars.listIterator();
while(iterator.hasNext()) {
    BuildCar car = iterator.next();
    if(Objects.equals(car.getOrderNumber(), orderNumber)) {
        iterator.remove();
        break;
    }
}
    }


}



