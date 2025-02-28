package isep.eleve.hamnnes.genericClasses;

import isep.eleve.hamnnes.interfaces.ExecutionTimeAnalyzer;
import isep.eleve.hamnnes.interfaces.StringReversalAlgorithm;


public class ExecutionTimeAnalyzerGenericForStringAlgorithms<T> implements ExecutionTimeAnalyzer<StringReversalAlgorithm<T>> {
    private int numberOfSamples;
    private long executionTime;
    private long startTime;
    private long stopTime; 
    private T reversedResult;
    private char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
    private String inputString;


    public ExecutionTimeAnalyzerGenericForStringAlgorithms() {

    }

    @Override 
    public Object[][] measureExecutionTime(int scopeStart,
                                         int scopeEnd,
                                         int interval,
                                         StringReversalAlgorithm<T> algorithm) {
        


        numberOfSamples = (scopeEnd - scopeStart) / interval;

        if (numberOfSamples % 2 != 0) numberOfSamples -= 1;
        
        Object[][] executionTimes = new Object[numberOfSamples][3];

    
        for (int i = 0; i < 10; i++) {
            algorithm.reverse("HR");
        }

         
        for (int i = 0 , y = scopeStart; i < numberOfSamples; i++ , y += interval) {
            inputString = "";
            
            for (int a = 0; a < y + 1; a++ ){
                inputString += a >= alphabet.length ? alphabet[a % alphabet.length] : alphabet[a];
            }

            
            
        
            
            startTime = System.nanoTime();
            reversedResult = algorithm.reverse(inputString);
            stopTime = System.nanoTime();
            executionTime = stopTime - startTime;
             
            

            System.out.println(executionTime);
            
            executionTimes[i][0] = y;
            executionTimes[i][1] = executionTime;
            executionTimes[i][2] = reversedResult;

        }

        return executionTimes;


    }
    
}


