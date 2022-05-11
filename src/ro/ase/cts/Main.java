package ro.ase.cts;

import ro.ase.cts.state.ComandaMancare;
import ro.ase.cts.state.ComandaPlasata;
import ro.ase.cts.state.State;
import ro.ase.cts.strategy.Alg1Enc;
import ro.ase.cts.strategy.Alg2Enc;
import ro.ase.cts.strategy.EncStrategy;
import ro.ase.cts.strategy.EncryptionEngine;

public class Main {
    public static void main(String[] args) {
//        STATE
        //sa se implement o apl care sa transmita starea comenzii catre client
        State state = ComandaPlasata.getInstance();
        ComandaMancare c = new ComandaMancare(2,state);
        c.nextState();
        c.nextState();
        System.out.println();

        ComandaMancare c2 = new ComandaMancare(3,state);
        c2.nextState();
        c2.nextState();
        c2.nextState();
        System.out.println();

//        STRATEGY
        EncStrategy enc = new Alg1Enc();
        EncryptionEngine ee = new EncryptionEngine(enc);
        ee.getEncryptedText("text");
        EncStrategy enc2 = new Alg2Enc();
        ee.setEnc(enc2);
        ee.getEncryptedText("text");

    }
}
