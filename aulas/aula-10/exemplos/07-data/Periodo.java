import java.time.LocalDate;

public class Periodo {
    private LocalDate inicio;
    private LocalDate fim;

    public void setPeriodo(LocalDate inicio, LocalDate fim) {
        if (inicio != null && fim != null && inicio.isBefore(fim)) { this.inicio=inicio; this.fim=fim; }
        else System.out.println("Período inválido.");
    }
    public LocalDate getInicio(){ return inicio; }
    public LocalDate getFim(){ return fim; }
    public static void main(String[] args){
        Periodo p=new Periodo(); p.setPeriodo(LocalDate.of(2026,9,1), LocalDate.of(2026,9,10));
        System.out.println(p.getInicio()+" até "+p.getFim());
    }
}
