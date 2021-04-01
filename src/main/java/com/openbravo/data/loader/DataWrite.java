

package com.openbravo.data.loader;

import com.openbravo.basic.BasicException;

/**
 *
 * @author  adrian
 */
public interface DataWrite {
 
    /**
     *
     * @param paramIndex
     * @param iValue
     * @throws BasicException
     */
    public void setInt(int paramIndex, Integer iValue) throws BasicException;
    /**
     *
     * @param paramIndex
     * @param sValue
     * @throws BasicException
     */
    public void setString(int paramIndex, String sValue) throws BasicException;

    /**
     *
     * @param paramIndex
     * @param dValue
     * @throws BasicException
     */
    public void setDouble(int paramIndex, Double dValue) throws BasicException;

    /**
     *
     * @param paramIndex
     * @param bValue
     * @throws BasicException
     */
    public void setBoolean(int paramIndex, Boolean bValue) throws BasicException;

    /**
     *
     * @param paramIndex
     * @param dValue
     * @throws BasicException
     */
    public void setTimestamp(int paramIndex, java.util.Date dValue) throws BasicException;
    
    //public void setBinaryStream(int paramIndex, java.io.InputStream in, int length) throws DataException;
    
    /**
     *
     * @param paramIndex
     * @param value
     * @throws BasicException
     */
        public void setBytes(int paramIndex, byte[] value) throws BasicException;    

    /**
     *
     * @param paramIndex
     * @param value
     * @throws BasicException
     */
    public void setObject(int paramIndex, Object value) throws BasicException;
}
