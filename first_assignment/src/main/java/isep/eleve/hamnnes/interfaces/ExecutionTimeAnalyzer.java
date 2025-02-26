package isep.eleve.hamnnes.interfaces;

public interface ExecutionTimeAnalyzer<T> {

    Object[][] measureExecutionTime(int scopeStart, int scopeEnd, int interval, T algorithm);
    
}
