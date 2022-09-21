public class ejercicio1_1 implements Runnable {
    private int hola;

    public ejercicio1_1(int hola) {
        this.hola = hola;
    }

    @Override
    public void run() {
        for (int i = 0; i < hola; i++) {

            System.out.println("Hola Mundo");
        }
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
