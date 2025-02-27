package isep.eleve.hamnnes.secondPart;

import isep.eleve.hamnnes.interfaces.FibonacciAlgorithm;
/*F0​=0,F1​=1,F2​=1,F3​=2,F4​=3,F5​=5,F6​=8,F7​=13,F8​=21,F9​=34 */
public class RecursiveFib implements FibonacciAlgorithm{

    @Override
    public Long calculate(int n) {
        if(n == 0) return Long.valueOf(0);
        else if (n == 1 || n == 2) return Long.valueOf(1);
        else return calculate(n-1) + calculate(n-2);
    }
    
}
