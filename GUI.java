import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class GUI implements Runnable {


    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }

    public GUI() {
        TicTacToe tictactoe = new TicTacToe();
        NewGame newgame = new NewGame();

        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        panel.setLayout(new java.awt.GridLayout(4, 3));

        for (int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++) {
                final JButton button = new JButton();
                String string = i +  "" + j;
                button.setText("");
                button.setName(string);
                button.addActionListener(
                        new ActionListener() {
                            public void actionPerformed(ActionEvent e) {
                                tictactoe.buttonClicked(button);
                                tictactoe.playGame(button);
                                System.out.println(Thread.currentThread().getName());
                            }
                        });
                button.setBorder(BorderFactory.createLineBorder(Color.BLACK));
                panel.add(button);
            }

        }
        String string = 3 +  "" + 0;
        final JButton button = new JButton();
        button.setText("New game");
        button.setName(string);
        button.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        newgame.new_game();
                        System.out.println("abc" + Thread.currentThread().getName());
                    }
                });
        button.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        panel.add(button);

        frame.add(panel);
        frame.setSize(500,500);
        frame.setVisible(true);
    }

}