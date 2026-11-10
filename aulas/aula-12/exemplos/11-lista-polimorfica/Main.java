import java.util.ArrayList;
import java.util.List;
public class Main { public static void main(String[] args) { List<Animal> zoologico = new ArrayList<>(); zoologico.add(new Cachorro()); zoologico.add(new Gato()); zoologico.add(new Passaro()); zoologico.add(new Cobra()); zoologico.forEach(Animal::emitirSom); } }
