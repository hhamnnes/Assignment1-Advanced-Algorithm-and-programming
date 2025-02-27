package isep.eleve.hamnnes.genericClasses;

import isep.eleve.hamnnes.interfaces.ExecutionTimeAnalyzer;
import isep.eleve.hamnnes.interfaces.Algorithm;

public class ExecutionTimeAnalyzerGeneric<T> implements ExecutionTimeAnalyzer<Algorithm<T>> {
    private int numberOfSamples;
    private long executionTime;
    private long startTime;
    private long stopTime; 
    private T calculationResult;
    private long[] sampleExecutionTime = new long[10];

    public ExecutionTimeAnalyzerGeneric() {

    }

    @Override 
    public Object[][] measureExecutionTime(int scopeStart,
                                         int scopeEnd,
                                         int interval,
                                         Algorithm<T> algorithm) {


        numberOfSamples = (scopeEnd - scopeStart) / interval;

        if (numberOfSamples % 2 != 0) numberOfSamples -= 1;
        
        Object[][] executionTimes = new Object[numberOfSamples][3];

    
        for (int i = 0; i < 1000; i++) {
            algorithm.calculate(i);
        }

        for (int i = 0 , y = scopeStart; i < numberOfSamples; i++ , y += interval) {

            for(int z = 0; z < 10; z++) {
                startTime = System.nanoTime();
                for(int a = 0; a < 100; a++) {
                    calculationResult = algorithm.calculate(y);
                }
                stopTime = System.nanoTime();

                executionTime = stopTime - startTime;
                sampleExecutionTime[z] =  executionTime;
            }

            executionTime = 0;

            for(int z = 0; z < 10; z++) {
                executionTime += sampleExecutionTime[z];
            }

            executionTime = executionTime /10;



            //Code without looping for average.
            /*
             * startTime = System.nanoTime();
             * calculationResult = algorithm.calculate(y);
             * stopTime = System.nanoTime();
             * executionTime = stopTime - startTime;
             */
            

            System.out.println(executionTime);
            
            executionTimes[i][0] = y;
            executionTimes[i][1] = executionTime;
            executionTimes[i][2] = calculationResult;

        }

        return executionTimes;


    }
    
}
