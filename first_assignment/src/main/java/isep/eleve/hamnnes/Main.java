package isep.eleve.hamnnes;

import isep.eleve.hamnnes.firstPart.ExecutionTimeAnalyzerForFactorialRecursiveAlgorithm;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        long[][] executionTimes;

        ExecutionTimeAnalyzerForFactorialRecursiveAlgorithm executionTimeAnalyzerForFactorialRecursiveAlgorithm = new ExecutionTimeAnalyzerForFactorialRecursiveAlgorithm();

        executionTimes = executionTimeAnalyzerForFactorialRecursiveAlgorithm.measureExecutionTime(0, 10, 1);

        for(int i = 0; i < 10; i++){
            System.err.println(executionTimes[i][0] + " and " + executionTimes[i][1]);
        }





    }
}