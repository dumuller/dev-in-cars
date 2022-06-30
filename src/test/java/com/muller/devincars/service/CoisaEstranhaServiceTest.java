package com.muller.devincars.service;

import com.muller.devincars.model.CoisaEstranha;
import com.muller.devincars.repository.CoisaEstranhaRepository;
import com.muller.devincars.util.CriarCoisaEstranha;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.List;
import java.util.Optional;

@SpringBootTest
@ExtendWith(SpringExtension.class)
public class CoisaEstranhaServiceTest {
    @InjectMocks
    CoisaEstranhaService coisaEstranhaService;

    @Mock
    CoisaEstranhaRepository coisaEstranhaRepositoryMock;

    private final CoisaEstranha coisaEstranhaParaTeste = CriarCoisaEstranha.criarCoisaEstranha();

    /*@AfterEach
    public void setUp() {
        var coisaEstranhaTeste = CriarCoisaEstranha.criarCoisaEstranha();
    }

    @BeforeEach
    public void setUpBefore() {
        var coisaEstranhaTeste = CriarCoisaEstranha.criarCoisaEstranha();
    }*/

    @Test
    @DisplayName("Deve retornar uma coisa estranha quando buscado por um id válido")
    public void deveRetornarUmaCoisaEstranhaQuandoIdForValido() {
        //1 preparer
        Mockito.when(coisaEstranhaRepositoryMock.findById(Mockito.anyLong())).thenReturn(Optional.of(coisaEstranhaParaTeste));
        //2 execute
        var coisaEstranhaRetornar = coisaEstranhaService.findById(1L).get();
        //3 comparer
        Assertions.assertEquals(coisaEstranhaRetornar, coisaEstranhaParaTeste);
    }

    @Test
    @DisplayName("Deve retornar uma lista de coisas estranhas")
    public void deveRetornarUmaListaDeCoisasEstranhas() {
        //1
        List<CoisaEstranha> coisaEstranhaListEsperado = List.of(coisaEstranhaParaTeste, coisaEstranhaParaTeste);
        Mockito.when(coisaEstranhaRepositoryMock.findAll()).thenReturn(coisaEstranhaListEsperado);
        //2
        List<CoisaEstranha> coisaEstranhaList = coisaEstranhaService.findAllCoisasEstranhas();
        //3
        Assertions.assertNotNull(coisaEstranhaList);
        Assertions.assertEquals(coisaEstranhaListEsperado, coisaEstranhaList);
        Assertions.assertEquals(coisaEstranhaListEsperado.size(), coisaEstranhaList.size());
    }
}
