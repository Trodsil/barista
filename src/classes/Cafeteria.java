package classes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Cafeteria{

    public static List<Cliente> fila = new ArrayList<>();

    private static List<Barista> baristas = Arrays.asList(new Barista(),new Barista(), new Barista());

    public static void atender() {
        for (Barista barista : baristas) {
            if (!barista.isOcupada() && !fila.isEmpty()) {
                Cliente cliente = fila.get(0);
                fila.remove(0);
                cliente.setEstado("atendido");
                barista.setCliente(cliente);
                barista.start();
            }
        }
    }


}
