public class ejercicio1_1_3 implements Runnable {
    private int times;
    private String text;
    private int time;

    public ejercicio1_1_3(int times, String text, int time) {
        this.times = times;
        this.text = text;
        this.time = time;
    }

    @Override
    public void run() {
        for (int i = 0; i < times; i++) {

            System.out.println(text);
        }
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
