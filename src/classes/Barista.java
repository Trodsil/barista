package classes;

public class Barista extends Thread{
    private int tiempopreparacion = (int) (Math.random()*5);

    private Cliente cliente;

    private volatile boolean ocupada = false;

    @Override
    public void run() {
        String nombre = cliente.getNombre();
        try {
            Thread.sleep(5000L);
            System.out.println("Se esta preparando el café de "+nombre);
            Thread.sleep(tiempopreparacion*1000L);
            System.out.println(nombre+" ha conseguido el café");
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
