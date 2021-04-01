
package com.openbravo.data.user;

import com.openbravo.data.loader.SerializerWrite;

/**
 *
 * @author adrian
 */
public interface FilterEditorCreator extends EditorCreator {

    /**
     *
     * @return
     */
    public SerializerWrite getSerializerWrite();    
}
