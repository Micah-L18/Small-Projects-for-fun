package NumberGuessingGame;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Masterframe {

    static int random_int;

    public static void main(String[]args){

        JFrame frame = new JFrame();
            frame.setVisible(true);
            frame.setSize(225,250);
            frame.setResizable(false);
            frame.setTitle("Number Guessing Game!!!");
            frame.setLayout(null);

        JPanel StartPanel = new JPanel();
            StartPanel.setVisible(true);
            StartPanel.setBounds(0,0,500,500);
            StartPanel.setLayout(null);
            frame.add(StartPanel);

        JPanel GamePanel = new JPanel();
            GamePanel.setVisible(false);
            GamePanel.setBounds(0,0,500,500);
            GamePanel.setLayout(null);
            frame.add(GamePanel);

        JButton play = new JButton();
            play.setVisible(true);
            play.setBounds(44,100,120,50);
            play.setText("Play");
            StartPanel.add(play);
                play.addActionListener(new ActionListener(){
                    public void actionPerformed(ActionEvent e){

                        StartPanel.setVisible(false);
                        GamePanel.setVisible(true);
                        random_int = (int)Math.floor(Math.random()*(999-1+1)+1);

                    }

                });

        JLabel test = new JLabel();
            test.setVisible(true);
            test.setBounds(50,10,150,50);
            test.setText("Lets Try and Guess");
            GamePanel.add(test);

        JTextArea guess = new JTextArea();
            guess.setVisible(true);
            guess.setBounds(50,50,100,30);
            GamePanel.add(guess);

        JButton newgame = new JButton();
            newgame.setVisible(true);
            newgame.setText("play");
            newgame.setBounds(45,100,120,50);
            GamePanel.add(newgame);
        newgame.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){

                    random_int = (int)Math.floor(Math.random()*(999-1+1)+1);

                }

        });

        JButton check = new JButton();
            check.setVisible(true);
            check.setText("Check");
            check.setBounds(45,150,120,50);
            GamePanel.add(check);
            check.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){

                    int randomNum = random_int;
                    String Playerguess = guess.getText();

                    GuessCheck checkGuess = new GuessCheck();
                    checkGuess.checkNum(randomNum,Playerguess);

                }

            });

    }

}