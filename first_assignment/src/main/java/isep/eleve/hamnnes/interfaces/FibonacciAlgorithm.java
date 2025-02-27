package isep.eleve.hamnnes.interfaces;

/**
 * Interface for Fibonacci algorithms.
 * <p>
 * The Fibonacci sequence is defined as follows:
 * <ul>
 *   <li>Basis: F<sub>0</sub> = 0, F<sub>1</sub> = 1</li>
 *   <li>Recurrence: F<sub>n</sub> = F<sub>n-1</sub> + F<sub>n-2</sub> for n &gt; 1</li>
 * </ul>
 * <p>
 * This interface provides a method to calculate the nth Fibonacci number.
 * </p>
 */
public interface FibonacciAlgorithm extends Algorithm<Long>{

    Long calculate(int n);
    
}
