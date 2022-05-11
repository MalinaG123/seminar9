package ro.ase.cts.state;

public class GataDeLivrare implements State{
    private static GataDeLivrare instance = null;

    private GataDeLivrare(){}
    public static synchronized GataDeLivrare getInstance()
    {
        if (instance == null)
            instance = new GataDeLivrare();

        return instance;
    }
    @Override
    public void updateStare(ComandaMancare comandaMancare) {
        System.out.println("Comanda este gata de livrare");
    }
}
