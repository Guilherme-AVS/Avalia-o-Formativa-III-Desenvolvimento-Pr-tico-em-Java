import java.util.ArrayList;
public class Main { public static void main(String[] args) {
    Professor p = new Professor("Ana");
    ArrayList<Professor> lista = new ArrayList<>(); lista.add(p);
    new Universidade(lista).listar();
} }
