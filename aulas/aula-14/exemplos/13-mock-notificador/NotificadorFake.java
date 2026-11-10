public class NotificadorFake implements Notificavel { private String ultima; public void enviar(String m){ultima=m;} public String getUltima(){return ultima;} }
