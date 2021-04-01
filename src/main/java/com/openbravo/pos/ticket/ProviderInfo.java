

package com.openbravo.pos.ticket;

/**
 *
 * @author JG uniCenta
 */
public class ProviderInfo {
    
    private int m_iProviderID;
    private String m_sName;

    /** Creates new Provider */
    public ProviderInfo() {
        m_iProviderID = 0;
        m_sName = "";
    }
    
    /**
     *
     * @return
     */
    public int getProviderID() {
        return m_iProviderID;
    }
    
    /**
     *
     * @param iProviderID
     */
    public void setProviderID(int iProviderID) {
        m_iProviderID = iProviderID;
    }
    
    /**
     *
     * @return
     */
    public String getName() {
        return m_sName;
    }
    
    /**
     *
     * @param sName
     */
    public void setName(String sName) {
        m_sName = sName;
    }
    
    public String toString(){
        return m_sName;
    }
}
