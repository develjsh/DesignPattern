# Template Method Pattern 구현


## Template Method Pattern이란?
Template Method는 공통된 로직을 분리하여 캡슐화합니다.
공통 단계인 템플릿은 별도의 메서드로 작성합니다. 이 때 공통 기능이 하위 클래스에서 오버라이딩 되지 않도록 final을 사용합니다.
템플릿 메서드는 공통된 알고리즘을 정의하며, 공통된 로직을 처리하는 행동입니다. 
템플릿 메서드는 로직 전체의 구조를 변경하지 않고 일부분만 수정할 때 유용합니다.
큰 틀의 공통된 로직만 처리하는 메서드와 변화된 작은 동작을 처리하는 메서드를 서로 분리하며, 분리는 추상 클래스로 구현합니다.


## 생성할 파일
- Hamberger 클래스
- HamburgerTemplate 추상 클래스
- HamburgerTemplate을 상속받아 만드는 BulgogiBurger 클래스와 ChickenBurger 클래스