

package com.openbravo.pos.util;

/**
 *
 * @author Mikel Irurita
 */
public class LuhnAlgorithm {
    
    /** Creates a new instance of LuhnAlgorithm */
    private LuhnAlgorithm() {
    }

    /**
     *
     * @param cardNumber
     * @return
     */
    public static boolean checkCC(String cardNumber){
        int sum = 0;

        int flip = 0;
        
        if ( !StringUtils.isNumber(cardNumber) ){
            return false;
        }
        
        for (int i = cardNumber.length() -1; i >= 0; i--) {
             int k = Character.digit(cardNumber.charAt(i), 10);
             flip ++;

             if ( flip % 2 == 0 ) {
                k *= 2;
                if (k > 9) {
                    k -= 9;
                }
            }
            sum += k;
        }
        return (sum % 10 == 0);
    }

}

