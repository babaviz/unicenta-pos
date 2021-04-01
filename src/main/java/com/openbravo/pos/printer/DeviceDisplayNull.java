
package com.openbravo.pos.printer;

import com.openbravo.pos.forms.AppLocal;

/**
 *
 * @author JG uniCenta
 */
public class DeviceDisplayNull implements DeviceDisplay {
    
    private String m_sName;
    private String m_sDescription;
    
    /** Creates a new instance of DeviceDisplayNull */
    public DeviceDisplayNull() {
        this(null);
    }
    
    /** Creates a new instance of DeviceDisplayNull
     * @param desc */
    public DeviceDisplayNull(String desc) {
        m_sName = AppLocal.getIntString("display.null");
        m_sDescription = desc;
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
        return m_sDescription;
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
     */
    @Override
    public void clearVisor() {
    }      

    /**
     *
     * @param sLine1
     * @param sLine2
     */
    @Override
    public void writeVisor(String sLine1, String sLine2) {
    } 

    /**
     *
     * @param animation
     * @param sLine1
     * @param sLine2
     */
    @Override
    public void writeVisor(int animation, String sLine1, String sLine2) {
    } 
}
