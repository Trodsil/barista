package classes;

public class Barista extends Thread{

    private boolean disponible = true;
    private Cafeteria cafeteria;
    public Barista(Cafeteria cafeteria) {
        this.cafeteria = cafeteria;
    }

    @Override
    public void run() {
        while (disponible){
            try {
                cafeteria.consume(this);

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }

    public synchronized void prepararCafe(Cliente cliente) throws InterruptedException {
        this.disponible = false;
        if(cliente.isAtendido()){
            cliente.setAtendido(false);
            Thread.sleep(15000);
            System.out.println("Café servido a "+cliente.getNombre());
        }
        this.disponible = true;
    }

}
