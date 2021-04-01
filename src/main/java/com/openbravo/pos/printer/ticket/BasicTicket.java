
package com.openbravo.pos.printer.ticket;

import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

/**
 *
 * @author JG uniCenta
 */
public abstract class BasicTicket implements PrintItem {

    /**
     *
     */
    protected java.util.List<PrintItem> m_aCommands;

    /**
     *
     */
    protected PrintItemLine pil;

    /**
     *
     */
    protected int m_iBodyHeight;
   
       /** Creates a new instance of AbstractTicket */
       public BasicTicket() {
// JG 16 May 12 use diamond inference
           m_aCommands = new ArrayList<>();
           pil = null;
           m_iBodyHeight = 0;
       }

    /**
     *
     * @return
     */
    protected abstract Font getBaseFont();

    /**
     *
     * @return
     */
    protected abstract int getFontHeight();

    /**
     *
     * @return
     */
    protected abstract double getImageScale();

    /**
     *
     * @return
     */
    @Override
       public int getHeight() {
          return m_iBodyHeight;
       }

    /**
     *
     * @param g2d
     * @param x
     * @param y
     * @param width
     */
    @Override
       public void draw(Graphics2D g2d, int x, int y, int width) {

           int currenty = y;
           for (PrintItem pi : m_aCommands) {
               pi.draw(g2d, x, currenty, width);
               currenty += pi.getHeight();
           }
       }

    /**
     *
     * @return
     */
    public java.util.List<PrintItem> getCommands() {
          return m_aCommands;
       }

       // INTERFAZ PRINTER 2

    /**
     *
     * @param image
     */
           public void printImage(BufferedImage image) {

           PrintItem pi = new PrintItemImage(image, getImageScale());
           m_aCommands.add(pi);
           m_iBodyHeight += pi.getHeight();
       }

    /**
     *
     * @param type
     * @param position
     * @param code
     */
    public void printBarCode(String type, String position, String code) {

           PrintItem pi = new PrintItemBarcode(type, position, code, getImageScale());
           m_aCommands.add(pi);
           m_iBodyHeight += pi.getHeight();
       }

    /**
     *
     * @param iTextSize
     */
    public void beginLine(int iTextSize) {
           pil = new PrintItemLine(iTextSize, getBaseFont(), getFontHeight());
       }

    /**
     *
     * @param iStyle
     * @param sText
     */
    public void printText(int iStyle, String sText) {
           if (pil != null) {
               pil.addText(iStyle, sText);
           }
       }

    /**
     *
     */
    public void endLine() {
           if (pil != null) {
               m_aCommands.add(pil);
               m_iBodyHeight += pil.getHeight();
               pil = null;
           }
       }
 }