package isep.eleve.hamnnes.thirdPart;

import isep.eleve.hamnnes.interfaces.StringReversalAlgorithm;

public class RecursiveStringReversal implements StringReversalAlgorithm<String> {

    String reversedString = "";
    

    @Override
    public String reverse(String s) {

        if(s.length() == 1) return s;
        else {
            reversedString =  s.substring(s.length()-1, s.length()) + reverse(s.substring(0, s.length()-1));
            return reversedString;
        }
    }

    
    
}
