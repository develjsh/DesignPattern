public class TicketMachine {
    final State noCoinState;
    final State coinState;
    private State currentState;

    public TicketMachine() {
        this.noCoinState = new NoCoinState(this);
        this.coinState = new CoinState(this);
        this.currentState = noCoinState;
    }

    public void setState(State newState) {
        this.currentState = newState;
    }

    public State getCoinState() {
        return coinState;
    }

    public State getNoCoinState() {
        return noCoinState;
    }

    public void insertCoin() {
        currentState.insertCoin();
    }

    public void printTicket() {
        System.out.println("currentState = " + currentState);
        currentState.printTicket();
    }
}
