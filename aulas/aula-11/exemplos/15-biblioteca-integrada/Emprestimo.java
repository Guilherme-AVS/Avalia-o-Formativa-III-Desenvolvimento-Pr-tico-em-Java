import java.time.LocalDate;
public class Emprestimo {
    private final String usuario; private final LocalDate data;
    public Emprestimo(String usuario){this.usuario=usuario;this.data=LocalDate.now();}
    @Override public String toString(){return usuario+" em "+data;}
}
