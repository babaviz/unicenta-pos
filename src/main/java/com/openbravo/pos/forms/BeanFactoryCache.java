
package com.openbravo.pos.forms;

/**
 *
 * @author adrianromero
 */
public abstract class BeanFactoryCache implements BeanFactoryApp {
    
    private Object bean = null;

    /**
     *
     * @param app
     * @return
     * @throws BeanFactoryException
     */
    public abstract Object constructBean(AppView app) throws BeanFactoryException;
           
    /**
     *
     * @param app
     * @throws BeanFactoryException
     */
    @Override
    public void init(AppView app) throws BeanFactoryException {
        bean = constructBean(app);
    }
    
    /**
     *
     * @return
     */
    @Override
    public Object getBean() {
        return bean;
    }
}
