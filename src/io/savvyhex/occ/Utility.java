package io.savvyhex.occ;

public class Utility {
    public static int choose(int max){
        return (int)(Math.random()*max);
    }

    public static String capitalize(String s){
        String cS = "";
        cS += Character.toUpperCase(s.charAt(0));
        for (int i = 1; i < s.length(); i++)
            cS += s.charAt(i);
        return cS;
    }
}
