public class ProcessadorMultas { public static double total(ItemBiblioteca[] itens,int dias){double total=0;for(ItemBiblioteca i:itens)total+=i.calcularMulta(dias);return total;} }
