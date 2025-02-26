package isep.eleve.hamnnes.firstPart;

import isep.eleve.hamnnes.interfaces.FactorialAlgorithm;
import java.math.BigInteger;

public class FactorialIterativeAlgorithm implements FactorialAlgorithm{

    BigInteger factorialResult;
    

    public FactorialIterativeAlgorithm() {

    }


    @Override
    public  BigInteger factorialCalculation(int n) {
        for(int i = n - 1; i > 0; --i) {

            factorialResult = BigInteger.valueOf(n);
            factorialResult = factorialResult.multiply(BigInteger.valueOf(i));
        }
    
        return factorialResult;
    }
    
}
