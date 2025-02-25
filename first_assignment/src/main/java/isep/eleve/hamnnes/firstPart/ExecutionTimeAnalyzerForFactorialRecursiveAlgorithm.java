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
        
        long[][] executionTimes = new long[numberOfSamples][2];

        for (int i = scopeStart; i < scopeEnd; i += interval) {

            startTime = System.nanoTime();
            FactorialAlgorithm.factorialRecursive(i);
            stopTime = System.nanoTime();

            executionTime = stopTime - startTime;
            executionTimes[i][0] = i;
            executionTimes[i][1] = executionTime;

        }

        return executionTimes;


    }


    
}
