

package com.openbravo.pos.reports;

import com.openbravo.basic.BasicException;
import com.openbravo.data.user.FilterEditorCreator;
import com.openbravo.pos.forms.AppView;
import java.awt.Component;

/**
 *
 * @author adrianromero
 */
public interface ReportEditorCreator extends FilterEditorCreator {
    
    /**
     *
     * @param app
     */
    public void init(AppView app);

    /**
     *
     * @throws BasicException
     */
    public void activate() throws BasicException;

    /**
     *
     * @return
     */
    public Component getComponent();
}
