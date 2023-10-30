import classes.Cafeteria;
import classes.Cliente;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente(30,"Mongo");
        Cliente cliente2 = new Cliente(25,"Fongo");
        Cliente cliente3 = new Cliente(35,"Congo");
        cliente1.start();
        cliente2.start();
        cliente3.start();//

    }
}