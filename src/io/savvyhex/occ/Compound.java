package io.savvyhex.occ;

import static io.savvyhex.occ.Utility.*;

public class Compound {
    private final String prefix[] = {"meth", "eth", "prop", "but", "pent", "hex", "hept", "oct", "non", "dec"};
    private final String prePrefix[] = {"bromo ", "chloro ", "methyl ", "ethyl ", "propyl ", "butyl "};
    private final String homologousSuffix[] = {"an", "en", "yn"};
    private final String suffix[] = {"e", "oic acid", "one", "ol", "al"};
    private final String numPrefix[] = {"", "di", "tri", "tetra"};

    private String name = "";

    public Compound(){
        int npC, tNpC = 0, chance = 40;
        do {
            npC = choose(numPrefix.length);
            name += numPrefix[npC];
            if (npC != 0)
                name += prePrefix[choose(prePrefix.length)];
            tNpC += ++npC;
            chance -= 10;
        } while (chance(chance) && tNpC < prefix.length-1);

        int pC;
        do {
            pC = choose(prefix.length);
        } while (pC < tNpC);
        name += prefix[choose(prefix.length)];
        name += homologousSuffix[choose(homologousSuffix.length)];
        name += suffix[choose(suffix.length)];
    }

    public String getName() {
        return name;
    }
}
