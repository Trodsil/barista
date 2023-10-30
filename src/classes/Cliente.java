package classes;

public class Cliente extends Thread{
    private int tiempoespera;
    private String nombre;
    private int tiempollegada = (int) (Math.random()*20);
    private String estado;
    public Cliente(int tiempoespera, String nombre){
        this.tiempoespera = tiempoespera;
        this.nombre = nombre;
        this.estado = "llegando";
    }
    @Override
    public void run() {
        if (this.estado.equals("llegando")) {
            try {
                Thread.sleep(tiempollegada * 1000L);
                System.out.println(this.nombre + " se ha puesto ha la fila");
                Cafeteria.fila.add(this);
                Cafeteria.atender();
                this.esperar();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void esperar() throws InterruptedException {
        Thread.sleep(tiempoespera*1000L);
        if(!this.estado.equals("atendido")){
            System.out.println(nombre+" se ha ido");
            Cafeteria.fila.remove(this);
        }
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getNombre(){
        return this.nombre;
    }
}

