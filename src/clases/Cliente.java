package clases;

public class Cliente extends Thread{
    private String nombre;
    private int tiempoEspera;

    private boolean estado;

    private double tiempoLlegada;

    public Cliente (String nombre,int tiempoEspera){
        this.nombre = nombre;
        this.tiempoEspera = tiempoEspera;
        this.estado = false;
        this.tiempoLlegada = Math.random()*10000;
    }

    @Override
    public void run() {
        try {
            Thread.sleep((long) this.tiempoLlegada);
            System.out.println(this.nombre+" ha pedido un cafe");
            esperar();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void esperar() throws InterruptedException {
        Thread.sleep(this.tiempoEspera);
    }


    public String getNombre() {
        return nombre;
    }
}
