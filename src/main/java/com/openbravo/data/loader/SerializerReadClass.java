
package com.openbravo.data.loader;

import com.openbravo.basic.BasicException;

/**
 *
 * @author JG uniCenta
 */
public class SerializerReadClass implements SerializerRead {

    private final Class m_clazz;
    
    /** Creates a new instance of DefaultSerializerRead
     * @param clazz */
    public SerializerReadClass(Class clazz) {
        m_clazz = clazz;
    }
    
    /**
     *
     * @param dr
     * @return
     * @throws BasicException
     */
    @Override
    public Object readValues(DataRead dr) throws BasicException {
        try {
            SerializableRead sr = (SerializableRead) m_clazz.newInstance();
            sr.readValues(dr);
            return sr;
// JG 16 May 12 use multicatch
        } catch (java.lang.InstantiationException | IllegalAccessException | ClassCastException eIns) {
            return null;
        }
    }
}
