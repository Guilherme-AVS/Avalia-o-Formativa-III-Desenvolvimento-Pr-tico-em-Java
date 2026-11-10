public class PedidoStatus {
    private String status="ABERTO";
    public String getStatus(){return status;}
    public boolean avancar(){
        if(status.equals("ABERTO")){status="PAGO";return true;}
        if(status.equals("PAGO")){status="ENVIADO";return true;}
        if(status.equals("ENVIADO")){status="ENTREGUE";return true;}
        return false;
    }
    public static void main(String[] args){PedidoStatus p=new PedidoStatus();while(p.avancar())System.out.println(p.getStatus());}
}
