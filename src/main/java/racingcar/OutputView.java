package racingcar;

import java.util.List;

public class OutputView {
    public void printSingleRace(List<Car> cars){
        for (Car car : cars) {
            System.out.print(car.getCarName() + " : ");
            System.out.println(car.getPosition());
        }
    }
}
