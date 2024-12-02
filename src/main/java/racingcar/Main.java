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
        inputView.receiveCarNames();
        inputView.receiveTryCount();
    }

    public List<String> separateCarNames(String carNames){
        List<String> carNamesList = new ArrayList<>();
        String[] names = carNames.replaceAll(" ", "").split(",");
        Collections.addAll(carNamesList, names);

        return carNamesList;
    }
}
