// faça o suficiente para o teste passar!!!
public class Pilha {

    private final Object[] elementos;
    private int quantidade = 0;

    public Pilha(int maximo) {
        elementos = new Object[maximo];
    }

    public boolean estaVazia() {
        return quantidade == 0;
    }

    public int tamanho() {
        return quantidade;
    }

    public void empilha(Object elemento) {
        if (quantidade == elementos.length) {
            throw new PilhaCheiaException("A Pilha está cheia.");
        }
        this.elementos[quantidade] = elemento;
        quantidade++;
    }

    public Object topo() {
        return elementos[quantidade-1];
    }

    public Object desempilha() {
        if (estaVazia()) {
            throw new PilhaVaziaException("A Pilha está vazia.");
        }
        Object topo = topo();
        quantidade--;
        return topo;
    }
}
