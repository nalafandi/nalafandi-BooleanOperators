
/**
 * In order to make our programs even more impressive and interactive, we need to learn how to better leverage
 * boolean expressions. This will allow our programs to follow their own logic. For this example, you should look into
 * the different operators for basic boolean expressions.
 * 
 * More resources: https://www.freejavaguide.com/boolean_operators.htm
 * 
 * NOTE: All of these problems can be solved with one line with boolean operators - eg, 'return !b;'
 */
public class Lab {
    /**
     * @param b a true/false value.
     * @return if b is true, return true. if b is false, return false.
     */
    public boolean returnBoolean(boolean b){
        return b;
    }

    /**
     * @param b a true/false value.
     * @return if b is true, return false. if b is false, return true.
     * look into boolean operations to do this without using if/else statements.
     */
    public boolean returnNot(boolean b){
        if (b == true) {
            b = false;
        } else {
            b = true;
        }
        return b;
    }

    /**
     * @param b1 a true/false value.
     * @param b2 a true/false value.
     * @return true if both b1 and b2 are true. false otherwise.
     * look into boolean operations to do this without using if/else statements.
     */
    public boolean returnAnd(boolean b1, boolean b2){
        if (b1 == true && b2 == true) {
            return true;
        } else {
            return false;
        }
        
    }

    /**
     * @param b1 a true/false value.
     * @param b2 a true/false value.
     * @return true if either b1 or b1 are true. false if both are false.
     * look into boolean operations to do this without using if/else statements.
     */
    public boolean returnOr(boolean b1, boolean b2){
        boolean results = true;

        if (b1 == true || b2 == true) {
            results = true;
        } if (b1 == false && b2 == false) {
            results = false;
        }
        return results;
    }


}
