
package com.openbravo.data.loader;

import com.openbravo.basic.BasicException;

/**
 *
 * @author JG uniCenta
 */
public class SerializerWriteBuilder implements SerializerWrite<SerializableWrite> {
    
    /**
     *
     */
    public static final SerializerWrite INSTANCE = new SerializerWriteBuilder();
    
    /** Creates a new instance of SerializerWriteBuilder */
    private SerializerWriteBuilder() {
    }
    
    /**
     *
     * @param dp
     * @param obj
     * @throws BasicException
     */
    public void writeValues(DataWrite dp, SerializableWrite obj) throws BasicException {
        obj.writeValues(dp);
    }
}
