public class Main {
    public static void main(String[] args) {
        Semaforo semaforo = new Semaforo();

        semaforo.cambiarRojo();
        System.out.println(semaforo.mostrarColor());
        semaforo.cambiarAmarillo();
        System.out.println(semaforo.mostrarColor());
        semaforo.cambiarVerde();
        System.out.println(semaforo.mostrarColor());

    }
}