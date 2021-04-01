
package com.openbravo.pos.printer;

import javax.swing.JComponent;

/**
 *
 * @author JG uniCenta
 */
public class DeviceFiscalPrinterNull implements DeviceFiscalPrinter {
    
    /** Creates a new instance of DeviceFiscalPrinterNull */
    public DeviceFiscalPrinterNull() {
    }

    /**
     *
     * @param desc
     */
    public DeviceFiscalPrinterNull(String desc) {
    }
 
    /**
     *
     * @return
     */
    @Override
    public String getFiscalName() {
        return null;
    }

    /**
     *
     * @return
     */
    @Override
    public JComponent getFiscalComponent() {
        return null;
    }
    
    /**
     *
     */
    @Override
    public void beginReceipt() {
    }

    /**
     *
     */
    @Override
    public void endReceipt() {
    }

    /**
     *
     * @param sproduct
     * @param dprice
     * @param dunits
     * @param taxinfo
     */
    @Override
    public void printLine(String sproduct, double dprice, double dunits, int taxinfo) {
    }

    /**
     *
     * @param smessage
     */
    @Override
    public void printMessage(String smessage) {
    }

    /**
     *
     * @param sPayment
     * @param dpaid
     */
    @Override
    public void printTotal(String sPayment, double dpaid) {
    }
    
    /**
     *
     */
    @Override
    public void printZReport() {
    }

    /**
     *
     */
    @Override
    public void printXReport() {
    }
}
