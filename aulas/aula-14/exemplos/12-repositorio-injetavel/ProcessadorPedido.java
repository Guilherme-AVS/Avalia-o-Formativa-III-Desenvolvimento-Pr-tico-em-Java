public class ProcessadorPedido { private final Repositorio repositorio; public ProcessadorPedido(Repositorio r){repositorio=r;} public void processar(String pedido){repositorio.salvar(pedido);} }
