package isep.eleve.hamnnes.firstPart;

import isep.eleve.hamnnes.interfaces.FactorialAlgorithm;
import isep.eleve.hamnnes.interfaces.ExecutionTimeAnalyzer;

import java.math.BigInteger;

public class ExecutionTimeAnalyzerForFactorialAlgorithm implements ExecutionTimeAnalyzer<FactorialAlgorithm>{

    private int numberOfSamples;
    private long executionTime;
    private long startTime;
    private long stopTime;
    private BigInteger factorialResult;

    public ExecutionTimeAnalyzerForFactorialAlgorithm() {

    }

    @Override 
    public Object[][] measureExecutionTime(int scopeStart,
                                         int scopeEnd,
                                         int interval,
                                         FactorialAlgorithm factorialAlgorithm) {


        numberOfSamples = (scopeEnd - scopeStart) / interval;

        if (numberOfSamples % 2 != 0) numberOfSamples -= 1;
        
        long[][] executionTimes = new long[numberOfSamples][3];

        
        // Warm-up phase
        for (int i = 0; i < 1000; i++) {
            factorialAlgorithm.factorialCalculation(scopeStart);
        }

        for (int i = 0 , y = scopeStart; i < numberOfSamples; i++ , y += interval) {

            startTime = System.nanoTime();
            factorialResult = factorialAlgorithm.factorialCalculation(y);
            stopTime = System.nanoTime();

            executionTime = stopTime - startTime;
            executionTimes[i][0] = y;
            executionTimes[i][1] = executionTime;
            executionTimes[i][2] = factorialResult;

        }

        return executionTimes;


    }


    
}
