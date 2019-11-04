package com.company;

public class JuomaFactory {
    private static JuomaFactory INSTANCE = null;

    public JuomaFactory() {
    }

    public static synchronized JuomaFactory getInstance() {
        if(INSTANCE == null) {
            INSTANCE = new JuomaFactory();
        }
        return INSTANCE;
    }

    public ErikoisJuoma createJuoma(String tyyppi) {
        return new ErikoisJuoma(tyyppi);
    }
}
