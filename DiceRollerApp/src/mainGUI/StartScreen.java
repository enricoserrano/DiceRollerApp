package mainGUI;

import creditsGUI.CreditsScreen;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import oneGUI.OneScreen;
import twoGUI.TwoScreen;

public class StartScreen extends JPanel {

    public static final String NAME = "Start";
    private DiceRollerApp mainGui;
    JButton introduction = new JButton("Credits");
    JButton oneDice = new JButton("Roll 1 Die");
    JButton twoDice = new JButton("Roll 2 Dice");
    JButton exitGame = new JButton("Exit App");
    JLabel logo = new JLabel(new ImageIcon("./resources/gameLogo.png"));
    JPanel image = new JPanel(new GridLayout(0, 1, 0, 100));
    JPanel buttonDisplay = new JPanel(new GridLayout(0, 1, 0, 10));
    JPanel empty = new JPanel(new GridLayout(0, 1, 0, 10));

    public void customisation() {
        buttonDisplay.setSize(500, 500);
        logo.setPreferredSize(new Dimension(600, 600));
        oneDice.setPreferredSize(new Dimension(200, 50));
        introduction.setPreferredSize(new Dimension(200, 50));
        twoDice.setPreferredSize(new Dimension(300, 50));
        exitGame.setPreferredSize(new Dimension(300, 50));
        introduction.setBackground(Color.decode("#848383"));
        oneDice.setBackground(Color.decode("#848383"));
        twoDice.setBackground(Color.decode("#848383"));
        exitGame.setBackground(Color.decode("#848383"));
        empty.setPreferredSize(new Dimension(5, 5));
        empty.setMinimumSize(new Dimension(5, 5));
        empty.setMaximumSize(new Dimension(5, 5));
    }

    public StartScreen(final DiceRollerApp mainGui) {
        this.mainGui = mainGui;

        customisation();

        image.add(logo, BorderLayout.NORTH);
        buttonDisplay.add(oneDice, BorderLayout.CENTER);
        buttonDisplay.add(twoDice, BorderLayout.CENTER);
        buttonDisplay.add(introduction, BorderLayout.CENTER);
        buttonDisplay.add(exitGame, BorderLayout.CENTER);

        add(empty, BorderLayout.CENTER);
        add(image, BorderLayout.NORTH);
        add(buttonDisplay, BorderLayout.CENTER);

        introduction.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                mainGui.showCard(CreditsScreen.NAME);
            }
        });

        oneDice.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                mainGui.showCard(OneScreen.NAME);
            }
        });

        twoDice.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                mainGui.showCard(TwoScreen.NAME);
            }
        });
        exitGame.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                int confirmation = JOptionPane.showConfirmDialog(null, "Do you wish to exit the app?", "Confirm", JOptionPane.YES_NO_OPTION);

                if (confirmation == JOptionPane.YES_OPTION) {
                    System.exit(0);
                } else {

                }
            }
        });
    }

}
