package ro.ase.cts.strategy;

public class Alg2Enc implements EncStrategy{
    @Override
    public void encrypt(String txt) {
        System.out.println("Alg2#"+txt+"#Alg2");
    }
}
