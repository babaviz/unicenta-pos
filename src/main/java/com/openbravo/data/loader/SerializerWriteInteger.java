
package com.openbravo.data.loader;

import com.openbravo.basic.BasicException;

/**
 *
 * @author JG uniCenta
 */
public class SerializerWriteInteger implements SerializerWrite<Integer> {
    
    /**
     *
     */
    public static final SerializerWrite INSTANCE = new SerializerWriteInteger();
    
    /** Creates a new instance of SerializerWriteInteger */
    private SerializerWriteInteger() {
    }
    
    /**
     *
     * @param dp
     * @param obj
     * @throws BasicException
     */
    public void writeValues(DataWrite dp, Integer obj) throws BasicException {
        Datas.INT.setValue(dp, 1, obj);
    }  
}