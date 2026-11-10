public class Main { public static void main(String[] args){
    Funcionario[] equipe={new Gerente("Ana","111",5000,1500),new Vendedor("Carlos","222",3000,800),new Estagiario("Bia","333",1200)};
    for(Funcionario f:equipe){System.out.println(f);System.out.printf("Salário: %.2f%n",f.calcularSalario());}
} }
