public class ExportadorCsv implements Exportavel { public byte[] exportar(){return "id,nome".getBytes();} public String getFormato(){return "CSV";} }
