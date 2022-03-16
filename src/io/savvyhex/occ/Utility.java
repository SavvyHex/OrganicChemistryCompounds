package io.savvyhex.occ;

import java.util.Random;

public class Utility {
    static Random ran = new Random();
    public static int choose(int max){
        return ran.nextInt(max);
    }
    public static String capitalize(String s){
        String cS = "";
        cS += Character.toUpperCase(s.charAt(0));
        cS += s.substring(1);
        return cS;
    }
    public static boolean chance(int chanceOfSuccess){
        return ran.nextInt(99)+1 <= chanceOfSuccess;
    }
}
