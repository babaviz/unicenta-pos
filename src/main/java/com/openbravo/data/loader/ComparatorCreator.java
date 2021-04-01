

package com.openbravo.data.loader;

import java.util.Comparator;

/**
 *
 * @author JG uniCenta
 */
public interface ComparatorCreator {

    /**
     *
     * @return
     */
    public String[] getHeaders();

    /**
     *
     * @param index
     * @return
     */
    public Comparator createComparator(int[] index);
}
