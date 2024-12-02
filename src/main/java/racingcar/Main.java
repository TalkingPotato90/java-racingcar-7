package racingcar;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    /**
     * 임시 구현
     */
    public void startApplication(){
        InputView inputView = new InputView();
        OutputView outputView = new OutputView();
        String carNames = inputView.receiveCarNames();
        List<String> carNamesList = separateCarNames(carNames);
        List<Car> cars = createCars(carNamesList);
        inputView.receiveTryCount();
        System.out.println();

        System.out.println("실행 결과");
        outputView.printSingleRace(cars);
    }

    public List<String> separateCarNames(String carNames){
        List<String> carNamesList = new ArrayList<>();
        String[] names = carNames.replaceAll(" ", "").split(",");
        Collections.addAll(carNamesList, names);

        return carNamesList;
    }

    public List<Car> createCars(List<String> carNamesList){
        List<Car> cars = new ArrayList<>();

        for (String carName : carNamesList) {
            cars.add(new Car(carName));
        }

        return cars;
    }


}
