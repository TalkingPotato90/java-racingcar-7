package racingcar.view;

import camp.nextstep.edu.missionutils.test.NsTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import racingcar.model.Car;

import java.util.ArrayList;
import java.util.List;

import static camp.nextstep.edu.missionutils.test.Assertions.assertSimpleTest;
import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("입출력 테스트")
class IoTest extends NsTest {
    private InputView inputView = new InputView();
    private OutputView outputView = new OutputView();

    @Test
    @DisplayName("자동차 이름을 입력받는다")
    void carNamesInput() {
        assertSimpleTest(() -> {
            run("pobi,woni,jun");
            assertThat(inputView.receiveCarNames()).isEqualTo("pobi,woni,jun");
        });
    }

    @Test
    @DisplayName("시도할 횟수를 입력받는다")
    void playCountInput() {
        assertSimpleTest(() -> {
            run("5");
            assertThat(inputView.receivePlayCount()).isEqualTo("5");
        });
    }

    @Test
    @DisplayName("자동차 이름과 1회 움직임 출력을 확인한다")
    void printCarNameAndSingleMove() {
        Car car = new Car("pobi", 0);
        Car car2 = new Car("jun", 1);
        outputView.printSingleResult(car);
        outputView.printSingleResult(car2);
        assertThat(output()).contains("pobi :");
        assertThat(output()).contains("jun : -");
    }

    @Test
    @DisplayName("단독 우승자를 출력한다")
    void printSingleWinners() {
        Car car = new Car("pobi", 0);
        Car car2 = new Car("jun", 1);
        List<Car> cars = new ArrayList<>();
        cars.add(car);
        cars.add(car2);
        outputView.printWinners(cars);
        assertThat(output()).isEqualTo("최종 우승자 : jun");
    }

    @Test
    @DisplayName("단독 우승자를 출력한다")
    void printMultiWinners() {
        Car car = new Car("pobi", 1);
        Car car2 = new Car("jun", 1);
        List<Car> cars = new ArrayList<>();
        cars.add(car);
        cars.add(car2);
        outputView.printWinners(cars);
        assertThat(output()).isEqualTo("최종 우승자 : pobi, jun");
    }

    @Override
    protected void runMain() {

    }
}