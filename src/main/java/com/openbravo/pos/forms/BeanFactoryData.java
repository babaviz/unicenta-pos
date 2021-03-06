
package com.openbravo.pos.forms;

/**
 *
 * @author adrianromero
 */
public class BeanFactoryData implements BeanFactoryApp {
    
    private BeanFactoryApp bf;
    
    /** Creates a new instance of BeanFactoryData */
    public BeanFactoryData() {
    }
    
    /**
     *
     * @param app
     * @throws BeanFactoryException
     */
    @Override
    public void init(AppView app) throws BeanFactoryException {  
        
        try {
            
            String sfactoryname = this.getClass().getName();
            if (sfactoryname.endsWith("Create")) {
                sfactoryname = sfactoryname.substring(0, sfactoryname.length() - 6);
            }
            bf = (BeanFactoryApp) Class.forName(sfactoryname + app.getSession().DB.getName()).newInstance();
            bf.init(app);                     
// JG 16 May use multicatch
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | BeanFactoryException ex) {
            throw new BeanFactoryException(ex);
        }
    }

    /**
     *
     * @return
     */
    @Override
    public Object getBean() {
        return bf.getBean();
    }         
}
