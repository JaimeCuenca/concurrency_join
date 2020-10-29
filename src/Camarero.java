public class Camarero extends Thread {

    Principal ppal;
    Cliente cliente;

    public Camarero(Principal ppal){
        this.ppal=ppal;
    }

    @Override
    public void run() {
        try {
            while (true) {
                prepararComanda();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    private void prepararComanda() throws InterruptedException {
        System.out.println("Camarero - Si he llegado aqui es porque el cliente ha pedido comida. Debo llevarla");
        ppal.list.add("Zumo");
        sleep(1000);
        ppal.list.add("Tostada");
        sleep(1000);
        ppal.list.add("Mermelada");
        sleep(1000);
        System.out.println("Camarero - El pedido ya esta listo. Tardo 5 segundos en llevarle la comida al cliente");
        sleep(5000);
        cliente.run();
    }
}

