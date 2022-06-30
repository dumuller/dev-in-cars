package com.muller.devincars.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EduardoTest {

    private final Eduardo eduardo = new Eduardo("Eduardo", 31, "São Miguel do Oeste", "Desenvolvedor CI&T");

    @Test
    public void shouldReturnSuccessWhenEduardoIsValid() {
        Eduardo eduardoReturn = new Eduardo();
        eduardoReturn.setNome("Eduardo");
        eduardoReturn.setIdade(31);
        eduardoReturn.setCidade("São Miguel do Oeste");
        eduardoReturn.setOcupacao("Desenvolvedor CI&T");

        Assertions.assertEquals(eduardo, eduardoReturn);
    }
}
