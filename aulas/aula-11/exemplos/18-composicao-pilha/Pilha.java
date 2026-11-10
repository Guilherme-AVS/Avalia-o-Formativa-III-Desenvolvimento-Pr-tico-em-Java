import java.util.ArrayList;
public class Pilha {
    private final ArrayList<Integer> elementos = new ArrayList<>();
    public void push(int valor){elementos.add(valor);}
    public int pop(){if(elementos.isEmpty()) throw new IllegalStateException("Pilha vazia"); return elementos.remove(elementos.size()-1);}
    public int tamanho(){return elementos.size();}
}
