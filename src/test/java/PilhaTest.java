import org.junit.Test;

import static org.junit.Assert.*;

public class PilhaTest {

    @Test
    public void pilhaVazia() {
        Pilha p = new Pilha();
        // a condição é verdadeira?
        assertTrue(p.estaVazia());
        // o tamanho da pilha é igual a 0?
        assertEquals(0, p.tamanho());
    }

    @Test
    public void empilhaUmElemento() {
        Pilha p = new Pilha();
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
        Pilha p = new Pilha();
        p.empilha(5);
        p.empilha(10);
        assertEquals(2, p.tamanho());
        assertEquals(10, p.topo());
        Object objetoDesempilhado = p.desempilha();
        assertEquals(1, p.tamanho());
        assertEquals(5, p.topo());
        assertEquals(10, objetoDesempilhado);
    }
}
