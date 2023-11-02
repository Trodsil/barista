package classes;

import com.sun.management.UnixOperatingSystemMXBean;

public class Cliente extends Thread{
    private String nombre;
    private Cafeteria cafeteria;
    private int tiempoespera;
    private volatile boolean atendido = true;
    public Cliente(String nombre, int tiempoespera ,Cafeteria cafeteria) {
        this.nombre = nombre;
        this.tiempoespera = tiempoespera;
        this.cafeteria = cafeteria;
    }

    @Override
    public void run() {
        try {
            Thread.sleep((long) (Math.random()*10)*1000);
            System.out.println(this.nombre+" se ha puesto a la cola");
            cafeteria.addFila(this);
            cafeteria.producir();
            esperar();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    private void esperar() throws InterruptedException {
        Thread.sleep(tiempoespera*1000L);
        if(this.atendido){
            System.out.println(this.getNombre()+" ha perdido la paciencia");
            this.atendido = false;
            cafeteria.producir();
        }

    }

    public String getNombre() {
        return nombre;
    }


    public boolean isAtendido() {
        return atendido;
    }

    public void setAtendido(boolean atendido) {
        this.atendido = atendido;
    }
}
