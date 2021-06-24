/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package twoGUI;

import diceVAR.DiceVariable;
import imageGUI.imageResource;
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
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Enrico
 */
public class TwoScreen extends JPanel {

    public static final String NAME = "Roll 2 Die";
    private DiceRollerApp mainGui;
    JButton ok = new JButton("OK");
    JButton roll = new JButton("Roll");
    JPanel buttonDisplay = new JPanel();
    JLabel firstDie = new JLabel();
    JLabel secondDie = new JLabel();
    JPanel displayDice = new JPanel();
    int diceNumber = 0;
    int seconDiceNumber = 0;

    public void reStart() {
        firstDie.setIcon(imageResource.getDefaultIcon());
        secondDie.setIcon(imageResource.getDefaultIcon());
    }

    public void playSound() throws MalformedURLException {
        URL soundbyte = new File("./resources/gameSound.wav").toURI().toURL();
        java.applet.AudioClip clip = java.applet.Applet.newAudioClip(soundbyte);
        clip.play();
    }

    public void customisation() {
        firstDie.setFont(firstDie.getFont().deriveFont(50.0f));
        secondDie.setFont(secondDie.getFont().deriveFont(50.0f));
        firstDie.setIcon(imageResource.getDefaultIcon());
        secondDie.setIcon(imageResource.getDefaultIcon());
        displayDice.setBorder(new MatteBorder(2, 0, 2, 0, Color.black));
        roll.setBackground(Color.decode("#848383"));
        roll.setPreferredSize(new Dimension(300, 50));
        ok.setBackground(Color.decode("#848383"));
        ok.setPreferredSize(new Dimension(300, 50));
        buttonDisplay.setSize(500, 500);

    }

    public void rollAgain() {
        diceNumber = DiceVariable.getRandomNumber();
        seconDiceNumber = DiceVariable.getRandomNumber();
        switch (diceNumber) {
            case 1:
                firstDie.setIcon(imageResource.getOneIcon());
                break;
            case 2:
                firstDie.setIcon(imageResource.getTwoIcon());
                break;
            case 3:
                firstDie.setIcon(imageResource.getThreeIcon());
                break;
            case 4:
                firstDie.setIcon(imageResource.getFourIcon());
                break;
            case 5:
                firstDie.setIcon(imageResource.getFiveIcon());
                break;
            case 6:
                firstDie.setIcon(imageResource.getSixIcon());
                break;
        }
        switch (seconDiceNumber) {
            case 1:
                secondDie.setIcon(imageResource.getOneIcon());
                break;
            case 2:
                secondDie.setIcon(imageResource.getTwoIcon());
                break;
            case 3:
                secondDie.setIcon(imageResource.getThreeIcon());
                break;
            case 4:
                secondDie.setIcon(imageResource.getFourIcon());
                break;
            case 5:
                secondDie.setIcon(imageResource.getFiveIcon());
                break;
            case 6:
                secondDie.setIcon(imageResource.getSixIcon());
                break;
        }
        firstDie.repaint();
        firstDie.validate();
        secondDie.repaint();
        secondDie.validate();
    }

    public TwoScreen(final DiceRollerApp mainGui) {
        this.mainGui = mainGui;
        add(new JLabel(NAME));

        customisation();

        setLayout(new GridLayout(3, 1));

        buttonDisplay.add(roll, BorderLayout.SOUTH);
        buttonDisplay.add(ok, BorderLayout.SOUTH);
        displayDice.add(firstDie, BorderLayout.CENTER);
        displayDice.add(secondDie, BorderLayout.CENTER);

        add(displayDice, BorderLayout.SOUTH);
        add(buttonDisplay, BorderLayout.SOUTH);

        roll.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                rollAgain();
                try {
                    playSound();
                } catch (MalformedURLException ex) {
                    Logger.getLogger(TwoScreen.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        ok.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                mainGui.showCard(StartScreen.NAME);
                reStart();
            }
        });
    }
}
