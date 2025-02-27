package isep.eleve.hamnnes;

import isep.eleve.hamnnes.firstPart.ExecutionTimeAnalyzerForFactorialAlgorithm;
import isep.eleve.hamnnes.firstPart.FactorialRecursiveAlgorithm;
import isep.eleve.hamnnes.firstPart.FactorialIterativeAlgorithm;
import isep.eleve.hamnnes.firstPart.JsonFileWriterExecutionTimeData;
public class Main {
    public static void main(String[] args) {

        Object[][] executionTimes;

        ExecutionTimeAnalyzerForFactorialAlgorithm executionTimeAnalyzerForFactorialAlgorithm 
        = new ExecutionTimeAnalyzerForFactorialAlgorithm();

        executionTimes = executionTimeAnalyzerForFactorialAlgorithm.measureExecutionTime(0, 500, 10,
                                                                                         new FactorialRecursiveAlgorithm());
        JsonFileWriterExecutionTimeData.writeToFile(executionTimes, "RecursiveAlgorithmExecutionTimeData.json");


        executionTimes = executionTimeAnalyzerForFactorialAlgorithm.measureExecutionTime(0, 500, 10,
                                                                                         new FactorialIterativeAlgorithm());
        JsonFileWriterExecutionTimeData.writeToFile(executionTimes, "IterativeAlgorithmExecutionTimeData.json");




    }
}