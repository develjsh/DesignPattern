# Mediator Pattern
Mediator Pattern은 객체의 관계를 하나의 객체로 정리하는 패턴입니다. 주로 분산된 다수의 역활을 조정할 때 사용됩니다.

## 특징
- 중자재 패턴은 서로 의존적인 M:N 관계를 가진 객체를 느슨한 1:1 관계로 변경합니다.
- 복잡한 통신과 제어를 한 곳에 집중하여 처리하는 효과가 있습니다.
- 다른 동료 객체에 직접 접근해서 호출하지 않고 중재자를 의존해서 다른 동료 객체를 호출합니다.
- 중재자 패턴은 객체의 강력한 구조적 결합 문제점을 해결합니다.
- 중재자를 이용하지 않으면 다수의 동료 객체가 서로 정보를 직접 주고받는다. 중재자 패턴은 동료 객체끼리 정보를 직접 주고받지 않도록 통신 경로를 제한합니다.
- 중재자는 하나의 객체 요청에 대해 모든 객체로 통보를 처리해야 하므로 경로의 수가 증가합니다.
- 중재자 패턴을 설계할 때는 경로의 수가 증가함에 따라 성능이 저하되지 않도록 신경써서 구성해야 합니다.

## 생성할 파일
1. ColleagueType enum
2. Mediator interface(먼저 만들고 나서 나중에 추상 부분 작성합니다.)
3. Colleague abstract class
4. ConcreteMediator
5. UserConcreteColleague, SystemConcreteColleague, AdminConcreteColleague
6. MediatorTest

## send() 실행 시 실행된 순서
1. Colleague의 send() 메서드
2. mediator 객체의 mediate() 메서드
   mediator 객체의 mediate() 메서드는 ConcreteMediator에서 구현되기 떄문에 ConcreteMediator으로 이동
4. 재정의된 mediate() 실행