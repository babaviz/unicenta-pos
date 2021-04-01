

package com.openbravo.data.loader;

import com.openbravo.basic.BasicException;

/**
 *
 * @author  adrian
 */
public class SentenceUpdateResultSet implements DataResultSet {
    
    private int m_iUpdateCount;
    
    /** Creates a new instance of UpdateResultSet
     * @param iUpdateCount */
    public SentenceUpdateResultSet(int iUpdateCount) {
        m_iUpdateCount = iUpdateCount;
    }
    
    /**
     *
     * @param columnIndex
     * @return
     * @throws BasicException
     */
    public Integer getInt(int columnIndex) throws BasicException {
        throw new BasicException(LocalRes.getIntString("exception.nodataset"));
    }

    /**
     *
     * @param columnIndex
     * @return
     * @throws BasicException
     */
    public String getString(int columnIndex) throws BasicException {
        throw new BasicException(LocalRes.getIntString("exception.nodataset"));
    }

    /**
     *
     * @param columnIndex
     * @return
     * @throws BasicException
     */
    public Double getDouble(int columnIndex) throws BasicException {
        throw new BasicException(LocalRes.getIntString("exception.nodataset"));
    }

    /**
     *
     * @param columnIndex
     * @return
     * @throws BasicException
     */
    public Boolean getBoolean(int columnIndex) throws BasicException {
        throw new BasicException(LocalRes.getIntString("exception.nodataset"));
    }

    /**
     *
     * @param columnIndex
     * @return
     * @throws BasicException
     */
    public java.util.Date getTimestamp(int columnIndex) throws BasicException {
        throw new BasicException(LocalRes.getIntString("exception.nodataset"));
    }

    //public java.io.InputStream getBinaryStream(int columnIndex) throws DataException;

    /**
     *
     * @param columnIndex
     * @return
     * @throws BasicException
     */
        public byte[] getBytes(int columnIndex) throws BasicException {
        throw new BasicException(LocalRes.getIntString("exception.nodataset"));
    }

    /**
     *
     * @param columnIndex
     * @return
     * @throws BasicException
     */
    public Object getObject(int columnIndex) throws BasicException  {
        throw new BasicException(LocalRes.getIntString("exception.nodataset"));
    }

//    public int getColumnCount() throws DataException;

    /**
     *
     * @return
     * @throws BasicException
     */
        public DataField[] getDataField() throws BasicException {
        throw new BasicException(LocalRes.getIntString("exception.nodataset"));
    }

    /**
     *
     * @return
     * @throws BasicException
     */
    public Object getCurrent() throws BasicException {
        throw new BasicException(LocalRes.getIntString("exception.nodataset"));
    }
    
    /**
     *
     * @return
     * @throws BasicException
     */
    public boolean next() throws BasicException {
        throw new BasicException(LocalRes.getIntString("exception.nodataset"));
    }
     
    /**
     *
     * @throws BasicException
     */
    public void close() throws BasicException {
    }
   
    /**
     *
     * @return
     * @throws BasicException
     */
    public int updateCount() throws BasicException {
        return m_iUpdateCount;
    }
}
