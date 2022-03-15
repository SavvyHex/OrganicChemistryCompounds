package io.savvyhex.occ;

import static io.savvyhex.occ.Utility.*;

public class Compound {
    private String prefix[] = {"meth", "eth", "prop", "but", "pent", "hex", "hept", "oct", "non", "dec"};
    private String prePrefix[] = {"bromo ", "chloro ", "methyl ", "ethyl ", "propyl ", "butyl "};
    private String homologousSuffix[] = {"an", "en", "yn"};
    private String suffix[] = {"e", "oic acid", "one", "ol", "al", " ether"};
    private String numPrefix[] = {"", "di", "tri", "tetra"};

    private String name = "";

    public Compound(){
        int npC = choose(numPrefix.length);
        name += numPrefix[npC];
        if (npC != 0)
            name += prePrefix[choose(prePrefix.length)];

        int pC;
        do {
            pC = choose(prefix.length);
        } while (pC < npC);
        name += prefix[choose(prefix.length)];
        name += homologousSuffix[choose(homologousSuffix.length)];
        name += suffix[choose(suffix.length)];
    }

    public String getName() {
        return name;
    }
}
