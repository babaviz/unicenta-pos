
package com.openbravo.pos.printer.escpos;

import com.openbravo.pos.forms.AppLocal;
import com.openbravo.pos.printer.DeviceDisplay;
import com.openbravo.pos.printer.DeviceDisplayBase;
import com.openbravo.pos.printer.DeviceDisplayImpl;
/**
 *
 * @author adrianromero
 */
public abstract class DeviceDisplaySerial implements DeviceDisplay, DeviceDisplayImpl {
    
    private String m_sName;    

    /**
     *
     */
    protected PrinterWritter display;

    /**
     *
     */
    protected DeviceDisplayBase m_displaylines;
    
    /**
     *
     */
    public DeviceDisplaySerial() {
        m_displaylines = new DeviceDisplayBase(this);
    }
    
    /**
     *
     * @param display
     */
    protected void init(PrinterWritter display) {                
        m_sName = AppLocal.getIntString("printer.serial");
        this.display = display;      
        initVisor();        
    }
   
    /**
     *
     * @return
     */
    @Override
    public String getDisplayName() {
        return m_sName;
    }    

    /**
     *
     * @return
     */
    @Override
    public String getDisplayDescription() {
        return null;
    }        

    /**
     *
     * @return
     */
    @Override
    public javax.swing.JComponent getDisplayComponent() {
        return null;
    }
    
    /**
     *
     * @param animation
     * @param sLine1
     * @param sLine2
     */
    @Override
    public void writeVisor(int animation, String sLine1, String sLine2) {
        m_displaylines.writeVisor(animation, sLine1, sLine2);
    }

    /**
     *
     * @param sLine1
     * @param sLine2
     */
    @Override
    public void writeVisor(String sLine1, String sLine2) {        
        m_displaylines.writeVisor(sLine1, sLine2);
    }
     
    /**
     *
     */
    @Override
    public void clearVisor() {
        m_displaylines.clearVisor();
    }
    
    /**
     *
     */
    public abstract void initVisor();
}
