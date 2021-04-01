
package com.openbravo.pos.forms;

/**
 *
 * @author adrianromero
 */
public interface BeanFactoryApp extends BeanFactory {

    /**
     *
     * @param app
     * @throws BeanFactoryException
     */
    public void init(AppView app) throws BeanFactoryException;

}
