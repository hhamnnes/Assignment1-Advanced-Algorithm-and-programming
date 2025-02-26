package isep.eleve.hamnnes.firstPart;

import java.io.FileWriter;
import java.io.IOException;

public class JsonFileWriterExecutionTimeData {

    

    public static void writeToFile(Object[][] executionTimeData, String fileName) {


        int rows = executionTimeData.length;

        StringBuilder jsonString = new StringBuilder();

        jsonString.append("[\n");

        for(int i = 0; i < rows; i++) {
            jsonString.append("    {\n");
            
            jsonString.append("     \"Number\": " + executionTimeData[i][0] + ",\n");
            jsonString.append("     \"ExecutionTime\": " + executionTimeData[i][1] + ",\n");
            jsonString.append("     \"FactorialResult\": " + executionTimeData[i][2] + "\n");
            
            jsonString.append("    }");

            if(i < rows - 1) jsonString.append(",\n");

            
        }

        jsonString.append("\n]");

        System.out.println(jsonString);

        String filePath = "X:\\Onedrive\\Dokumenter\\Høgskolen i Østfold\\4.Semster\\II.2415 Advanced Algorithmic & Programming\\Assignments\\Assignment 1 v2\\Output\\";

        try (FileWriter file = new FileWriter(filePath + fileName)) {
            file.write(jsonString.toString());
            System.out.println("Data has been written to: " + filePath);
        } catch (IOException e) {
            e.printStackTrace();
        }







        


    }

    
}
