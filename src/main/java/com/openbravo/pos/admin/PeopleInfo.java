
package com.openbravo.pos.admin;

import com.openbravo.basic.BasicException;
import com.openbravo.data.loader.DataRead;
import com.openbravo.data.loader.IKeyed;
import com.openbravo.data.loader.SerializableRead;

/**
 *
 * @author adrianromero
 * Created on 27 de febrero de 2007, 23:27
 *
 */
public class PeopleInfo implements SerializableRead, IKeyed {
    
    private static final long serialVersionUID = 9110127845966L;
    private String m_sID;

    /**
     *
     */
    protected String m_sName;
    
    /** Creates a new instance of PeopleInfo */
    public PeopleInfo() {
        m_sID = null;
        m_sName = null;
    }
   
    /**
     *
     * @return
     */
    @Override
    public Object getKey() {
        return m_sID;
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
    }

    
    /**
     *
     * @return
     */
    public String getID() {
        return m_sID;
    }
    public void setID(String sID) {
        m_sID = sID;
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
     * @param sValue
     */
    public void setName(String sValue) {
        m_sName = sValue;
    }    
    
    @Override
    public String toString() {
        return m_sName;
    }
}
