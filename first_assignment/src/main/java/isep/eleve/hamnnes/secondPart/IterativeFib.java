package isep.eleve.hamnnes.secondPart;

import isep.eleve.hamnnes.interfaces.FibonacciAlgorithm;

public class IterativeFib implements FibonacciAlgorithm {

    private Long firstTerm;
    private Long secondTerm;

    @Override
    public Long calculate(int n) {

        if (n == 0) return 0L;
        if (n == 1) return 1L;

        firstTerm = 0L;
        secondTerm = 1L;
        Long nextTerm = 0L;

        for (int i = 2; i <= n; i++) {
            nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }

        return secondTerm;
    }
}

