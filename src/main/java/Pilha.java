// faça o suficiente para o teste passar!!!
public class Pilha {

    private Object elemento;
    private int quantidade = 0;

    public boolean estaVazia() {
        return (elemento == null);
    }

    public int tamanho() {
        return quantidade;
    }

    public void empilha(int i) {
        this.elemento = i;
        quantidade++;
    }

    public Object topo() {
        return elemento;
    }
}
