public interface Pagavel { double calcularValor(); String getDescricao(); default String gerarRecibo(){return getDescricao()+": R$ "+String.format("%.2f",calcularValor());} }
