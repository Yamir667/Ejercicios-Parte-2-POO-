public class Main {
    public static void main(String[] args) {
       Reproductor rep = new Reproductor();

       rep.reproducir("Niño - Milo J");
       System.out.println(rep.estado());
       rep.pausar();
       System.out.println(rep.estado());
    }
}
