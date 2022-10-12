import javax.swing.*;
import java.awt.*;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Game {
    //instansvariabler
    Friend myFriend;
    Healthbar healthbar;


    public void start() {
        Scanner myScanner = new Scanner(System.in);
        myFriend = new Friend("Aleks");
        drawWindow();
        gethit();
    }

     /*
    This method draws a frame on which a canvas (panel) is attached. The panel is then used to draw figurres on.
    In this case the figure is a rectangle
*/

    public void drawWindow() {
        JFrame frame = new JFrame("Healthbar"); //create the window
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Set action on closing window
        healthbar = new Healthbar(myFriend); //Create the canvas
        healthbar.setPreferredSize(new Dimension(600, 300)); // sets the size of the canvas
        frame.getContentPane().add(healthbar); // add the canvas to the frame
        frame.pack(); // Package everything
        frame.setVisible(true); //make everything visible
    }

    public void gethit() {
        Scanner myScanner = new Scanner(System.in);
        String ans = "";
        while (myFriend.getHp() > 0) {
            System.out.println("fight?");
            ans = myScanner.next();
            if (ans.equals("y")) {
                myFriend.hit(10);
                healthbar.repaint();
            }

        }

    }
}
