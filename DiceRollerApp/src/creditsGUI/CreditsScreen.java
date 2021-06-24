/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creditsGUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.MatteBorder;
import mainGUI.DiceRollerApp;
import mainGUI.StartScreen;

/**
 *
 * @author Enrico
 */
public class CreditsScreen extends JPanel {

    public static final String NAME = "Credits";
    private DiceRollerApp mainGui;
    JButton OK = new JButton("OK");
    JPanel buttonDisplay = new JPanel();
    JLabel displayRules = new JLabel("");

    public void customisation() {
        displayRules.setText("<html>Welcome to Dice Roller App<br> This app is created by Enrico Serrano</html>");
        displayRules.setBorder(new MatteBorder(2, 0, 2, 0, Color.black));
        displayRules.setFont(displayRules.getFont().deriveFont(50.0f));
        OK.setBackground(Color.decode("#848383"));
        buttonDisplay.setSize(500, 500);
        OK.setPreferredSize(new Dimension(300, 50));
    }

    public CreditsScreen(final DiceRollerApp mainGui) {
        this.mainGui = mainGui;
        add(new JLabel(NAME));

        customisation();

        setLayout(new GridLayout(3, 1));

        buttonDisplay.add(OK, BorderLayout.SOUTH);
        add(displayRules, BorderLayout.NORTH);
        add(buttonDisplay, BorderLayout.SOUTH);

        OK.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                mainGui.showCard(StartScreen.NAME);
            }
        });
    }

}
