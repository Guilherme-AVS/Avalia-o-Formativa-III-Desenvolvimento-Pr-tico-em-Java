import java.util.*;
public class Pedido {
    private final String numero; private String status="ABERTO"; private final List<String> itens=new ArrayList<>();
    public Pedido(String numero){this.numero=numero;} public String getNumero(){return numero;} public String getStatus(){return status;}
    public List<String> getItens(){return new ArrayList<>(itens);}
    public void adicionarItem(String item){if(!"ENTREGUE".equals(status)&&item!=null&&!item.isBlank())itens.add(item.trim());}
    public boolean avancarStatus(){String novo=switch(status){case "ABERTO"->"PAGO";case "PAGO"->"ENVIADO";case "ENVIADO"->"ENTREGUE";default->status;};if(novo.equals(status))return false;status=novo;return true;}
    public static void main(String[] args){Pedido p=new Pedido("P1");p.adicionarItem("Livro");while(p.avancarStatus())System.out.println(p.getStatus());}
}
