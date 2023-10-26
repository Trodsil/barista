package classes;

public class Cliente extends Thread{
    private String nombre ;
    private final int tiempollegada = (int) (Math.random()*20);
    private int tiempoespera ;

    private boolean atendido = false;


    public Cliente(String nombre,int tiempoespera){
        this.nombre = nombre;
        this.tiempoespera = tiempoespera;
    }
    @Override
    public void run() {
        try {
            Thread.sleep(this.tiempollegada * 1000L);
            System.out.println(this.nombre+" se ha puesto en la fila");
            Cafeteria.fila.add(this);
            esperar();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void esperar() throws InterruptedException {
        Thread.sleep(this.tiempoespera * 1000L);
        if(!this.atendido){
            System.out.println(this.nombre+" se ha ido");
            Cafeteria.fila.remove(this);
        }

    }

    public void setAtendido(boolean atendido) {
        this.atendido = atendido;
    }
}
