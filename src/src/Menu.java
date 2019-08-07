package src;

import java.awt.*;

public class Menu {
    public void drawImage(Graphics grph) {
        Font f = new Font("serif", Font.BOLD, 50);
        grph.setColor(Color.black);
        grph.setFont(f);
        grph.drawString("START", 395, 470);
        grph.drawString("CREDITS", 368, 560);
        grph.drawString("CONTROLS", 660, 560);
        grph.drawString("EXIT", 420, 650);
        grph.setColor(Color.black);
        grph.drawRoundRect(360, 416, 230, 70, 20, 20);
        grph.drawRoundRect(360, 416 + 90, 230, 70, 20, 20);
        grph.drawRoundRect(650, 416 + 90, 300, 70, 20, 20);
        grph.drawRoundRect(360, 416 + 90 + 90, 230, 70, 20, 20);
    }
}
