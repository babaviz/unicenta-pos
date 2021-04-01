
package com.openbravo.pos.printer;

import javax.swing.JComponent;

/**
 *
 * @author JG uniCenta
 */
public interface DeviceFiscalPrinter {
 
    /**
     *
     * @return
     */
    public String getFiscalName();

    /**
     *
     * @return
     */
    public JComponent getFiscalComponent();
    
    /**
     *
     */
    public void beginReceipt();

    /**
     *
     */
    public void endReceipt();

    /**
     *
     * @param sproduct
     * @param dprice
     * @param dunits
     * @param taxinfo
     */
    public void printLine(String sproduct, double dprice, double dunits, int taxinfo);

    /**
     *
     * @param smessage
     */
    public void printMessage(String smessage);

    /**
     *
     * @param sPayment
     * @param dpaid
     */
    public void printTotal(String sPayment, double dpaid);
    
    /**
     *
     */
    public void printZReport();

    /**
     *
     */
    public void printXReport();
}
