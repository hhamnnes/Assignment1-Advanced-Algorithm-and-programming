package isep.eleve.hamnnes.firstPart;


import isep.eleve.hamnnes.interfaces.ExecutionTimeAnalyzer;

public class ExecutionTimeAnalyzerForFactorialRecursiveAlgorithm implements ExecutionTimeAnalyzer{

    private int numberOfSamples;
    private long executionTime;
    private long startTime;
    private long stopTime;

    public ExecutionTimeAnalyzerForFactorialRecursiveAlgorithm() {

    }

    @Override 
    public long[][] measureExecutionTime(int scopeStart, int scopeEnd, int interval) {


        numberOfSamples = (scopeEnd - scopeStart) / interval;

        if (numberOfSamples % 2 != 0) numberOfSamples -= 1;
        
        long[][] executionTimes = new long[numberOfSamples][2];

        
        // Warm-up phase
        for (int i = 0; i < 1000; i++) {
            FactorialAlgorithm.factorialRecursive(scopeStart);
        }

        for (int i = 0 , y = scopeStart; i < numberOfSamples; i++ , y += interval) {

            startTime = System.nanoTime();
            FactorialAlgorithm.factorialRecursive(y);
            stopTime = System.nanoTime();

            executionTime = stopTime - startTime;
            executionTimes[i][0] = y;
            executionTimes[i][1] = executionTime;

        }

        return executionTimes;


    }


    
}
