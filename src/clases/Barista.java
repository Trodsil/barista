package clases;

public class Barista extends Thread{
    private Cliente cliente;
    private boolean ocupada = false;

    public Barista (Cliente cliente){
        this.cliente = cliente;
    }
    @Override
    public void run() {
        try {
            prepararCafe();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void prepararCafe() throws InterruptedException {
        Thread.sleep((long) ((Math.random()*10)* 1000));
        System.out.println("Cafe de "+this.cliente.getNombre()+" hecho");

    }
    public boolean getOcupado(){
        return this.ocupada;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setOcupada(boolean ocupada) {
        this.ocupada = ocupada;
    }
}
