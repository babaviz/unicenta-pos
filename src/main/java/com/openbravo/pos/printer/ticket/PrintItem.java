
package com.openbravo.pos.printer.ticket;

import java.awt.Graphics2D;

/**
 *
 * @author JG uniCenta
 */
public interface PrintItem {
    
    /**
     *
     * @return
     */
    public int getHeight();

    /**
     *
     * @param g
     * @param x
     * @param y
     * @param width
     */
    public void draw(Graphics2D g, int x, int y, int width);
}
