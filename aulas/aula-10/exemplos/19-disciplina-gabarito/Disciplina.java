public class Disciplina {
    private String codigo,nome; private int cargaHoraria;
    public Disciplina(String codigo,String nome,int cargaHoraria){setCodigo(codigo);setNome(nome);setCargaHoraria(cargaHoraria);}
    public String getCodigo(){return codigo;} public void setCodigo(String c){if(c!=null&&c.matches("[A-Z]{3}\\d{3}"))codigo=c;}
    public String getNome(){return nome;} public void setNome(String n){if(n!=null&&!n.isBlank())nome=n.trim();}
    public int getCargaHoraria(){return cargaHoraria;} public void setCargaHoraria(int h){if(h>=30&&h<=120)cargaHoraria=h;}
    public String toString(){return codigo+" - "+nome+" ("+cargaHoraria+"h)";}
    public static void main(String[] args){System.out.println(new Disciplina("POO001","POO",60));}
}
