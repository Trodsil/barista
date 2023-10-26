package classes;

public class Barista extends Thread{
    private final int tiempopreparacion = 10;

    private Cliente cliente;


    @Override
    public void run() {
        try {
            this.cliente.setAtendido(true);
            Thread.sleep(this.tiempopreparacion*1000);
            System.out.println("Cafe de "+this.cliente.getName());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void setCliente(Cliente cliente){
        this.cliente = cliente;
    }
}
