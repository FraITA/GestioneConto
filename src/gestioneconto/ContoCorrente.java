package gestioneconto;

public class ContoCorrente {

    private int saldo;

    public ContoCorrente() {
        this.saldo = 0;
    }

    public synchronized void versa(int soldi) {
        this.saldo += soldi;
    }

    public synchronized void preleva(int soldi) {
        this.saldo -= soldi;
    }

    public synchronized int visSaldo() {
        return this.saldo;
    }
}
