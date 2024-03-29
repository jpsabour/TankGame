package src;

import java.awt.*;
import java.awt.image.BufferedImage;

public class BreakableWall extends Wall {
    private int health = 100;
    private static BufferedImage breakable_wall_img; //32x32
    private boolean dead = false;

    BreakableWall(int x, int y) {
        this.x = x;
        this.y = y;
        this.my_rectangle = new Rectangle(x, y, breakable_wall_img.getWidth(), breakable_wall_img.getHeight());
    }

     private void removeHealth(int val) { //private access because only the BreakableWall should be able to removeHealth(in its collision method)
        if (health - val < 0) {
            health = 0; //BreakableWall died
            dead = true;
        } else {
            health -= val;
        }
    }

    int getHealth() {
        return this.health;
    }

    boolean isDead() {
        return dead;
    }

    void setDead(boolean dead) {
        this.dead = dead;
    }

    static void set_breakable_wall_img(BufferedImage image) {
        BreakableWall.breakable_wall_img = image;
    }

    public void update() {

    }

    public void collision() {
        this.removeHealth(100);

    }

    public void drawImage(Graphics2D g2d) {

        if (!dead) {
            g2d.drawImage(breakable_wall_img, x, y, null);
        }

    }


}
