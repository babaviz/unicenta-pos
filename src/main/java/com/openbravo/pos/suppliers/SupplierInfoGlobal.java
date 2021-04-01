
//

//    For BrowseEditableData

package com.openbravo.pos.suppliers;

import com.openbravo.data.user.BrowsableEditableData;

/**
 *
 * @author Jack Gerrard
 */
public class SupplierInfoGlobal {

    private static SupplierInfoGlobal INSTANCE;
    private SupplierInfoExt supplierInfoExt;
    private BrowsableEditableData editableData;

    private SupplierInfoGlobal() {
    }

    /**
     *
     * @return
     */
        public static SupplierInfoGlobal getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new SupplierInfoGlobal();
        }

        return INSTANCE;
    }

    /**
     *
     * @return
     */
    public SupplierInfoExt getSupplierInfoExt() {
        return supplierInfoExt;
    }

    /**
     *
     * @param supplierInfoExt
     */
    public void setSupplierInfoExt(SupplierInfoExt supplierInfoExt) {
        this.supplierInfoExt = supplierInfoExt;
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
