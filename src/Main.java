public class Main {
    public static void main(String[] args) {

//        Aquí llamaremos a la otra clase para que se ejecute
        Thread helloworldThread = new Thread(new HellowWorldTask());
        helloworldThread.start();



//        Esto hará que el goodbye tarde dos segundos en aparecer
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }



        System.out.println("GoodBye");
    }
}