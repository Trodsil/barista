package classes;

public class Barista extends Thread{
    private int tiempopreparacion = (int) (Math.random()*5);

    private Cliente cliente;

    private boolean ocupada = false;

    @Override
    public void run() {

        try {
            Thread.sleep(5000L);
            System.out.println("Se esta preparando el café de "+cliente.getNombre());
            Thread.sleep(tiempopreparacion*1000L);
            System.out.println(cliente.getNombre()+" ha conseguido el café");
            this.ocupada = false;
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    public boolean isOcupada() {
        return ocupada;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
        this.ocupada = true;
    }
}
