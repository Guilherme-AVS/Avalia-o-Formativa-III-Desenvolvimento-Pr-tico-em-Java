public class Main { public static void main(String[] args){ NotificadorFake fake=new NotificadorFake(); new PedidoService(fake).confirmar("42"); System.out.println(fake.getUltima()); } }
