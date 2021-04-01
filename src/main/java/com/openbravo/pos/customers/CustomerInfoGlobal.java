

package com.openbravo.pos.customers;

import com.openbravo.data.user.BrowsableEditableData;

/**
 *
 * @author HS uniCenta
 */
public class CustomerInfoGlobal {

    private static CustomerInfoGlobal INSTANCE;
    private CustomerInfoExt customerInfoExt;
    private BrowsableEditableData editableData;

    //Singleton class
    private CustomerInfoGlobal() {
    }

    //Singleton constructor

    /**
     *
     * @return
     */
        public static CustomerInfoGlobal getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new CustomerInfoGlobal();
        }

        return INSTANCE;
    }

    /**
     *
     * @return
     */
    public CustomerInfoExt getCustomerInfoExt() {
        return customerInfoExt;
    }

    /**
     *
     * @param customerInfoExt
     */
    public void setCustomerInfoExt(CustomerInfoExt customerInfoExt) {
        this.customerInfoExt = customerInfoExt;
    }

    /**
     *
     * @return
     */
    public BrowsableEditableData getEditableData() {
        return editableData;
}

    /**
     *
     * @param editableData
     */
    public void setEditableData(BrowsableEditableData editableData) {
        this.editableData = editableData;
    }
    

}
