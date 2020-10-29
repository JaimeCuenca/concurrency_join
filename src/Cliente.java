public class Cliente extends Thread {

    Principal ppal;
    Camarero camarero;

    public Cliente(Principal ppal, Camarero camarero){
        this.ppal=ppal;
        this.camarero=camarero;
    }

    @Override
    public void run() {
        try {
            while (true) {
                if (ppal.list.isEmpty()){
                    System.out.println("Cliente - Voy a esperar a que me traigan comida...");
                    sleep(2000);
                    camarero.run();
                } else {
                    System.out.println("Cliente - Voy a consumir un " + ppal.list.get(0) + " 3 segundos");
                    ppal.list.remove(0);
                    sleep(3000);
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
