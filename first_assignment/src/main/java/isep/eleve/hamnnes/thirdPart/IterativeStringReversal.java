package isep.eleve.hamnnes.thirdPart;

import isep.eleve.hamnnes.interfaces.StringReversalAlgorithm;

public class IterativeStringReversal implements StringReversalAlgorithm {

    private char b;
    private char a;
    private char[] charArray;
    private String result;
    @Override
    public String reverse(String s) {

        result = "";

        charArray = s.toCharArray();



        for(int i = 0, y = s.length() - 1; i != y; i++, y--) {

            a = charArray[i];
            b = charArray[y];

            System.out.println("a: " + a);
            System.out.println("b: " + b);

            charArray[y] = a;
            charArray[i] = b;
            
            

        }

        for(int i = 0; i < s.length(); i++){
            result += charArray[i];
        }


        return result;


    }
    
}
