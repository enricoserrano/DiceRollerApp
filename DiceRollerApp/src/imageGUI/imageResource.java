/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imageGUI;

import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author Enrico
 */
public class imageResource {

    private static ImageIcon defaultIcon = new ImageIcon(new ImageIcon("./resources/gameZero.png").getImage().getScaledInstance(300, 300, Image.SCALE_DEFAULT));
    private static ImageIcon oneIcon = new ImageIcon(new ImageIcon("./resources/gameOne.png").getImage().getScaledInstance(300, 300, Image.SCALE_DEFAULT));
    private static ImageIcon twoIcon = new ImageIcon(new ImageIcon("./resources/gameTwo.png").getImage().getScaledInstance(300, 300, Image.SCALE_DEFAULT));
    private static ImageIcon threeIcon = new ImageIcon(new ImageIcon("./resources/gameThree.png").getImage().getScaledInstance(300, 300, Image.SCALE_DEFAULT));
    private static ImageIcon fourIcon = new ImageIcon(new ImageIcon("./resources/gameFour.png").getImage().getScaledInstance(300, 300, Image.SCALE_DEFAULT));
    private static ImageIcon fiveIcon = new ImageIcon(new ImageIcon("./resources/gameFive.png").getImage().getScaledInstance(300, 300, Image.SCALE_DEFAULT));
    private static ImageIcon sixIcon = new ImageIcon(new ImageIcon("./resources/gameSix.png").getImage().getScaledInstance(300, 300, Image.SCALE_DEFAULT));

    public static ImageIcon getDefaultIcon() {
        return defaultIcon;
    }

    public static void setDefaultIcon(ImageIcon defaultIcon) {
        imageResource.defaultIcon = defaultIcon;
    }

    public static ImageIcon getOneIcon() {
        return oneIcon;
    }

    public static void setOneIcon(ImageIcon oneIcon) {
        imageResource.oneIcon = oneIcon;
    }

    public static ImageIcon getTwoIcon() {
        return twoIcon;
    }

    public static void setTwoIcon(ImageIcon twoIcon) {
        imageResource.twoIcon = twoIcon;
    }

    public static ImageIcon getThreeIcon() {
        return threeIcon;
    }

    public static void setThreeIcon(ImageIcon threeIcon) {
        imageResource.threeIcon = threeIcon;
    }

    public static ImageIcon getFourIcon() {
        return fourIcon;
    }

    public static void setFourIcon(ImageIcon fourIcon) {
        imageResource.fourIcon = fourIcon;
    }

    public static ImageIcon getFiveIcon() {
        return fiveIcon;
    }

    public static void setFiveIcon(ImageIcon fiveIcon) {
        imageResource.fiveIcon = fiveIcon;
    }

    public static ImageIcon getSixIcon() {
        return sixIcon;
    }

    public static void setSixIcon(ImageIcon sixIcon) {
        imageResource.sixIcon = sixIcon;
    }

}
