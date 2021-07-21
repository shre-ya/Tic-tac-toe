import javax.swing.*;

public class NewGame{

    public static void new_game(){

        Thread thread1 = new Thread(new GUI());
        thread1.start();

    }

}
