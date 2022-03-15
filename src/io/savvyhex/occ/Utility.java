package io.savvyhex.occ;

import java.util.Random;

public class Utility {
    static Random ran = new Random();
    public static int choose(int max){
        return ran.nextInt(max);
    }
    public static String capitalize(String s){
        StringBuilder cS = new StringBuilder();
        cS.append(Character.toUpperCase(s.charAt(0)));
        for (int i = 1; i < s.length(); i++)
            cS.append(s.charAt(i));
        return cS.toString();
    }
}
