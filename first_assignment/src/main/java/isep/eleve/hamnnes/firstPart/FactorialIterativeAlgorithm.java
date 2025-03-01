package isep.eleve.hamnnes.firstPart;

import isep.eleve.hamnnes.interfaces.FactorialAlgorithm;
import java.math.BigInteger;

public class FactorialIterativeAlgorithm implements FactorialAlgorithm{

    private BigInteger A;
    private BigInteger B;
    

    public FactorialIterativeAlgorithm() {

    }


    @Override
    public BigInteger calculate(int n) {
        BigInteger factorialResult = BigInteger.ONE; 
        A = n % 2 == 0 ? BigInteger.valueOf(n + 2) : BigInteger.valueOf(n + 1);
        B = n % 2 == 0 ? BigInteger.valueOf(n + 1) : BigInteger.valueOf(n);


        for (int i = n; i > 0; --i) {

            
            A = BigInteger.valueOf(B.longValue());
            B = A.subtract(BigInteger.valueOf(1));

            if(i % 2 == 0) continue;

            if(B == BigInteger.ZERO) {
                factorialResult = factorialResult.multiply(A);
            }

            else {
                factorialResult = factorialResult.multiply(A.multiply(B));
            }
            

        }



        return factorialResult;
    }
    
}
