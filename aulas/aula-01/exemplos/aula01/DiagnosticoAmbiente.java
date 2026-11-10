public class DiagnosticoAmbiente {
    public static void main(String[] args) {
        System.out.println("=== Diagnóstico do ambiente Java ===");
        System.out.println("Java: " + System.getProperty("java.version"));
        System.out.println("Vendor: " + System.getProperty("java.vendor"));
        System.out.println("Sistema operacional: " + System.getProperty("os.name"));
        System.out.println("Arquitetura: " + System.getProperty("os.arch"));
        System.out.println("Diretório de execução: " + System.getProperty("user.dir"));
    }
}
