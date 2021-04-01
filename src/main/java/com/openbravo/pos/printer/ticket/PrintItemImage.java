

package com.openbravo.pos.printer.ticket;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

/**
 *
 * @author JG uniCenta
 */
public class PrintItemImage implements PrintItem {

    /**
     *
     */
    protected BufferedImage image;

    /**
     *
     */
    protected double scale;

    /** Creates a new instance of PrintItemImage
     * @param image
     * @param scale
     */
    public PrintItemImage(BufferedImage image, double scale) {
        this.image = image;
        this.scale = scale;
    }

    /**
     *
     * @param g
     * @param x
     * @param y
     * @param width
     */
    @Override
    public void draw(Graphics2D g, int x, int y, int width) {
        g.drawImage(image, x + (width - (int)(image.getWidth() * scale)) / 2, y, 
                (int)(image.getWidth() * scale), 
                (int)(image.getHeight() * scale)
                , null);
    }

    /**
     *
     * @return
     */
    @Override
    public int getHeight() {
        return (int) (image.getHeight() * scale);
    }
}
