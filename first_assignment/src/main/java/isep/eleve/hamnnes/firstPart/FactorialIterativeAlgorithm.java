package isep.eleve.hamnnes.firstPart;

import isep.eleve.hamnnes.interfaces.FactorialAlgorithm;
import java.math.BigInteger;

public class FactorialIterativeAlgorithm implements FactorialAlgorithm{

    BigInteger factorialResult;
    

    public FactorialIterativeAlgorithm() {

    }


    @Override
    public BigInteger calculate(int n) {
        BigInteger factorialResult = BigInteger.ONE; 

        for (int i = n; i > 0; --i) {
            factorialResult = factorialResult.multiply(BigInteger.valueOf(i));
        }

        return factorialResult;
    }
    
}
