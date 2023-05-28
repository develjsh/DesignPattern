public class MemberTest {
    public static void main(String[] args) {
        Subject subject = new Members();
        Observer observer1 = new UserA("jiae");
        Observer observer2 = new UserA("nova");
        Observer observer3 = new UserB("nova");
        subject.addObserver(observer1);
        subject.addObserver(observer2);
        subject.addObserver(observer3);
        
        subject.notifyObserver();
    }
}
