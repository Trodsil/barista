package clases;

public class Puente {

    private Cliente[] fila = {};
    private Barista[] trabajadoras = {};

    private int cont = 0;

    public void empezar() throws InterruptedException {
        for (Barista barista : this.trabajadoras){
            if(!barista.getOcupado()){
                barista.setCliente(fila[cont]);
                barista.setOcupada(true);
                barista.prepararCafe();
                cont++;
            }else{
                fila[cont].esperar();
            }
        }
    }

}
