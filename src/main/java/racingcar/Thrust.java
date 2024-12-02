package racingcar;

import camp.nextstep.edu.missionutils.Randoms;

public class Thrust {
    private int createRandomNumber(){
        return Randoms.pickNumberInRange(0, 9);
    }

    public boolean move(){
        return createRandomNumber() >= 4;
    }
}
