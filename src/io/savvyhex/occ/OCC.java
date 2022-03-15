package io.savvyhex.occ;

import java.util.Scanner;

import static io.savvyhex.occ.Utility.capitalize;

public class OCC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name;
        Compound compound;
        System.out.println("\n---------------------DISCLAIMER-------------------------------- \n" +
                        "Most of these compounds do not exist... they're just for fun \n" +
                        "--------------------------------------------------------------- \n");

        System.out.println("How many compound names would you like to generate?");
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++){
            compound = new Compound();
            name = capitalize(compound.getName());
            System.out.println(i+". "+name);
        }
    }
}
