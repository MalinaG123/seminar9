package ro.ase.cts.state;

public class ComandaPlasata implements State{
    private static ComandaPlasata instance = null;

    private ComandaPlasata(){}

    public static synchronized ComandaPlasata getInstance()
    {
        if (instance == null)
            instance = new ComandaPlasata();

        return instance;
    }
    @Override
    public void updateStare(ComandaMancare comandaMancare) {
        System.out.println("Comanda a fost plasata");
        comandaMancare.setState(InCursDePreparare.getInstance());
    }
}
