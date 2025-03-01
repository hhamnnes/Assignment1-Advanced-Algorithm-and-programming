package isep.eleve.hamnnes.firstPart;

import java.math.BigInteger;

import isep.eleve.hamnnes.interfaces.FactorialAlgorithm;
/**
 * This class should implement the interface FactorialAlgorithm.
 * The class will then need to override the method calculate. 
 * The implementation of the calculate method should follow this 
 * pseudo code:
 * 
 * <pre>{@code
 * factorialRecursive(n)
 *     Input: One integer
 *     Output: One integer
 *     if n == 0 then
 *        return 1
 *     else
 *        return factorialRecursive(n-1)
 * </pre>
 * 
 */
public class FactorialRecursiveAlgorithm implements FactorialAlgorithm{

    public FactorialRecursiveAlgorithm() {
    }
    
    @Override
    public BigInteger calculate(int n) {
        if (n == 0) return BigInteger.ONE;
        else return BigInteger.valueOf(n).multiply(calculate(n-1));
    }
    
   

    
}
