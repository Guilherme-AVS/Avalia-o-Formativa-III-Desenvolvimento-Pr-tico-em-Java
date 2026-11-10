import java.util.ArrayList;
import java.util.List;

public class Agenda {
    private List<String> contatos = new ArrayList<>();

    public void adicionarContato(String contato) {
        contatos.add(contato);
    }

    public void listarContatos() {
        for (String contato : contatos) {
            System.out.println(contato);
        }
    }

    public int quantidade() {
        return contatos.size();
    }

    public static void main(String[] args) {
        Agenda agenda = new Agenda();
        agenda.adicionarContato("Ana");
        agenda.adicionarContato("Bruno");
        agenda.adicionarContato("Carlos");

        agenda.listarContatos();
        System.out.println("Total: " + agenda.quantidade());
    }
}
