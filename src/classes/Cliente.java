package classes;

import com.sun.management.UnixOperatingSystemMXBean;

public class Cliente extends Thread{
    private String nombre;
    private Cafeteria cafeteria;
    private int tiempoespera;
    private volatile boolean atendido = false;
    public Cliente(String nombre, int tiempoespera ,Cafeteria cafeteria) {
        this.nombre = nombre;
        this.tiempoespera = tiempoespera;
        this.cafeteria = cafeteria;
    }

    @Override
    public void run() {
        try {
            Thread.sleep((long) ((Math.random()*15)*1000));
            System.out.println(this.nombre+" se ha puesto a la fila");
            cafeteria.atender();
            esperar();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    private void esperar() throws InterruptedException {
        Thread.sleep(this.tiempoespera*1000L);
        if(!this.atendido){
            System.out.println(this.nombre+" se ha ido");
            cafeteria.getFila().remove(this);
        }
    }

    public void setAtendido(boolean atendido) {
        this.atendido = atendido;
    }
}
