import classes.Cliente;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Mongo",30);
        Cliente cliente2 = new Cliente("Fongo",25);
        Cliente cliente3 = new Cliente("Congo",35);
        cliente1.start();
        cliente2.start();
        cliente3.start();

    }
}