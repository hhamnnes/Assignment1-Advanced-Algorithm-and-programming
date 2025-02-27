package isep.eleve.hamnnes.firstPart;

import java.math.BigInteger;

import isep.eleve.hamnnes.interfaces.FactorialAlgorithm;

public class FactorialRecursiveAlgorithm implements FactorialAlgorithm{

    public FactorialRecursiveAlgorithm() {
    }
    
    @Override
    public BigInteger calculate(int n) {
        if (n == 0) return BigInteger.ONE;
        else return BigInteger.valueOf(n).multiply(calculate(n-1));
    }
    
   

    
}
