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
            Thread.sleep((long) (Math.random()*10)*1000);
            System.out.println(this.nombre+" se ha puesto a la cola");

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    private void esperar() throws InterruptedException {

    }

    public String getNombre() {
        return nombre;
    }

    public void setAtendido(boolean atendido) {
        this.atendido = atendido;//
    }
}
