package gestioneconto;

import java.util.HashMap;

public class Correntista extends Thread{

    private final String nome;
    
    private final ContoCorrente conto;
    
    private final HashMap<String, Integer> movimenti;

    public Correntista(String nome, ContoCorrente conto) {
        this.nome = nome;
        this.conto = conto;
        movimenti = new HashMap<>();
        movimenti.put("Versamento", 0);
        movimenti.put("Prelievo", 0);
    }

    @Override
    public void run() {
        synchronized(conto){
                conto.versa(200);
                movimenti.put("Versamento", 200 + movimenti.get("Versamento"));
                System.out.println( nome + ": Versamento di " + movimenti.get("Versamento") + " euro effettuato\n");
                
                conto.preleva(100);
                movimenti.put("Prelievo", 100 + movimenti.get("Prelievo"));
                System.out.println(nome + ": Prelievo di " + movimenti.get("Prelievo") + " euro effettuato");
                
                conto.preleva(100);
                movimenti.put("Prelievo", 100 + movimenti.get("Prelievo"));
                System.out.println(nome + ": Prelievo di " + movimenti.get("Prelievo") + " euro effettuato");
                    
                System.out.println(nome + ": Conto: " + conto.visSaldo() + "\n");
        }
    }
}
