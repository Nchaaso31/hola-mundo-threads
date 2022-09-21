public class ejercicio1 {
    public static void main(String[] args) {
//        Thread hola = new Thread(new ejercicio1_1(50));
//        Thread adios = new Thread(new ejercicio1_1_2(50));
//        hola.start();
//        adios.start();

        Thread holaThread = new Thread(new ejercicio1_1_3(50, "Hola mundo", 10));
        holaThread.start();
        Thread adiosThread = new Thread(new ejercicio1_1_3(50, "Adios Guapo", 20));
        adiosThread.start();


    }
}
