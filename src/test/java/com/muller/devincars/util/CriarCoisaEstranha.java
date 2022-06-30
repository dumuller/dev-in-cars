package com.muller.devincars.util;

import com.muller.devincars.model.CoisaEstranha;

public class CriarCoisaEstranha {
    public static CoisaEstranha criarCoisaEstranha() {
        CoisaEstranha coisaEstranha = new CoisaEstranha();
        coisaEstranha.setId(1L);
        coisaEstranha.setCoisa_estranha("Meias coloridas");
        return coisaEstranha;
    }
}
