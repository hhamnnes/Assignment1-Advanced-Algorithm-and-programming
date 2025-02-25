package isep.eleve.hamnnes.interfaces;

public interface ExecutionTimeAnalyzer {

    long[][] measureExecutionTime(int scopeStart, int scopeEnd, int interval);
    
}
