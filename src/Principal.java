import java.util.ArrayList;

public class Principal {

    public static final ArrayList<String> list = new ArrayList<>();

    public void principal() {

        Camarero camarero = new Camarero(this);
        Cliente cliente = new Cliente(this, camarero);
        camarero.cliente=cliente;

        camarero.start();
    }
}
