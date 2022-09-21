public class HellowWorldTask implements Runnable {


    @Override
//  Vamos a definir varias secuencoas concurentes
    public void run() {

        System.out.println("Hola mundo");
        System.out.println("Hola mundo");
    }
}
