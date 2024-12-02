package racingcar;

import java.util.List;
import java.util.stream.Collectors;

public class OutputView {
    public void printSingleRace(List<Car> cars){
        for (Car car : cars) {
            System.out.print(car.getCarName() + " : ");
            String positionBar = "-";
            System.out.println(positionBar.repeat(car.getPosition()));
        }
    }

    public void printWinners(List<Car> cars){
        System.out.print("최종 우승자 : ");
        if (cars.size() == 1) {
            System.out.println(cars.getFirst().getCarName());
        }else {
            System.out.println(cars.stream()
                    .map(Car::getCarName)
                    .collect(Collectors.joining(", ")));
        }
    }
}
