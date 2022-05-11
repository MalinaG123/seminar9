package ro.ase.cts.strategy;

public class Alg1Enc implements EncStrategy{
    @Override
    public void encrypt(String txt) {
        System.out.println("Alg1#"+txt+"#Alg1");
    }
}
