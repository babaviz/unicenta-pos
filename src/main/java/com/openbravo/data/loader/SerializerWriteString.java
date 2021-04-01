
package com.openbravo.data.loader;

import com.openbravo.basic.BasicException;

import java.lang.reflect.Array;

/**
 *
 * @author JG uniCenta
 */
public class SerializerWriteString implements SerializerWrite<Object> {
    
    /**
     *
     */
    public static final SerializerWrite INSTANCE = new SerializerWriteString();
    
    /** Creates a new instance of SerializerWriteString */
    private SerializerWriteString() {
    }
    
    /**
     *
     * @param dp
     * @param obj
     * @throws BasicException
     */
    public void writeValues(DataWrite dp, Object obj) throws BasicException {
        if (obj instanceof Object[]){
            for (int i = 0 ; i < ((Object[]) obj).length ; i++) {
                Datas.STRING.setValue(dp, i+1, ((Object[]) obj)[i]);
            }
        }
        else {
            Datas.STRING.setValue(dp, 1, obj);
        }

    }
}
