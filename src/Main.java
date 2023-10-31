import classes.Cafeteria;
import classes.Cliente;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Cafeteria cafeteria = new Cafeteria();
        Cliente cliente1 = new Cliente("Mongo",30,cafeteria);
        Cliente cliente2 = new Cliente("Fongo",25,cafeteria);
        Cliente cliente3 = new Cliente("Congo",35,cafeteria);
        cliente1.start();
        cliente2.start();
        cliente3.start();

    }
}