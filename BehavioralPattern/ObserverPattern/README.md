# Observer Pattern 구현

## Observer Pattern이란?
직접 상태 값을 관찰하는게 아니라 수동적으로 상태 값을 전달 받아 처리하는 패턴입니다.
단반향성의 감시자 패턴은 Publish-Subscribe Pattern 또는 Listener Pattern 이라고 합니다.

패턴 구조는 주체와 감시자 역활이 있습니다.

주체(Subject)
* 감시자 패턴에서 객체를 등록, 삭제, 통보를 구현합니다.
* 실제 동작하는 모든 통보 객체는 주체에 등록되어야 합니다.

감시자(Observer)
* 상태가 변경도리 경우 주체는 감시자에게 상태 변화를 통보합니다. 이 때 통보되는 감시자는 여러 개가 될 수 있습니다.


## 파일
1. Observer Abstract class를 생성합니다.
Abstract Class는 추상적으로 클래스를 구성한것을 말합니다. 상속(Extends)을 통해서 자식 클래스에서 완성을 합니다.

2. Observer 구현 클래스를 생성해줍니다.
현재는 UserA와 UserB를 구현했지만 하나만 구현해도 됩니다.

3. Subject interface를 생성해줍니다.

4. Subject interface를 implements한 Members 클래스를 구현해줍니다.
여기에는 List<Observer>를 생성해줘야합니다.

5. MemberTset에서 테스트를 해봅니다.

### error
- Illegal modifier for the interface field Observer.name; only public, static & final are permitted
자바에서 interface 에 정의되는 메소드는 외부로 공개되는 메소드를 정의하는 것 입니다. 그러므로 private 나 protected 로 정의가 불가능합니다.
private을 수정해줍니다.

- cannot find symbol
vscode에서 package 때문에 에러가 발생했습니다.
위치 설정을 해주는 방법도 있지만 저는 제거로 해결했습니다.