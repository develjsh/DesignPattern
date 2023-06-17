# Memento Pattern


## Memento Pattern이란?
Memento Pattern은 상태의 객체를 저장하여 이전 상태로 복구하는 패턴입니다.
객체의 상태를 관리하고, 객체의 상태를 저장하고, 저장된 상태의 객체로 복원합니다.


## 구성요소
- Originator
- Memento
- Caretaker


## 생성할 파일
- TextEditorTest.java: 실행 및 테스트
- TextEditor.java: Caretaker
- TextWindow.java: Originator
- TextWindowState.java: Memento


## 사용 방법
TextEditor가 TextWindow와 TextWindowState를 둘 다 가지고 있으며 hitSave() 할 때 TextWindowState에 값을 저장하여
write() 함수 호출 했을 때 저장한 값이랑 다른 값을 계속해서 가지고 있는게 핵심 포인트입니다.