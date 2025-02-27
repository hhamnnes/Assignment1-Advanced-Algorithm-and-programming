package isep.eleve.hamnnes;

import isep.eleve.hamnnes.firstPart.ExecutionTimeAnalyzerForFactorialAlgorithm;
import isep.eleve.hamnnes.firstPart.FactorialRecursiveAlgorithm;
import isep.eleve.hamnnes.firstPart.FactorialIterativeAlgorithm;
import isep.eleve.hamnnes.firstPart.JsonFileWriterExecutionTimeData;
import isep.eleve.hamnnes.secondPart.RecursiveFib;
import isep.eleve.hamnnes.secondPart.IterativeFib;
import isep.eleve.hamnnes.secondPart.ExecutionTimeAnalyzerForFibonacciAlgorithm;
public class Main {
    public static void main(String[] args) {

        
        Object[][] executionTimes;


        //Measuring execution time for part two:
        ExecutionTimeAnalyzerForFactorialAlgorithm executionTimeAnalyzerForFactorialAlgorithm 
        = new ExecutionTimeAnalyzerForFactorialAlgorithm();

        executionTimes = executionTimeAnalyzerForFactorialAlgorithm.measureExecutionTime(0, 500, 10,
                                                                                         new FactorialRecursiveAlgorithm());
        JsonFileWriterExecutionTimeData.writeToFile(executionTimes, "RecursiveAlgorithmExecutionTimeData.json");


        executionTimes = executionTimeAnalyzerForFactorialAlgorithm.measureExecutionTime(0, 500, 10,
                                                                                         new FactorialIterativeAlgorithm());
        JsonFileWriterExecutionTimeData.writeToFile(executionTimes, "IterativeAlgorithmExecutionTimeData.json");

        //Measuring execution time for part two:
        ExecutionTimeAnalyzerForFibonacciAlgorithm executionTimeAnalyzerForFibonacciAlgorithm 
        = new ExecutionTimeAnalyzerForFibonacciAlgorithm();

        executionTimes = executionTimeAnalyzerForFibonacciAlgorithm.measureExecutionTime(0, 50, 1,
                                                                                         new RecursiveFib());
        JsonFileWriterExecutionTimeData.writeToFile(executionTimes, "RecursiveFibonacciAlgorithmExecutionTimeData.json");                                                                                 

        executionTimes = executionTimeAnalyzerForFibonacciAlgorithm.measureExecutionTime(0, 50, 1,
                                                                                         new IterativeFib());

        JsonFileWriterExecutionTimeData.writeToFile(executionTimes, "IterativeFibonacciAlgorithmExecutionTimeData.json");  
        



    }
}