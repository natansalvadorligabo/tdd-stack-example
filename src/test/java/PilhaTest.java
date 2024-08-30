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
}
