import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PilhaTest {

    private Pilha p;

    // execute este método antes dos métodos de teste
    @Before
    public void inicializaPilha() {
        p = new Pilha(10);
    }

    @Test
    public void pilhaVazia() {
        // a condição é verdadeira?
        assertTrue(p.estaVazia());
        // o tamanho da pilha é igual a 0?
        assertEquals(0, p.tamanho());
    }

    @Test
    public void empilhaUmElemento() {
        p.empilha(5);
        // a condicação é falsa?
        assertFalse(p.estaVazia());
        // o tamanho da pilha é igual a 1?
        assertEquals(1, p.tamanho());
        // o topo da pilha é igual a 5?
        assertEquals(5, p.topo());
    }

    // o teste passou, modifique ou crie um novo teste
    // @Test
    // public void empilhaDoisElementos() {
    //    Pilha p = new Pilha();
    //    p.empilha(5);
    //    p.empilha(10);
    //    assertEquals(2, p.tamanho());
    //    assertEquals(10, p.topo());
    // }

    @Test
    public void empilhaEDesempilha() {
        p.empilha(5);
        p.empilha(10);
        assertEquals(2, p.tamanho());
        assertEquals(10, p.topo());
        Object objetoDesempilhado = p.desempilha();
        assertEquals(1, p.tamanho());
        assertEquals(5, p.topo());
        assertEquals(10, objetoDesempilhado);
    }

    // o teste espera uma exception chamada PilhaVaziaException
    @Test(expected = PilhaVaziaException.class)
    public void removeDaPilhaVazia() {
        p.desempilha();
    }

    // adionando um teste ruim (elementos.length-4)
    // @Test(expected = PilhaCheiaException.class)
    // public void adicionaNaPilhaCheia() {
    //     for (int i = 0; i < 10; i++) {
    //         p.empilha("Elemento " + i);
    //     }
    //     p.empilha("Stack Overflow");
    // }

    // o teste captura uma exception chamada PilhaCheiaException
    @Test
    public void adicionaNaPilhaCheia() {
        for (int i = 0; i < 10; i++) {
            p.empilha("Elemento " + i);
        }
        // precisamos verificar se o erro acontece APÓS empilhar mais um elemento
        try {
            p.empilha("Stack Overflow");
            // espera que o teste falhe
            fail();
        } catch (PilhaCheiaException ignored) {}
    }
}
