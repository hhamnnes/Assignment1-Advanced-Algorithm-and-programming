package isep.eleve.hamnnes;

import isep.eleve.hamnnes.firstPart.ExecutionTimeAnalyzerForFactorialAlgorithm;
import isep.eleve.hamnnes.firstPart.FactorialRecursiveAlgorithm;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        long[][] executionTimes;

        ExecutionTimeAnalyzerForFactorialAlgorithm executionTimeAnalyzerForFactorialAlgorithm = new ExecutionTimeAnalyzerForFactorialAlgorithm();

        executionTimes = executionTimeAnalyzerForFactorialAlgorithm.measureExecutionTime(0, 100, 2,
                                                                                         new FactorialRecursiveAlgorithm());

        for(int i = 0; i < 50; i++){
            System.err.println(executionTimes[i][0] 
            + " and " + executionTimes[i][1] 
            + " and " + executionTimes[i][2]);
        }





    }
}