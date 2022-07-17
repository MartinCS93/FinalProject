import Car.BuildCar;
import Car.StockCars;
import Car.Types.ModelType;
import Car.Types.PaintOptions;
import Dealer.Dealer;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Dealer newDealer = new Dealer("MCS Automotive");
        System.out.println("Welcome to " + newDealer.getName() + "!");
        StockCars stockCar = new StockCars();
        stockCar.orderCars(new BuildCar(1000, ModelType.TAIGO,"1.0 TSI 110 CP DSG", PaintOptions.DEEP_BLACK_PEARLESCENT));
        stockCar.orderCars(new BuildCar(1001,ModelType.T_CROSS,"1.5 TSI 150 CP DSG", PaintOptions.DEEP_BLACK_PEARLESCENT));
        stockCar.orderCars(new BuildCar(1002,ModelType.T_ROC,"1.0 TSI 110 CP MANUAL", PaintOptions.DEEP_BLACK_PEARLESCENT));

        System.out.println(stockCar);
        stockCar.sellCars(1001);
        System.out.println();
        System.out.println(stockCar);
        stockCar.sellCars(1002);
        System.out.println();
        System.out.println(stockCar);
    }
}
