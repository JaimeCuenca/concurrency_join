import java.util.ArrayList;

public class Main {

    public static final ArrayList<String> list = new ArrayList<>();

    public static void main(String[] args) {
        while(true) {
            try {
                Cliente cliente = new Cliente();
                Camarero camarero = new Camarero();
                camarero.start();
                camarero.join();
                cliente.start();
                cliente.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

