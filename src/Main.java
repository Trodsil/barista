import clases.Barista;
import clases.Cliente;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Cliente cliente1 = new Cliente("Mongo",50);
        Cliente cliente2 = new Cliente("Fongo",20);
        Cliente cliente3 = new Cliente("Congo",10);
        Cliente cliente4 = new Cliente("Tongo",50);
        Cliente cliente5 = new Cliente("Jongo",20);
        Cliente cliente6 = new Cliente("Longo",10);
        cliente1.start();
        cliente2.start();
        cliente3.start();
        cliente4.start();
        cliente5.start();
        cliente6.start();

/*
        Barista barista1 = new Barista(cliente1);
        barista1.start();
        Barista barista2 = new Barista(cliente2);
        barista2.start();
        Barista barista3 = new Barista(cliente3);
        barista3.start();
*/

    }
}