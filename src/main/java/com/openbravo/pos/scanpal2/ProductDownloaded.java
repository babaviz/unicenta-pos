

package com.openbravo.pos.scanpal2;

/**
 *
 * @author JG uniCenta
 */
public class ProductDownloaded {
    
    private String m_sCode;
    private double m_dQuantity;
    
    /**
     *
     */
    public ProductDownloaded() {
    }
    
    /**
     *
     * @param value
     */
    public void setCode(String value) {
        m_sCode = value;
    }

    /**
     *
     * @return
     */
    public String getCode() {
        return m_sCode;
    }

    /**
     *
     * @param value
     */
    public void setQuantity(double value) {
        m_dQuantity = value;
    }

    /**
     *
     * @return
     */
    public double getQuantity() {
        return m_dQuantity;
    }
}