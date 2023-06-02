public class MediatorTest {
    
    public static void main(String[] args) {
        
        Mediator mediator = new ConcreteMediator();

        Colleague colleagueUser1 = new UserConcreteColleague("User1");
        Colleague colleagueUser2 = new UserConcreteColleague("User2");
        Colleague colleagueSystem = new SystemConcreteColleague("System");
        Colleague colleagueAdmin = new AdminConcreteColleague("Admin");

        // Colleague abstract에 Mediator 객체에 주입합니다.
        colleagueUser1.setMediator(mediator);
        colleagueUser2.setMediator(mediator);
        colleagueSystem.setMediator(mediator);
        colleagueAdmin.setMediator(mediator);
 
        mediator.addColleague(colleagueUser1);
        mediator.addColleague(colleagueUser2);
        mediator.addColleague(colleagueSystem);
        mediator.addColleague(colleagueAdmin);
 
        colleagueUser1.setMessage("안녕하세요. User1이 보낸 메시지 입니다.");
        colleagueUser1.send();
    }
}
