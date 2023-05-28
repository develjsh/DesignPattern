# State Pattern 구현

## State Pattern이란?
객체의 내부 상태에 따라 스스로 행동을 변경할 수 있게 허가하는 패턴입니다.
State Pattern 주된 목적은 상태 전이를 위한 조건 로직이 지나치게 복잡한 경우 이를 해소하는 것입니다.

Context : 상태 패턴을 이용하는 역할을 수행한다. 하나의 객체에 상태를 조절하는 메소드를 부르는 역할을 한다.
State : 인터페이스나 추상 클래스로 외부에서 동일한 방식으로 상태 알고리즘을 호출하는 방법을 명시한다.
ConcreteState1, ConcreteState2, ConcreteState3 : State의 실제 알고리즘 구현부와 State가 변경 되는 로직을 구현한다.

## Strategy Pattern과 차이점
Strategy Pattern은 state 값을 notify 할 필요 없다는 차이가 있습니다.

## 생성할 파일
- Main: Context를 통해 메서드 호출합니다.
- State: State 구성을 합니다.
- TicketMachine: Context를 구성합니다.
- NoCoinState, CoinState: State를 implements 받아 로직을 구현합니다.