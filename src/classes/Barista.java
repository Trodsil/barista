package classes;

public class Barista extends Thread{

    private boolean disponible = true;
    private Cafeteria cafeteria;
    private Cliente cliente;
    public Barista(Cafeteria cafeteria) {
        this.cafeteria = cafeteria;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        cliente.setAtendido(true);
        System.out.println(cliente.getName()+" ha sido servido");
        this.disponible = true;
        cafeteria.equipoDisponible();
    }

    public void prepararCafe(Cliente cliente) throws InterruptedException {
        Thread.sleep(5000);
        System.out.println("Café servido a "+cliente.getNombre());
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
}
