

package com.openbravo.pos.inventory;

import com.openbravo.basic.BasicException;
import com.openbravo.data.loader.DataRead;
import com.openbravo.data.loader.IKeyed;
import com.openbravo.data.loader.SerializableRead;
import com.openbravo.pos.ticket.ProductInfoExt;

/**
 * Clase para la gestion de los materiales de un producto (escandallo)
 * @author  Luis Ig. Bacas Riveiro	lbacas@opensistemas.com
 * @author  Pablo J. Urbano Santos	purbano@opensistemas.com
 */
public class MaterialProdInfo implements SerializableRead, IKeyed {
    private String m_sID;
    private String m_sName;
    private double m_dPriceBuy;
    private double m_dAmount;
    private String m_sUnit;

    /**
     *
     */
    public MaterialProdInfo() {
        m_sID = null;
        m_sName = null;
        m_dPriceBuy = 0.0;
        m_dAmount = 0.0;
        m_sUnit = null;
    }
    
    /**
     *
     * @param p
     */
    public MaterialProdInfo(ProductInfoExt p) {
        m_sID = p.getID();
        m_sName = p.getName();
        m_dPriceBuy = p.getPriceBuy();
        m_dAmount = 1.0;
    }
    
    /**
     *
     * @param dr
     * @throws BasicException
     */
    @Override
    public void readValues(DataRead dr) throws BasicException {
        m_sID = dr.getString(1);
        m_sName = dr.getString(2);
        m_dPriceBuy = dr.getDouble(3).doubleValue();
        m_dAmount = (dr.getDouble(4) == null) ? 1.0 : dr.getDouble(4).doubleValue();
        m_sUnit = dr.getString(5);
    }

    /**
     *
     * @param id
     */
    public void setID (String id) {
        m_sID = id;
    }

    /**
     *
     * @return
     */
    public String getID() {
        return m_sID;
    }
    
    /**
     *
     * @param name
     */
    public void setName (String name) {
        m_sName = name;
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
     * @param price
     */
    public void setPriceBuy (double price) {
        m_dPriceBuy = price;
    }

    /**
     *
     * @return
     */
    public double getPriceBuy() {
        return m_dPriceBuy;
    }
    
    /**
     *
     * @param amount
     */
    public void setAmount (double amount) {
        m_dAmount = amount;
    }

    /**
     *
     * @return
     */
    public double getAmount() {
        return m_dAmount;
    }
    
    /**
     *
     * @param unit
     */
    public void setUnit (String unit) {
        m_sUnit = unit;
    }

    /**
     *
     * @return
     */
    public String getUnit() {
        return m_sUnit;
    }

    /**
     *
     * @return
     */
    @Override
    public Object getKey() {
        return m_sID;
    }
    
    @Override
    public final String toString() {
        return (m_sName +" - "+m_dAmount+" "+m_sUnit);
    }
}
