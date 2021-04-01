
package com.openbravo.pos.printer.ticket;

import java.awt.Font;
import java.awt.geom.AffineTransform;

/**
 *
 * @author jaroslawwozniak
 * @author adrianromero

 */
public class BasicTicketForPrinter extends BasicTicket {

//    private static final Font BASEFONT = new Font("Monospaced", 
    private static final Font BASEFONT = new Font("Courier New",     
        Font.PLAIN, 7).deriveFont(AffineTransform.getScaleInstance(1.0, 1.50));
    private static final int FONTHEIGHT = 12;

//        private static Font BASEFONT = new Font("Monospaced", 
    //         Font.PLAIN, 7).deriveFont(AffineTransform.getScaleInstance(1.0, 1.40));

// JG Feb' 16 - Revert
// Consolas intro'd in v4.1 but causes issue in RightToLeft languages i.e.: Arabic
//    private static Font BASEFONT = new Font("Consolas", Font.PLAIN,8).deriveFont(AffineTransform.getScaleInstance(1.0, 1.40)); 
//        private static int FONTHEIGHT = 12;

    private static final double IMAGE_SCALE = 0.65;

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
    @Override    protected double getImageScale() {
        return IMAGE_SCALE;
      }
  }