package classes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Cafeteria {
    private volatile List<Cliente> fila = new ArrayList<>();
    private volatile List<Barista> barra = Arrays.asList(new Barista(this),new Barista(this),new Barista(this));
    private volatile boolean disponible = true;
    public void atender() throws InterruptedException {
        while(!disponible){
            wait();
        }
        for(Barista barista : barra){
            if(barista.isDisponible() && !fila.isEmpty()){
                barista.setCliente(fila.get(0));
                barista.setDisponible(false);
                barista.start();
                barra.remove(0);
                equipoDisponible();
            }
        }
    }

    public void equipoDisponible(){
        for(Barista barista : barra){
            if(barista.isDisponible()){
                disponible = true;
            }
        }
        disponible = false;
    }

    public List<Cliente> getFila() {
        return fila;
    }
}
