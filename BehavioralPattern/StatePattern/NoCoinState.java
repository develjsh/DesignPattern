public class NoCoinState implements State {
    TicketMachine ticketMachine;

    NoCoinState(TicketMachine ticketMachine) {
      this.ticketMachine = ticketMachine;
    }
    
    @Override
    public void insertCoin() {
        ticketMachine.setState(ticketMachine.getCoinState());
    }

    @Override
    public void printTicket() {
        System.out.println("동전이 없습니다. 동전을 넣어주세요.");
    }
    
}
