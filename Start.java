public class Start {

    public static void main(String args[]) {
//        new GUI();
        Thread thread2 = new Thread(new GUI());
        thread2.start();
    }
}
