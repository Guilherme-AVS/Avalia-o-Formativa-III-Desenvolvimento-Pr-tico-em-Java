import java.util.ArrayList; import java.util.List;
public class Biblioteca {
    private final List<ItemBiblioteca> acervo;
    public Biblioteca(List<ItemBiblioteca> acervo){this.acervo=acervo;}
    public void adicionarItem(ItemBiblioteca item){acervo.add(item);}
    public void listar(){for(ItemBiblioteca i:acervo)System.out.println(i);}
}
