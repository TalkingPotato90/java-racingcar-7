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
        int tryCount = Integer.parseInt(inputView.receiveTryCount());
        System.out.println();

        System.out.println("실행 결과");
        playRace(tryCount, cars, outputView);

        List<Car> winners = selectWinner(cars);
        outputView.printWinners(winners);
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

    public void playRace(int tryCount, List<Car> cars, OutputView outputView){
        Thrust thrust = new Thrust();

        for(int i = 0; i < tryCount; i++) {
            for (Car car : cars) {
                if (thrust.move()) {
                    car.moveForward();
                }
            }
            outputView.printSingleRace(cars);
            System.out.println();
        }
    }

    public List<Car> selectWinner(List<Car> cars){
        List<Car> winners = new ArrayList<>();
        int winnerPosition = 0;

        for (Car car : cars) {
            if(car.getPosition() > winnerPosition) {
                winnerPosition = car.getPosition();
                winners.clear();
                winners.add(car);
            }else if(car.getPosition() == winnerPosition) {
                winners.add(car);
            }
        }

        return winners;
    }
}
