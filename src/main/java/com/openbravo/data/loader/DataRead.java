

package com.openbravo.data.loader;

import com.openbravo.basic.BasicException;

/**
 *
 * @author  adrian
 */
public interface DataRead {
    
    /**
     *
     * @param columnIndex
     * @return
     * @throws BasicException
     */
    public Integer getInt(int columnIndex) throws BasicException;

    /**
     *
     * @param columnIndex
     * @return
     * @throws BasicException
     */
    public String getString(int columnIndex) throws BasicException;

    /**
     *
     * @param columnIndex
     * @return
     * @throws BasicException
     */
    public Double getDouble(int columnIndex) throws BasicException;

    /**
     *
     * @param columnIndex
     * @return
     * @throws BasicException
     */
    public Boolean getBoolean(int columnIndex) throws BasicException;

    /**
     *
     * @param columnIndex
     * @return
     * @throws BasicException
     */
    public java.util.Date getTimestamp(int columnIndex) throws BasicException;

    //public java.io.InputStream getBinaryStream(int columnIndex) throws DataException;

    /**
     *
     * @param columnIndex
     * @return
     * @throws BasicException
     */
        public byte[] getBytes(int columnIndex) throws BasicException;

    /**
     *
     * @param columnIndex
     * @return
     * @throws BasicException
     */
    public Object getObject(int columnIndex) throws BasicException ;
    
//    public int getColumnCount() throws DataException;

    /**
     *
     * @return
     * @throws BasicException
     */
        public DataField[] getDataField() throws BasicException;
}
