import java.util.List;
public class StartupICC {
    public static void main(String[] args) {
        List<String> entregaveis=List.of("Problema e proposta de valor","MVP","Protótipo","Implementação e testes","Documentação e defesa");
        entregaveis.forEach(item -> System.out.println("[OK] "+item));
    }
}
