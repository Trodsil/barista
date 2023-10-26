package classes;

import java.util.ArrayList;
import java.util.List;

public class Cafeteria extends Thread{
    static List<Cliente> fila = new ArrayList<>();
    private List<Barista> barra = new ArrayList<>();

    @Override
    public void run() {
        if(!fila.isEmpty()){
            for(Barista barista : this.barra){
                barista.setCliente(fila.get(0));
                barista.start();
            }
        }
    }
}
