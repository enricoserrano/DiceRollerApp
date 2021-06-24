package mainGUI;

import java.awt.Graphics;
import java.awt.Image;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class IntroductionImage extends JPanel {

    public Image image;

    public IntroductionImage() throws IOException {
        this.image = ImageIO.read(getClass().getResource("./resources/gameLogo.png"));
    }

    /**
     * Draw the background oof the program
     *
     *
     */
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        ScreenSize ss = new ScreenSize();
        int width = (ss.getScreenWidth() - image.getWidth(null)) / 2;
        float height = (float) ((ss.getScreenHeight() - image.getHeight(null)) / -0.25);
        g.drawImage(this.image, width, (int) height, null);
    }
}
