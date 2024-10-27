# java-racingcar-precourse

## 자동차 경주
초간단 자동차 경주 게임을 구현한다.

- 주어진 횟수 동안 n대의 자동차는 전진 또는 멈출 수 있다.
- 각 자동차에 이름을 부여할 수 있다. 전진하는 자동차를 출력할 때 자동차 이름을 같이 출력한다.
- 자동차 이름은 쉼표(,)를 기준으로 구분하며 이름은 5자 이하만 가능하다.
- 사용자는 몇 번의 이동을 할 것인지를 입력할 수 있어야 한다.
- 전진하는 조건은 0에서 9 사이에서 무작위 값을 구한 후 무작위 값이 4 이상일 경우이다.
- 자동차 경주 게임을 완료한 후 누가 우승했는지를 알려준다. 우승자는 한 명 이상일 수 있다.
- 우승자가 여러 명일 경우 쉼표(,)를 이용하여 구분한다.
- 사용자가 잘못된 값을 입력할 경우 `IllegalArgumentException`을 발생시킨 후 애플리케이션은 종료되어야 한다.

## 입출력 요구 사항
### 입력
- 경주할 자동차 이름(이름은 쉼표(,) 기준으로 구분)
    ```
    pobi,woni,jun
    ```
- 시도할 횟수
    ```
    5
    ```
### 출력
- 차수별 실행 결과
    ```
    pobi : --
    woni : ----
    jun : ---
    ```
- 단독 우승자 안내 문구
    ```
    최종 우승자 : pobi
    ```
    
- 공동 우승자 안내 문구
    ```
    최종 우승자 : pobi, jun
    ```

- 실행 결과 예시
    ```
    경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)
    pobi,woni,jun
    시도할 횟수는 몇 회인가요?
    5
    
    실행 결과
    pobi : -
    woni :
    jun : -
    
    pobi : --
    woni : -
    jun : --
    
    pobi : ---
    woni : --
    jun : ---
    
    pobi : ----
    woni : ---
    jun : ----
    
    pobi : -----
    woni : ----
    jun : -----
    
    최종 우승자 : pobi, jun
    ```
  
## 기능 목록
- [x] 사용자에게 자동차 이름을 입력받는다
- [x] 입력받은 자동차 이름을 쉼표 기준으로 구분한다
- [x] 개수만큼 자동차 객체 만들기
  - [x] 자동차 객체를 생성한다
    - [x] 자동차의 이름
    - [x] 이동여부
    - [x] 현재 위치
- [x] 사용자에게 횟수를 입력받는다
- [x] 입력받은 횟수만큼 아래 항목을 반복한다
  - [x] 자동차 개수만큼 반복
    - [x] 랜덤 숫자를 하나 생성한다
    - [x] 랜덤 숫자가 4이상인지 확인한다
    - [x] 자동차에게 이동 정보를 알려준다
  - [x] 이동 결과를 출력한다
- [x] 최종 우승자를 출력한다

## 기능 목록 단계화
- [x] 게임 준비
  - [x] 사용자에게 받은 입력대로 자동차를 생성한다.
- [x] 게임 실행
  - [x] 사용자에게 받은 입력만큼 경기를 진행한다.
- [x] 결과 출력
  - [x] 최종 결과를 출력한다.

## 제약사항
1. 자동차 이름 입력
   - [x] 개별 자동차 이름은 1 ~ 5자
   - [x] 자동차 이름은 영문 대소문자와 숫자만 가능하다
   - [] 참여하는 자동차의 최대 숫자는 5대
   - [x] 공백은 제거된다
   - [] 자동차 이름의 중복은 허용하지 않는다
2. 시도 횟수 입력
   - [x] 시도 횟수는 숫자만 입력 가능하다
   - [x] 1이상 10 이하만 가능하다

