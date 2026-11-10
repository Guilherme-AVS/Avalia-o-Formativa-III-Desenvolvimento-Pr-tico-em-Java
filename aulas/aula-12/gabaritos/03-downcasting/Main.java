public class Main { public static void main(String[] args){Instrumento[] b={new Violao(),new Flauta(),new Violao()};for(Instrumento i:b){i.tocar();if(i instanceof Violao v)v.afinar();}} }
