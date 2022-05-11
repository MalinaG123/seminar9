package ro.ase.cts.strategy;

public class Alg3Enc implements EncStrategy{
    @Override
    public void encrypt(String txt) {
        System.out.println("Alg3#"+txt+"#Alg3");
    }
}
