package ro.ase.cts.state;

public class ComandaMancare { //contextul
    private int nrComanda;
    private State state;

    public ComandaMancare(int nrComanda, State state) {
        this.nrComanda = nrComanda;
        this.state = state;
    }

    public void setState(State state) {
        this.state = state;
    }
    //met nextState

    public void nextState(){
        state.updateStare(this);
    }
}
