package ro.ase.cts.state;

public class InCursDePreparare implements State{
    private static InCursDePreparare instance = null;

    private InCursDePreparare(){}
    public static synchronized InCursDePreparare getInstance()
    {
        if (instance == null)
            instance = new InCursDePreparare();

        return instance;
    }


    @Override
    public void updateStare(ComandaMancare comandaMancare) {
        System.out.println("Mancarea este in curs de preparare");
        comandaMancare.setState(GataDeLivrare.getInstance());
    }
}
