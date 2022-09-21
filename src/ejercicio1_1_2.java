public class ejercicio1_1_2 implements Runnable {

    private int bye;

    public ejercicio1_1_2(int times) {
        this.bye = bye;
    }

    @Override
    public void run() {
        for (int i = 0; i < bye; i++) {
            System.out.println("Goodbye");
            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
