package classes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Cafeteria {
    private volatile List<Cliente> fila = new ArrayList<>();
    private volatile List<Barista> barra = Arrays.asList(new Barista(this),new Barista(this),new Barista(this));
    private volatile boolean disponible = true;
    public synchronized void cogerCliente() throws InterruptedException {
        while(!disponible){

        }
    }

    public synchronized void atender() throws InterruptedException {
        while(disponible){

        }
    }
    public void equipoDisponible(){

    }

    public List<Cliente> getFila() {
        return fila;
    }
}
