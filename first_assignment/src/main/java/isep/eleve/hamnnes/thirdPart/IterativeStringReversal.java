package isep.eleve.hamnnes.thirdPart;

import isep.eleve.hamnnes.interfaces.StringReversalAlgorithm;

public class IterativeStringReversal implements StringReversalAlgorithm {

    String partA = "";
    String partB = "";
    String left = "";
    String right = "";

    @Override
    public String reverse(String s) {

        for(int i = 0, y = s.length(); i == y; i++, y--) {
            partA = s.substring(i,i + 1);
            partB = s.substring(y,y - 1);

            right += partA;
            left += partB;

            System.out.print(right);
            System.out.print(left);
            System.out.print(partA);
            System.out.print(partB);

        }

        return right + left;
    }
    
}
