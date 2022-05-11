package ro.ase.cts.strategy;

public class EncryptionEngine {
    private EncStrategy enc;

    public EncryptionEngine(EncStrategy enc) {
        this.enc = enc;
    }

    public void setEnc(EncStrategy enc) {
        this.enc = enc;
    }

    public void getEncryptedText(String s){
        enc.encrypt(s);
    }
}
