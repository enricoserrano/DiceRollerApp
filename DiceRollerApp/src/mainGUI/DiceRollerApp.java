package mainGUI;

import creditsGUI.CreditsScreen;
import java.awt.CardLayout;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import oneGUI.OneScreen;
import twoGUI.TwoScreen;

public class DiceRollerApp extends JPanel {

    private CardLayout cardLayout = new CardLayout();
    private StartScreen startSc = new StartScreen(this);
    private CreditsScreen creditsSc = new CreditsScreen(this);
    private OneScreen oneSc = new OneScreen(this);
    private TwoScreen twoSc = new TwoScreen(this);

    public DiceRollerApp() {
        setLayout(cardLayout);
        add(startSc, StartScreen.NAME);
        add(creditsSc, CreditsScreen.NAME);
        add(oneSc, OneScreen.NAME);
        add(twoSc, TwoScreen.NAME);
        // EmptyBorder(int top, int left, int bottom,int right)
        setBorder(new EmptyBorder(10, 100, 10, 100));//card layout size
    }

    public void showCard(String Name) {
        cardLayout.show(this, Name);
    }

    private static void createAndShowGui() {
        ScreenSize ss = new ScreenSize();
        DiceRollerApp mainPanel = new DiceRollerApp();
        JFrame frame = new JFrame("Dice Roller App");

        frame.setSize(ss.getScreenWidth(), ss.getScreenHeight());

        frame.setLocation(100, 100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(mainPanel);
        frame.pack();
        frame.setLocationByPlatform(true);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setVisible(true);
    }

    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGui();

            }
        });
    }

}
