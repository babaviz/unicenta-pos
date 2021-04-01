
package com.openbravo.pos.printer;

import java.awt.image.BufferedImage;
import javax.swing.JComponent;

/**
 *
 * @author JG uniCenta
 */
public interface DevicePrinter {
    
// Font Sizes
    public static final int SIZE_0 = 0;
    public static final int SIZE_1 = 1;
    public static final int SIZE_2 = 2;
    public static final int SIZE_3 = 3;
    
// Font Enhancers
    public static final int STYLE_PLAIN = 0;
    public static final int STYLE_BOLD = 1;
    public static final int STYLE_UNDERLINE = 2;
    
// Layout    
    public static final int ALIGN_LEFT = 0;
    public static final int ALIGN_RIGHT = 1;
    public static final int ALIGN_CENTER = 2;
    
    public static final String POSITION_BOTTOM = "bottom";
    public static final String POSITION_NONE = "none";
    
// Barcodes    
    public static final String BARCODE_EAN8 = "EAN8";
    public static final String BARCODE_EAN13 = "EAN13";
    public static final String BARCODE_UPCA = "UPC-A";
    public static final String BARCODE_UPCE = "UPC-E";    
    public static final String BARCODE_CODE128 = "CODE128";
    public static final String BARCODE_CODE39 = "CODE39";

    public String getPrinterName();
    public String getPrinterDescription();
    public JComponent getPrinterComponent();

// Initialise    
    public void reset();
    public void beginReceipt();

// Graphic renders
    public void printImage(BufferedImage image);
    public void printLogo();
    public void printBarCode(String type, String position, String code);

// Do TextLine
    public void beginLine(int iTextSize);
    public void printText(int iStyle, String sText);
    public void endLine();

// Close
    public void endReceipt();   

// Transact    
    public void openDrawer();        
   
}