package io.savvyhex.occ;

import static io.savvyhex.occ.Utility.*;

public class Compound {
    private final String prefix[] = {"meth", "eth", "prop", "but", "pent", "hex", "hept", "oct", "non", "dec"};
    private final String prePrefix[] = {"bromo ", "chloro ", "methyl ", "ethyl ", "propyl ", "butyl "};
    private final String homologousSuffix[] = {"an", "en", "yn"};
    private final String suffix[] = {"e", "oic acid", "one", "ol", "al"};
    private final String numPrefix[] = {"", "di", "tri", "tetra"};

    private String name = "";

    public Compound(boolean isEther){
        if (isEther){
            name += numPrefix[1];
            int ppC = 0;
            while (ppC <= 1)
                ppC = choose(prePrefix.length);
            name += prePrefix[ppC];
            name += "ether";
        } else {
            int npC, tNpC = 0, chance = 40, ppC;
            do {
                npC = choose(numPrefix.length);
                name += numPrefix[npC];
                do {
                    ppC = choose(prePrefix.length);
                } while (prePrefix[ppC] == null);
                name += prePrefix[ppC];
                deleteFromPrePrefix(ppC);
                tNpC += ++npC;
                chance -= 10;
            } while (chance(chance) && tNpC < prefix.length-1);
            int pC;
            do {
                pC = choose(prefix.length);
            } while (pC < tNpC);
            name += prefix[pC];
            if (pC == 0) {
                name += homologousSuffix[1];
            } else {
                name += homologousSuffix[choose(homologousSuffix.length)];
            }
            name += suffix[choose(suffix.length)];
        }
    }

    public String getName() {
        return name;
    }

    public void deleteFromPrePrefix(int index){
        prePrefix[index] = null;
    }
}
