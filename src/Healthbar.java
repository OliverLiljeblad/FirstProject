/*
 * This class Defines how the healthbar looks
 * It does this by drawing a rectangel adn adding it to a JPanel
 *
 * @author LivNTI
 */

import javax.swing.*;
import java.awt.*;

public class Healthbar extends JPanel {
    private Friend friend;
    private Enemy enemy;

    public Healthbar(Friend friend) {
        this.friend = friend;
    }

    /*
    This method paints the components on a canvas
     */
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        addHealthbar(g);
    }

    /*
    this method paint ONE green rectangle
     */
    protected void addHealthbar(Graphics g) {
        g.setColor(Color.GREEN);
        g.fillRect(20, 50, friend.getHp() * 3, 100);
        g.fillRect(20, 200, friend.getHp() * 3, 100);
    }
}
