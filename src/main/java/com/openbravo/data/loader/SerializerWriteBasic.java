

package com.openbravo.data.loader;

import com.openbravo.basic.BasicException;

/**
 *
 * @author JG uniCenta
 */
public class SerializerWriteBasic implements SerializerWrite<Object[]> {
    
    private Datas[] m_classes;

    /** Creates a new instance of SerializerWriteBasic
     * @param classes */
    public SerializerWriteBasic(Datas... classes) {
        m_classes = classes;
    }
    
    /**
     *
     * @param dp
     * @param obj
     * @throws BasicException
     */
    @Override
    public void writeValues(DataWrite dp, Object[] obj) throws BasicException {

        for (int i = 0; i < m_classes.length; i++) {
            m_classes[i].setValue(dp, i + 1, obj[i]);
        }
    }
    
}
