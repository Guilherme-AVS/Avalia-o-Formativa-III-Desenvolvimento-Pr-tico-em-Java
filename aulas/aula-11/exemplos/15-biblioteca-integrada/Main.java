import java.util.ArrayList;
public class Main { public static void main(String[] args){
    Livro l=new Livro("Dom Casmurro","L1",1899,"Machado de Assis",256);
    Revista r=new Revista("Revista Tech","R1",2026,10,"Mensal");
    MidiaDigital m=new MidiaDigital("Java em Áudio","M1",2026,"MP3",85.5);
    l.emprestar("João"); ArrayList<ItemBiblioteca> itens=new ArrayList<>(); itens.add(l); itens.add(r); itens.add(m);
    new Biblioteca(itens).listar();
} }
