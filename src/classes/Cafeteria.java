package classes;

import java.util.ArrayList;
import java.util.List;

public class Cafeteria {
    private List<Cliente> fila = new ArrayList<>();

    public synchronized void producir() throws InterruptedException {
        notifyAll();
    }

    public synchronized void consume(Barista barista) throws InterruptedException {
        while(fila.isEmpty()){
            wait();
        }
        Cliente cliente = fila.get(0);
        barista.prepararCafe(cliente);
        eliminarDeFila(cliente);
        notifyAll();
    }

    public synchronized void addFila(Cliente cliente){
        this.fila.add(cliente);
    }

    public synchronized void eliminarDeFila(Cliente cliente){
        this.fila.remove(cliente);
    }
}
