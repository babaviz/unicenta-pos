
package com.openbravo.pos.printer.ticket;

import java.awt.Font;
import java.awt.geom.AffineTransform;

/**
 *
 * @author JG uniCenta
 */
public class BasicTicketForScreen extends BasicTicket {

//    private static Font BASEFONT = new Font("Monospaced", 
    private static Font BASEFONT = new Font("Courier New",     
            Font.PLAIN, 12).deriveFont(AffineTransform.getScaleInstance(1.0, 1.40));
// JG Feb' 16 - Revert
// Consolas intro'd in v4.1 but causes issue in RightToLeft languages i.e.: Arabic
//    private static Font BASEFONT = new Font("Consolas", Font.PLAIN, 12).deriveFont(AffineTransform.getScaleInstance(1.0, 1.40));    

    private static int FONTHEIGHT = 20;
    private static double IMAGE_SCALE = 1.0;

    /**
     *
     * @return
     */
    @Override
    protected Font getBaseFont() {
        return BASEFONT;
    }

    /**
     *
     * @return
     */
    @Override
    protected int getFontHeight() {
        return FONTHEIGHT;
    }

    /**
     *
     * @return
     */
    @Override
    protected double getImageScale() {
        return IMAGE_SCALE;
    }
}