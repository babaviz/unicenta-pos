

package com.openbravo.data.user;
import com.openbravo.data.loader.TableDefinition;
import com.openbravo.basic.BasicException;
import com.openbravo.data.loader.SentenceExec;

/**
 *
 * @author JG uniCenta
 */
public class SaveProvider {
    
    /**
     *
     */
    protected SentenceExec m_sentupdate;

    /**
     *
     */
    protected SentenceExec m_sentinsert;

    /**
     *
     */
    protected SentenceExec m_sentdelete;
    
    /** Creates a new instance of SavePrSentence
     * @param sentupdate
     * @param sentdelete
     * @param sentinsert */
    public SaveProvider(SentenceExec sentupdate, SentenceExec sentinsert, SentenceExec sentdelete) {
        m_sentupdate = sentupdate;
        m_sentinsert = sentinsert;
        m_sentdelete = sentdelete;
    }

    /**
     *
     * @param table
     */
    public SaveProvider(TableDefinition table) {
        m_sentupdate = table.getUpdateSentence();
        m_sentdelete = table.getDeleteSentence();
        m_sentinsert = table.getInsertSentence();
    }

    /**
     *
     * @param table
     * @param fields
     */
    public SaveProvider(TableDefinition table, int[] fields) {
        m_sentupdate = table.getUpdateSentence(fields);
        m_sentdelete = table.getDeleteSentence();
        m_sentinsert = table.getInsertSentence(fields);
    }
    
    /**
     *
     * @return
     */
    public boolean canDelete() {
        return m_sentdelete != null;      
    }

    /**
     *
     * @param value
     * @return
     * @throws BasicException
     */
    public int deleteData(Object value) throws BasicException {
        return m_sentdelete.exec(value);
    }
    
    /**
     *
     * @return
     */
    public boolean canInsert() {
        return m_sentinsert != null;          
    }
    
    /**
     *
     * @param value
     * @return
     * @throws BasicException
     */
    public int insertData(Object value) throws BasicException {
        return m_sentinsert.exec(value);
    }
    
    /**
     *
     * @return
     */
    public boolean canUpdate() {
        return m_sentupdate != null;      
    }

    /**
     *
     * @param value
     * @return
     * @throws BasicException
     */
    public int updateData(Object value) throws BasicException {
        return m_sentupdate.exec(value);
    }
}
