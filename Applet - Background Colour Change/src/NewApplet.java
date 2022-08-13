

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class NewApplet extends Applet {

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    public void init() {
        setBackground(Color.YELLOW);
        // TODO start asynchronous download of heavy resources
    }
    
    public void paint(Graphics g){
        g.drawString("Applet Background example: ", 0, 50);
    }

    // TODO overwrite start(), stop() and destroy() methods
}
